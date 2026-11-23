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
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.qc;
import org.telegram.messenger.v3;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ob;
import org.telegram.ui.LaunchActivity;
public final class z implements y10 {
    public final int f58974a;
    public final Object f58975b;

    public z(Object obj, int i7) {
        this.f58974a = i7;
        this.f58975b = obj;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z10;
        float f10;
        float f11;
        int i7 = this.f58974a;
        Object obj2 = this.f58975b;
        switch (i7) {
            case 0:
                ((k0) obj2).z1((HashMap) obj);
                return;
            case 1:
                t1 t1Var = (t1) obj2;
                Boolean bool = (Boolean) obj;
                boolean e10 = qc.e(131072);
                if (t1Var.f58926e != e10) {
                    t1Var.f58926e = e10;
                    t1Var.invalidate();
                    return;
                }
                return;
            case 2:
                vh.g.e1((vh.g) obj2, (Pair) obj);
                return;
            case 3:
                gj gjVar = (gj) obj2;
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                TLRPC.MessageMedia messageMedia = gjVar.f24177k.media;
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
                long j3 = 1000 * gjVar.f24177k.date;
                g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    String b10 = wg.h.b(gjVar);
                    TLRPC.Chat O0 = np.u1(k10.f24932t0).O0(Long.valueOf(-gjVar.Z0()));
                    if (O0 != null && v3.V(O0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ob obVar = new ob(Q.getParentActivity(), Q.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        obVar.c(2131623982, 30, 30, new String[0]);
                        obVar.f38124b.setText(hd.N0(2131753368, null));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            obVar.c(2131624029, 30, 30, new String[0]);
                            obVar.f38124b.setText(hd.N0(2131753366, null));
                        } else {
                            obVar.c(2131623982, 30, 30, new String[0]);
                            obVar.f38124b.setText(hd.N0(2131753367, null));
                        }
                    }
                    obVar.f38124b.setSingleLine(false);
                    obVar.f38124b.setMaxLines(2);
                    ec ecVar = new ec(Q.getParentActivity(), Q.getResourceProvider(), true);
                    ecVar.e(hd.N0(2131748817, null));
                    ecVar.f34715b = new ai.e(payments_giveawayinfo, z10, b10, j3, tL_messageMediaGiveaway2, Q);
                    obVar.setButton(ecVar);
                    gc.g(Q, obVar, 2750).j();
                    return;
                }
                return;
            case 4:
                wg.q0 q0Var = (wg.q0) obj2;
                q0Var.W1.setLoading(false);
                wg.h.j(q0Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 5:
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
                if (m6.I.q()) {
                    f10 = 0.08f;
                } else {
                    f10 = 1.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f10);
                if (m6.I.q()) {
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
            case 6:
                HashMap hashMap = ((xg.b) obj2).f60489x;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 7:
                ((xg.e) obj2).F((TLObject) obj);
                return;
            default:
                HashMap hashMap2 = ((xg.h) obj2).f60515r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                return;
        }
    }
}
