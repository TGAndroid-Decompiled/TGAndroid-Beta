package ug;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.Pair;
import java.util.HashMap;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.qc;
import org.telegram.messenger.t3;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
public final class p1 implements z10 {
    public final int f58256a;
    public final Object f58257b;

    public p1(Object obj, int i7) {
        this.f58256a = i7;
        this.f58257b = obj;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z10;
        float f10;
        float f11;
        int i7 = this.f58256a;
        Object obj2 = this.f58257b;
        switch (i7) {
            case 0:
                s1 s1Var = (s1) obj2;
                Boolean bool = (Boolean) obj;
                boolean e10 = qc.e(131072);
                if (s1Var.f58333e != e10) {
                    s1Var.f58333e = e10;
                    s1Var.invalidate();
                    return;
                }
                return;
            case 1:
                vh.h.d1((vh.h) obj2, (Pair) obj);
                return;
            case 2:
                gj gjVar = (gj) obj2;
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                TLRPC.MessageMedia messageMedia = gjVar.f23819k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                    TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia;
                    tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                    tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                    tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                    tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                    tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                    tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                    if ((tL_messageMediaGiveawayResults.flags & 32) != 0) {
                        tL_messageMediaGiveaway.flags |= 32;
                        tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                    }
                } else {
                    tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                }
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
                long j3 = 1000 * gjVar.f23819k.date;
                e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    String b10 = wg.h.b(gjVar);
                    TLRPC.Chat M0 = np.s1(m10.f24940t0).M0(Long.valueOf(-gjVar.Z0()));
                    if (M0 != null && t3.V(M0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fb fbVar = new fb(Q.getParentActivity(), Q.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        fbVar.c(2131623982, 30, 30, new String[0]);
                        fbVar.f34556b.setText(hd.M0(2131753371, null));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            fbVar.c(2131624029, 30, 30, new String[0]);
                            fbVar.f34556b.setText(hd.M0(2131753369, null));
                        } else {
                            fbVar.c(2131623982, 30, 30, new String[0]);
                            fbVar.f34556b.setText(hd.M0(2131753370, null));
                        }
                    }
                    fbVar.f34556b.setSingleLine(false);
                    fbVar.f34556b.setMaxLines(2);
                    vb vbVar = new vb(Q.getParentActivity(), Q.getResourceProvider(), true);
                    vbVar.e(hd.M0(2131749010, null));
                    vbVar.f40372b = new ai.j(payments_giveawayinfo, z10, b10, j3, tL_messageMediaGiveaway2, Q);
                    fbVar.setButton(vbVar);
                    xb.g(Q, fbVar, 2750).j();
                    return;
                }
                return;
            case 3:
                wg.o0 o0Var = (wg.o0) obj2;
                o0Var.W1.setLoading(false);
                wg.h.j(o0Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 4:
                wh.h hVar = (wh.h) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Matrix matrix = hVar.L;
                if (hVar.U) {
                    hVar.J.recycle();
                    return;
                }
                hVar.J = bitmap;
                Bitmap bitmap2 = hVar.J;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                hVar.K = new BitmapShader(bitmap2, tileMode, tileMode);
                Paint paint = new Paint(2);
                hVar.M = paint;
                paint.setShader(hVar.K);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (j6.I.q()) {
                    f10 = 0.08f;
                } else {
                    f10 = 1.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f10);
                if (j6.I.q()) {
                    f11 = 0.02f;
                } else {
                    f11 = -0.15f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f11);
                hVar.M.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                matrix.reset();
                matrix.setScale(15.0f, 15.0f);
                hVar.K.setLocalMatrix(matrix);
                return;
            case 5:
                HashMap hashMap = ((xg.b) obj2).f59909x;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 6:
                ((xg.f) obj2).F((TLObject) obj);
                return;
            default:
                HashMap hashMap2 = ((xg.i) obj2).f59939r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                return;
        }
    }
}
