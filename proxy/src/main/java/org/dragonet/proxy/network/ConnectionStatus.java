package org.dragonet.proxy.network;

public enum ConnectionStatus {

	UNCONNECTED,
	AWAITING_CLIENT_AUTHENTICATION,
	CONNECTING_CLIENT,
	AWAITING_CLIENT_LOGIN,
	CONNECTING_SERVER,
	AWAITING_SERVER_LOGIN,
	CONNECTED;
}
