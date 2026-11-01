package sg;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.e20;
import org.telegram.messenger.jc;
import org.telegram.messenger.kj;
import org.telegram.messenger.tc;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.ky;
public final class d {
    public static int f48317m;
    public f5 f48318a;
    public Rect f48319b;
    public ArrayList f48320c;
    public View d;
    public long e;
    public boolean f48321f;
    public boolean f48322g;
    public int h;
    public boolean f48323i;
    public ImageReceiver f48324j;
    public int f48325k;
    public long f48326l;

    public static d a(f5 f5Var, boolean z10, boolean z11) {
        int i10 = e20.f15506s0;
        ?? obj = new Object();
        obj.f48319b = new Rect();
        obj.f48320c = new ArrayList();
        obj.f48322g = true;
        obj.f48325k = -1;
        obj.f48318a = f5Var;
        obj.f48321f = z10;
        obj.h = i10;
        obj.f48323i = z11;
        obj.e = System.currentTimeMillis();
        if (z11 && tc.e(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            obj.f48324j = imageReceiver;
            if (z10) {
                imageReceiver.f14369b = true;
            }
        }
        return obj;
    }

    public final void b(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: sg.d.b(android.graphics.Canvas):void");
    }

    public final boolean c() {
        if (System.currentTimeMillis() - this.e > 2500) {
            return true;
        }
        return false;
    }

    public final void d(View view) {
        this.f48318a.n(view);
        ImageReceiver imageReceiver = this.f48324j;
        if (imageReceiver != null) {
            imageReceiver.R();
            imageReceiver.f();
        }
    }

    public final void e(int i10, int i11, int i12, int i13) {
        Rect rect = this.f48319b;
        rect.set(i10, i11, i12, i13);
        ImageReceiver imageReceiver = this.f48324j;
        if (imageReceiver != null) {
            imageReceiver.z0(rect);
        }
    }

    public final void f(View view) {
        boolean z10;
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z12 = this.f48321f;
        int i10 = this.h;
        f5 f5Var = this.f48318a;
        f5Var.a(view);
        this.d = view;
        ImageReceiver imageReceiver = this.f48324j;
        if (imageReceiver != null && this.f48323i) {
            imageReceiver.P();
            TLRPC.Document document2 = f5Var.e;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            String V = kj.V(document2, null, null);
            if (V != null && (tL_availableReaction = (TLRPC.TL_availableReaction) vi.b0(i10).f18670r.get(V)) != null && (document = tL_availableReaction.around_animation) != null) {
                if (z12) {
                    StringBuilder sb2 = new StringBuilder();
                    int i11 = f48317m;
                    f48317m = i11 + 1;
                    imageReceiver.f14414v1 = a1.g.p(sb2, i11, " ");
                    int f7 = ky.f();
                    TLRPC.Document document3 = tL_availableReaction.around_animation;
                    z10 = true;
                    imageReceiver.q0(jc.b(tL_availableReaction.around_animation), f7 + "_" + f7 + "_pcache_compress", null, null, document3, 0);
                } else {
                    jc b10 = jc.b(document);
                    String a2 = k0.a();
                    TLRPC.Document document4 = tL_availableReaction.around_animation;
                    z10 = true;
                    imageReceiver.q0(b10, a2, null, null, document4, 0);
                }
                z11 = z10;
            } else {
                z10 = true;
                z11 = false;
            }
            if (!z11) {
                String str = e20.i(i10).f15514d0;
                if (str != null && (tL_messages_stickerSet = vi.b0(i10).p0(str)) == null) {
                    tL_messages_stickerSet = vi.b0(i10).n0(str);
                }
                if (tL_messages_stickerSet != null) {
                    if (this.f48325k < 0) {
                        this.f48325k = Math.abs(((int) Utilities.f14521c.nextLong()) % tL_messages_stickerSet.documents.size());
                    }
                    if (z12) {
                        StringBuilder sb3 = new StringBuilder();
                        int i12 = f48317m;
                        f48317m = i12 + 1;
                        imageReceiver.f14414v1 = a1.g.p(sb3, i12, " ");
                        int f10 = ky.f();
                        imageReceiver.q0(jc.b(tL_messages_stickerSet.documents.get(this.f48325k)), f10 + "_" + f10 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.f48325k), 0);
                    } else {
                        imageReceiver.q0(jc.b(tL_messages_stickerSet.documents.get(this.f48325k)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.f48325k), 0);
                    }
                    z11 = z10;
                }
            }
            if (z11) {
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, z10);
                }
                imageReceiver.W(0);
                return;
            }
            imageReceiver.w0(new ci0(2131623994, org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(60.0f), false, null));
        }
    }
}
