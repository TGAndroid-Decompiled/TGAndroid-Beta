package wh;

import android.content.Context;
import bi.ra;
import bi.rb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.fy0;
import xh.v5;
import zh.d8;
public final class s3 implements RequestDelegate {
    public final int f44347a;
    public final Object f44348b;
    public final Object f44349c;

    public s3(int i10, Object obj, Object obj2) {
        this.f44347a = i10;
        this.f44348b = obj;
        this.f44349c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44347a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sx0((Object) ((u3) this.f44348b), tLObject, (Object) ((TL_stars.getResaleStarGifts) this.f44349c), 26));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new sx0((Object) ((xh.h) this.f44348b), tLObject, (Object) ((Context) this.f44349c), 27));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new fy0((Object) ((xh.x3) this.f44348b), tLObject, (Object) ((sx0) this.f44349c), (Object) tL_error, 25));
                return;
            case 3:
                xh.x3.f1((xh.x3) this.f44348b, (TL_stars.InputSavedStarGift) this.f44349c, tLObject, tL_error);
                return;
            case 4:
                xh.x3.V0((xh.x3) this.f44348b, (org.telegram.ui.ActionBar.d2) this.f44349c, tLObject, tL_error);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new xh.n1((v5) this.f44348b, tLObject, tL_error, (Utilities.Callback) this.f44349c));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new xh.n1((v5) this.f44348b, tLObject, (Runnable) this.f44349c, 7));
                return;
            case 7:
                zh.t0 t0Var = (zh.t0) this.f44348b;
                TLRPC.Updates updates = (TLRPC.Updates) this.f44349c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(t0Var.e).processUpdates(updates, false);
                    return;
                }
                return;
            case 8:
                zh.v2 v2Var = (zh.v2) this.f44348b;
                rb rbVar = (rb) this.f44349c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(v2Var.f48986l.C2).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new ra(rbVar, 2));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new xh.n1((zh.s4) this.f44348b, tLObject, (Runnable) this.f44349c, 15));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new zh.r2((zh.w4) this.f44348b, tLObject, (Utilities.Callback) this.f44349c, tL_error, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xh.n1((d8) this.f44348b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f44349c, 17));
                return;
        }
    }
}
