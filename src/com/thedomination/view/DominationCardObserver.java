/**
 * 
 */
package com.thedomination.view;

import java.util.ArrayList;
import java.util.List;

import com.thedomination.model.CardsModel;


/**
 *
 * @author Pritam Kumar
 * @version 1.0
 */
public interface DominationCardObserver {
	

	void update(String playerName, List<String> listCards);
}
