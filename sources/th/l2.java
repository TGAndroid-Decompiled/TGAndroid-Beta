package th;

import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.eo;
import org.telegram.messenger.u10;
import org.telegram.messenger.vi;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.n31;
public final class l2 implements View.OnClickListener {
    public final int f49179a;
    public final u2 f49180b;

    public l2(u2 u2Var, int i10) {
        this.f49179a = i10;
        this.f49180b = u2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f49179a) {
            case 0:
                z2 z2Var = this.f49180b.f49526x;
                z2.c0(z2Var, z2Var.f49740k1);
                u2 u2Var = z2Var.f49710c1;
                if (u2Var != null) {
                    u2Var.a();
                    return;
                }
                return;
            case 1:
                z2 z2Var2 = this.f49180b.f49526x;
                z2.b0(z2Var2);
                u2 u2Var2 = z2Var2.f49710c1;
                if (u2Var2 != null) {
                    u2Var2.a();
                    return;
                }
                return;
            case 2:
                z2 z2Var3 = this.f49180b.f49526x;
                org.telegram.messenger.i0.g(z2Var3.f49790x1.e());
                z2.h0(z2Var3);
                u2 u2Var3 = z2Var3.f49710c1;
                if (u2Var3 != null) {
                    u2Var3.a();
                    return;
                }
                return;
            case 3:
                z2 z2Var4 = this.f49180b.f49526x;
                z2Var4.W0(false);
                u2 u2Var4 = z2Var4.f49710c1;
                if (u2Var4 != null) {
                    u2Var4.a();
                    return;
                }
                return;
            case 4:
                z2 z2Var5 = this.f49180b.f49526x;
                y2 y2Var = z2Var5.f49790x1;
                y2Var.f49675a.translated = false;
                r5 r5Var = wp.r1(z2Var5.f49744l2).O1().f48925k;
                TL_stories.StoryItem storyItem = y2Var.f49675a;
                r5Var.k(storyItem.dialogId, storyItem);
                z2Var5.n0();
                z2Var5.d1(false);
                u2 u2Var5 = z2Var5.f49710c1;
                if (u2Var5 != null) {
                    u2Var5.a();
                    return;
                }
                return;
            case 5:
                u2 u2Var6 = this.f49180b;
                z2 z2Var6 = u2Var6.f49526x;
                y2 y2Var2 = z2Var6.f49790x1;
                y2Var2.f49675a.translated = true;
                z2Var6.n0();
                v2 v2Var = z2Var6.f49797z1;
                if (v2Var != null) {
                    o7 o7Var = ((f7) v2Var).d;
                    o7Var.Z0 = true;
                    o7Var.d0();
                }
                r5 r5Var2 = wp.r1(z2Var6.f49744l2).O1().f48925k;
                TL_stories.StoryItem storyItem2 = y2Var2.f49675a;
                r5Var2.k(storyItem2.dialogId, storyItem2);
                long currentTimeMillis = System.currentTimeMillis();
                o2 o2Var = new o2(u2Var6, 1);
                u10 u10Var = wp.r1(z2Var6.f49744l2).f19253t7;
                TL_stories.StoryItem storyItem3 = y2Var2.f49675a;
                bi.e eVar = new bi.e(o2Var, currentTimeMillis, 25);
                HashSet hashSet = u10Var.J;
                if (storyItem3 != null) {
                    Object obj = new Object();
                    String M0 = n31.M0();
                    if (storyItem3.translatedText != null && TextUtils.equals(storyItem3.translatedLng, M0)) {
                        eVar.run();
                    } else if (hashSet.contains(obj)) {
                        eVar.run();
                    } else {
                        hashSet.add(obj);
                        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                        tL_messages_translateText.flags |= 2;
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        tL_textWithEntities.text = storyItem3.caption;
                        tL_textWithEntities.entities = storyItem3.entities;
                        tL_messages_translateText.text.add(tL_textWithEntities);
                        tL_messages_translateText.to_lang = u10.D(M0);
                        u10Var.getConnectionsManager().sendRequest(tL_messages_translateText, new eo(u10Var, storyItem3, M0, obj, eVar, tL_textWithEntities, 1));
                    }
                }
                z2Var6.d1(false);
                z2Var6.Q2 = true;
                z2Var6.f49773t0.E(true);
                u2 u2Var7 = z2Var6.f49710c1;
                if (u2Var7 != null) {
                    u2Var7.a();
                    return;
                }
                return;
            case 6:
                z2 z2Var7 = this.f49180b.f49526x;
                d5 d5Var = z2Var7.f49790x1.f49676b;
                if (d5Var != null) {
                    d5Var.a();
                    z2Var7.h1();
                }
                u2 u2Var8 = z2Var7.f49710c1;
                if (u2Var8 != null) {
                    u2Var8.a();
                    return;
                }
                return;
            case 7:
                z2 z2Var8 = this.f49180b.f49526x;
                z2.b0(z2Var8);
                u2 u2Var9 = z2Var8.f49710c1;
                if (u2Var9 != null) {
                    u2Var9.a();
                    return;
                }
                return;
            case 8:
                z2 z2Var9 = this.f49180b.f49526x;
                org.telegram.messenger.i0.g(z2Var9.f49790x1.e());
                z2.h0(z2Var9);
                u2 u2Var10 = z2Var9.f49710c1;
                if (u2Var10 != null) {
                    u2Var10.a();
                    return;
                }
                return;
            case 9:
                z2 z2Var10 = this.f49180b.f49526x;
                z2Var10.W0(false);
                u2 u2Var11 = z2Var10.f49710c1;
                if (u2Var11 != null) {
                    u2Var11.a();
                    return;
                }
                return;
            case 10:
                s0 s0Var = s0.W;
                if (s0Var != null && s0Var.f49437n) {
                    long j10 = s0Var.J;
                    boolean z10 = !s0Var.I;
                    s0Var.I = z10;
                    NativeInstance.switchCameraCapturer(j10, z10);
                }
                u2 u2Var12 = this.f49180b.f49526x.f49710c1;
                if (u2Var12 != null) {
                    u2Var12.a();
                    return;
                }
                return;
            case 11:
                this.f49180b.f49526x.f49748m3.b();
                return;
            case 12:
                this.f49180b.f49526x.f49752n3.b();
                return;
            case 13:
                z2 z2Var11 = this.f49180b.f49526x;
                z2.d0(z2Var11);
                u2 u2Var13 = z2Var11.f49710c1;
                if (u2Var13 != null) {
                    u2Var13.a();
                    return;
                }
                return;
            case 14:
                z2 z2Var12 = this.f49180b.f49526x;
                vi.b0(z2Var12.f49744l2).N1(z2Var12.f49740k1);
                z2Var12.B1.l0(z2Var12.f49740k1, true, false);
                u2 u2Var14 = z2Var12.f49710c1;
                if (u2Var14 != null) {
                    u2Var14.a();
                    return;
                }
                return;
            default:
                z2 z2Var13 = this.f49180b.f49526x;
                z2.c0(z2Var13, z2Var13.f49740k1);
                u2 u2Var15 = z2Var13.f49710c1;
                if (u2Var15 != null) {
                    u2Var15.a();
                    return;
                }
                return;
        }
    }
}
