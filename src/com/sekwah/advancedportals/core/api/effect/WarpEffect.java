package com.sekwah.advancedportals.core.api.effect;

import com.sekwah.advancedportals.core.api.portal.Portal;
import com.sekwah.advancedportals.core.data.PortalLocation;
import com.sekwah.advancedportals.coreconnector.container.PlayerContainer;

/**
 * Effects to be registered to the list.
 * <p>
 * Fires once at each end.
 * <p>
 * Can be a Visual effect or a Sound. Just register to the correct one
 *
 * @author sekwah41
 */
public interface WarpEffect {

    void onWarp(PlayerContainer player, PortalLocation loc, Action action, Portal portal);

    Type getType();

    enum Action {
        ENTER,
        EXIT;
    }

    enum Type {
        SOUND,
        VISUAL;
    }

}
