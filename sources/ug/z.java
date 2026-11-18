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
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.pc;
import org.telegram.messenger.v3;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ob;
import org.telegram.ui.LaunchActivity;
public final class z implements x10 {
    public final int f58956a;
    public final Object f58957b;

    public z(Object obj, int i7) {
        this.f58956a = i7;
        this.f58957b = obj;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z10;
        float f10;
        float f11;
        int i7 = this.f58956a;
        Object obj2 = this.f58957b;
        switch (i7) {
            case 0:
                ((l0) obj2).z1((HashMap) obj);
                return;
            case 1:
                u1 u1Var = (u1) obj2;
                Boolean bool = (Boolean) obj;
                boolean e10 = pc.e(131072);
                if (u1Var.f58923e != e10) {
                    u1Var.f58923e = e10;
                    u1Var.invalidate();
                    return;
                }
                return;
            case 2:
                vh.g.e1((vh.g) obj2, (Pair) obj);
                return;
            case 3:
                fj fjVar = (fj) obj2;
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                TLRPC.MessageMedia messageMedia = fjVar.f23965k.media;
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
                long j3 = 1000 * fjVar.f23965k.date;
                h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    String b10 = wg.h.b(fjVar);
                    TLRPC.Chat O0 = mp.u1(j10.f24770t0).O0(Long.valueOf(-fjVar.Z0()));
                    if (O0 != null && v3.V(O0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ob obVar = new ob(Q.getParentActivity(), Q.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        obVar.c(2131623982, 30, 30, new String[0]);
                        obVar.f38055b.setText(gd.M0(2131753369, null));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            obVar.c(2131624029, 30, 30, new String[0]);
                            obVar.f38055b.setText(gd.M0(2131753367, null));
                        } else {
                            obVar.c(2131623982, 30, 30, new String[0]);
                            obVar.f38055b.setText(gd.M0(2131753368, null));
                        }
                    }
                    obVar.f38055b.setSingleLine(false);
                    obVar.f38055b.setMaxLines(2);
                    ec ecVar = new ec(Q.getParentActivity(), Q.getResourceProvider(), true);
                    ecVar.e(gd.M0(2131748818, null));
                    ecVar.f34666b = new ai.n(payments_giveawayinfo, z10, b10, j3, tL_messageMediaGiveaway2, Q);
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
                if (n6.I.q()) {
                    f10 = 0.08f;
                } else {
                    f10 = 1.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f10);
                if (n6.I.q()) {
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
                HashMap hashMap = ((xg.b) obj2).f60479x;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 7:
                ((xg.e) obj2).F((TLObject) obj);
                return;
            default:
                HashMap hashMap2 = ((xg.h) obj2).f60505r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                return;
        }
    }
}
