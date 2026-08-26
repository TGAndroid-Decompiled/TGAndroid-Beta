package org.telegram.ui.web;

import android.webkit.ValueCallback;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

public final class WebInstantView$$ExternalSyntheticLambda3 implements ValueCallback {
    public final int $r8$classId;
    public final WebInstantView f$0;
    public final BotWebViewContainer.MyWebView f$1;
    public final File f$2;
    public final WebInstantView$$ExternalSyntheticLambda0 f$3;

    public WebInstantView$$ExternalSyntheticLambda3(WebInstantView webInstantView, BotWebViewContainer.MyWebView myWebView, File file, WebInstantView$$ExternalSyntheticLambda0 webInstantView$$ExternalSyntheticLambda0, int i) {
        this.$r8$classId = i;
        this.f$0 = webInstantView;
        this.f$1 = myWebView;
        this.f$2 = file;
        this.f$3 = webInstantView$$ExternalSyntheticLambda0;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                WebInstantView webInstantView = this.f$0;
                File file = this.f$2;
                String absolutePath = file.getAbsolutePath();
                WebInstantView$$ExternalSyntheticLambda0 webInstantView$$ExternalSyntheticLambda0 = this.f$3;
                BotWebViewContainer.MyWebView myWebView = this.f$1;
                myWebView.saveWebArchive(absolutePath, false, new WebInstantView$$ExternalSyntheticLambda3(webInstantView, myWebView, file, webInstantView$$ExternalSyntheticLambda0, 1));
                break;
            default:
                File file2 = this.f$2;
                WebInstantView$$ExternalSyntheticLambda0 webInstantView$$ExternalSyntheticLambda1 = this.f$3;
                WebInstantView webInstantView2 = this.f$0;
                this.f$1.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new WebInstantView$$ExternalSyntheticLambda7(0));
                try {
                    MHTML mhtml = new MHTML(file2);
                    webInstantView2.mhtml = mhtml;
                    if (!((ArrayList) mhtml.entries).isEmpty()) {
                        webInstantView$$ExternalSyntheticLambda1.run(((MHTML.Entry) ((ArrayList) webInstantView2.mhtml.entries).get(0)).getInputStream());
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                webInstantView$$ExternalSyntheticLambda1.run(null);
                break;
        }
    }
}
