package chap02_04_04;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import chap02_04_03.SearchClientFactory;
import chap02_04_03.SearchDocument;

@Component
public class ProductService {

	private SearchClientFactory searchClientFactory;

	@Resource(name = "productSearchClientFactory")
	public void setSearchClientFactory(SearchClientFactory searchClientFactory) {
		this.searchClientFactory = searchClientFactory;
	}

	public void createProduct(ProductInfo pi) {
		searchClientFactory.create().addDocument(toSearchDocument(pi));
	}

	private SearchDocument toSearchDocument(ProductInfo pi) {
		return new SearchDocument();
	}
}
