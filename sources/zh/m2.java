package zh;

import android.view.View;
import bi.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;
public final class m2 implements View.OnClickListener {
    public final int f48681a;
    public final v2 f48682b;

    public m2(v2 v2Var, int i10) {
        this.f48681a = i10;
        this.f48682b = v2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48681a) {
            case 0:
                a3 a3Var = this.f48682b.f48986l;
                a3.e0(a3Var, a3Var.B1);
                v2 v2Var = a3Var.f48211t1;
                if (v2Var != null) {
                    v2Var.a();
                    return;
                }
                return;
            case 1:
                a3 a3Var2 = this.f48682b.f48986l;
                a3.d0(a3Var2);
                v2 v2Var2 = a3Var2.f48211t1;
                if (v2Var2 != null) {
                    v2Var2.a();
                    return;
                }
                return;
            case 2:
                a3 a3Var3 = this.f48682b.f48986l;
                AndroidUtilities.addToClipboard(a3Var3.O1.e());
                a3.j0(a3Var3);
                v2 v2Var3 = a3Var3.f48211t1;
                if (v2Var3 != null) {
                    v2Var3.a();
                    return;
                }
                return;
            case 3:
                a3 a3Var4 = this.f48682b.f48986l;
                a3Var4.Y0(false);
                v2 v2Var4 = a3Var4.f48211t1;
                if (v2Var4 != null) {
                    v2Var4.a();
                    return;
                }
                return;
            case 4:
                a3 a3Var5 = this.f48682b.f48986l;
                z2 z2Var = a3Var5.O1;
                z2Var.f49129a.translated = false;
                v5 v5Var = MessagesController.getInstance(a3Var5.C2).getStoriesController().f48506k;
                TL_stories.StoryItem storyItem = z2Var.f49129a;
                v5Var.k(storyItem.dialogId, storyItem);
                a3Var5.p0();
                a3Var5.f1(false);
                v2 v2Var5 = a3Var5.f48211t1;
                if (v2Var5 != null) {
                    v2Var5.a();
                    return;
                }
                return;
            case 5:
                v2 v2Var6 = this.f48682b;
                a3 a3Var6 = v2Var6.f48986l;
                z2 z2Var2 = a3Var6.O1;
                z2Var2.f49129a.translated = true;
                a3Var6.p0();
                w2 w2Var = a3Var6.Q1;
                if (w2Var != null) {
                    u7 u7Var = ((l7) w2Var).d;
                    u7Var.Z0 = true;
                    u7Var.P();
                }
                v5 v5Var2 = MessagesController.getInstance(a3Var6.C2).getStoriesController().f48506k;
                TL_stories.StoryItem storyItem2 = z2Var2.f49129a;
                v5Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(a3Var6.C2).getTranslateController().translateStory(z2Var2.f49129a, new va(new p2(v2Var6, 1), System.currentTimeMillis(), 29));
                a3Var6.f1(false);
                a3Var6.f48179h3 = true;
                a3Var6.K0.D(true);
                v2 v2Var7 = a3Var6.f48211t1;
                if (v2Var7 != null) {
                    v2Var7.a();
                    return;
                }
                return;
            case 6:
                a3 a3Var7 = this.f48682b.f48986l;
                h5 h5Var = a3Var7.O1.f49130b;
                if (h5Var != null) {
                    h5Var.a();
                    a3Var7.j1();
                }
                v2 v2Var8 = a3Var7.f48211t1;
                if (v2Var8 != null) {
                    v2Var8.a();
                    return;
                }
                return;
            case 7:
                a3 a3Var8 = this.f48682b.f48986l;
                a3.d0(a3Var8);
                v2 v2Var9 = a3Var8.f48211t1;
                if (v2Var9 != null) {
                    v2Var9.a();
                    return;
                }
                return;
            case 8:
                a3 a3Var9 = this.f48682b.f48986l;
                AndroidUtilities.addToClipboard(a3Var9.O1.e());
                a3.j0(a3Var9);
                v2 v2Var10 = a3Var9.f48211t1;
                if (v2Var10 != null) {
                    v2Var10.a();
                    return;
                }
                return;
            case 9:
                a3 a3Var10 = this.f48682b.f48986l;
                a3Var10.Y0(false);
                v2 v2Var11 = a3Var10.f48211t1;
                if (v2Var11 != null) {
                    v2Var11.a();
                    return;
                }
                return;
            case 10:
                t0 t0Var = t0.W;
                if (t0Var != null && t0Var.f48882n) {
                    long j3 = t0Var.J;
                    boolean z10 = !t0Var.I;
                    t0Var.I = z10;
                    NativeInstance.switchCameraCapturer(j3, z10);
                }
                v2 v2Var12 = this.f48682b.f48986l.f48211t1;
                if (v2Var12 != null) {
                    v2Var12.a();
                    return;
                }
                return;
            case 11:
                this.f48682b.f48986l.D3.b();
                return;
            case 12:
                this.f48682b.f48986l.E3.b();
                return;
            case 13:
                a3 a3Var11 = this.f48682b.f48986l;
                a3.f0(a3Var11);
                v2 v2Var13 = a3Var11.f48211t1;
                if (v2Var13 != null) {
                    v2Var13.a();
                    return;
                }
                return;
            case 14:
                a3 a3Var12 = this.f48682b.f48986l;
                MediaDataController.getInstance(a3Var12.C2).removePeer(a3Var12.B1);
                a3Var12.S1.i0(a3Var12.B1, true, false);
                v2 v2Var14 = a3Var12.f48211t1;
                if (v2Var14 != null) {
                    v2Var14.a();
                    return;
                }
                return;
            default:
                a3 a3Var13 = this.f48682b.f48986l;
                a3.e0(a3Var13, a3Var13.B1);
                v2 v2Var15 = a3Var13.f48211t1;
                if (v2Var15 != null) {
                    v2Var15.a();
                    return;
                }
                return;
        }
    }
}
