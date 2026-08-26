package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class WebInstantView$Loader$$ExternalSyntheticLambda0 implements Utilities.Callback {
    public final int $r8$classId;
    public final WebInstantView.Loader f$0;

    public WebInstantView$Loader$$ExternalSyntheticLambda0(WebInstantView.Loader loader, int i) {
        this.$r8$classId = i;
        this.f$0 = loader;
    }

    @Override
    public final void run(Object obj) {
        WebInstantView webInstantView = (WebInstantView) obj;
        switch (this.$r8$classId) {
            case 0:
                WebInstantView.Loader loader = this.f$0;
                loader.cancelLocal = null;
                loader.gotLocal = true;
                TLRPC.TL_webPage tL_webPage = loader.localPage;
                if (tL_webPage != null) {
                    WebInstantView.recycle(tL_webPage);
                }
                loader.localPage = webInstantView.webpage;
                ArrayList arrayList = loader.listeners;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((Runnable) obj2).run();
                }
                break;
            default:
                WebInstantView.Loader loader2 = this.f$0;
                loader2.cancelLocal = null;
                loader2.gotLocal = true;
                TLRPC.TL_webPage tL_webPage2 = loader2.localPage;
                if (tL_webPage2 != null) {
                    WebInstantView.recycle(tL_webPage2);
                }
                loader2.localPage = webInstantView.webpage;
                ArrayList arrayList2 = loader2.listeners;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    ((Runnable) obj3).run();
                }
                break;
        }
    }
}
