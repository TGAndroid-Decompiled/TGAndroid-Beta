package org.telegram.ui.web;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.iv.RichEditorHistory;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;

public final class AddressBarList$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public AddressBarList$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((AddressBarList) this.f$0).listView.adapter.update(true);
                break;
            case 1:
                ((RichEditorHistory) this.f$0).commit();
                break;
            case 2:
                AddressBarList.BookmarksList bookmarksList = BookmarksFragment.this.searchList;
                if (bookmarksList != null) {
                    bookmarksList.load();
                }
                break;
            case 3:
                ((EditTextCaption) this.f$0).requestFocus();
                break;
            case 4:
                Browser.openUrl(BotWebViewContainer.MyWebView.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 5:
                HistoryFragment.AnonymousClass2 anonymousClass2 = (HistoryFragment.AnonymousClass2) this.f$0;
                anonymousClass2.getClass();
                Utilities.searchQueue.postRunnable(new EglRenderer$$ExternalSyntheticLambda6(anonymousClass2, new ArrayList(HistoryFragment.this.history), HistoryFragment.this.query, 21));
                break;
            case 6:
                ((HttpGetFileTask) this.f$0).progressCallback.run(Float.valueOf(1.0f));
                break;
            case 7:
                ((WebActionBar.ForwardDrawable) this.f$0).invalidateSelf();
                break;
            case 8:
                WebBrowserSettings webBrowserSettings = (WebBrowserSettings) this.f$0;
                webBrowserSettings.getClass();
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += WebBrowserSettings.getDirectorySize(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += WebBrowserSettings.getDirectorySize(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                AndroidUtilities.runOnUIThread(new WebBrowserSettings$$ExternalSyntheticLambda10(webBrowserSettings, length, file3.exists() ? WebBrowserSettings.getDirectorySize(file3, Boolean.TRUE) : 0L, 0));
                break;
            default:
                ((boolean[]) this.f$0)[0] = true;
                break;
        }
    }
}
