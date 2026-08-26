package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.Components.UniversalRecyclerView;

public final class WebActionBar$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public WebActionBar$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        AddressBarList$$ExternalSyntheticLambda4 addressBarList$$ExternalSyntheticLambda4;
        switch (this.$r8$classId) {
            case 0:
                WebActionBar.lambda$new$2((ActionBarMenuSubItem) this.f$0, (WebInstantView.Loader) this.f$1);
                break;
            case 1:
                BotWebViewContainer.lambda$onEventReceived$47((BotWebViewContainer.BotWebViewProxy) this.f$0, (ArrayList) this.f$1);
                break;
            case 2:
                ArrayList arrayList = BrowserHistory.history;
                int i = 0;
                ArrayList arrayList2 = (ArrayList) this.f$0;
                arrayList.addAll(0, arrayList2);
                int i2 = 0;
                while (true) {
                    LongSparseArray longSparseArray = (LongSparseArray) this.f$1;
                    if (i2 >= longSparseArray.size()) {
                        BrowserHistory.historyLoaded = true;
                        BrowserHistory.historyLoading = false;
                        ArrayList arrayList3 = BrowserHistory.callbacks;
                        if (arrayList3 != null) {
                            int size = arrayList3.size();
                            while (i < size) {
                                Object obj = arrayList3.get(i);
                                i++;
                                ((Utilities.Callback) obj).run(arrayList2);
                            }
                            BrowserHistory.callbacks = null;
                        }
                    } else {
                        BrowserHistory.historyById.put(longSparseArray.keyAt(i2), (BrowserHistory.Entry) longSparseArray.valueAt(i2));
                        i2++;
                    }
                    break;
                }
                break;
            case 3:
                HistoryFragment historyFragment = HistoryFragment.this;
                historyFragment.searchResults.clear();
                historyFragment.searchResults.addAll((ArrayList) this.f$1);
                historyFragment.searchLoading = false;
                UniversalRecyclerView universalRecyclerView = historyFragment.listView;
                if (universalRecyclerView != null) {
                    universalRecyclerView.adapter.update(true);
                }
                break;
            case 4:
                ((WebActionBar) this.f$0).lambda$new$0((Integer) this.f$1);
                break;
            case 5:
                WebBrowserSettings webBrowserSettings = (WebBrowserSettings) this.f$0;
                webBrowserSettings.getMessagesController().removeWebBrowserException((String) this.f$1);
                webBrowserSettings.listView.adapter.update(true);
                break;
            case 6:
                WebInstantView.Loader loader = (WebInstantView.Loader) this.f$1;
                loader.gotRemote = true;
                TLObject tLObject = (TLObject) this.f$0;
                int i3 = 0;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    int i4 = loader.currentAccount;
                    MessagesController.getInstance(i4).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i4).putChats(tL_messages_webPage.chats, false);
                    loader.remotePage = tL_messages_webPage.webpage;
                } else if (tLObject instanceof TLRPC.TL_webPage) {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                    if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                        loader.remotePage = tL_webPage;
                    } else {
                        loader.remotePage = null;
                    }
                } else {
                    loader.remotePage = null;
                }
                TLRPC.WebPage webPage = loader.remotePage;
                if (webPage != null && webPage.cached_page == null) {
                    loader.remotePage = null;
                }
                if (!SharedConfig.onlyLocalInstantView && loader.remotePage != null && (addressBarList$$ExternalSyntheticLambda4 = loader.cancelLocal) != null) {
                    addressBarList$$ExternalSyntheticLambda4.run();
                }
                ArrayList arrayList4 = loader.listeners;
                int size2 = arrayList4.size();
                while (i3 < size2) {
                    Object obj2 = arrayList4.get(i3);
                    i3++;
                    ((Runnable) obj2).run();
                }
                break;
            default:
                ((WebInstantView.Loader) this.f$1).listeners.remove((WebActionBar$$ExternalSyntheticLambda0) this.f$0);
                break;
        }
    }

    public WebActionBar$$ExternalSyntheticLambda0(WebInstantView.Loader loader, Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = loader;
        this.f$0 = obj;
    }
}
