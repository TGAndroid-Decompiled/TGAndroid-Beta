package t7;

import android.media.MediaDrmException;
import android.text.style.CharacterStyle;
import android.util.Log;
import b2.w;
import c3.a0;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnFailureListener;
import gi.b4;
import j$.util.Objects;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.b1;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.vl;
import org.telegram.ui.Components.y5;
import org.telegram.ui.xu0;
import si.o0;
public class u implements c3.g, cg.a, dg.a, ea.c, g2.g, gb.n, pi, n5.b, n2.r, r9.d, rb, k1, r4.c, OnFailureListener, y9.c, z3.k {
    public static u f47343b;
    public final int f47344a;

    public u(int i10) {
        this.f47344a = i10;
    }

    public static ea.a F0(u uVar) {
        return new ea.a(System.currentTimeMillis() + 3600000, new com.google.android.gms.internal.cast.a(8), new bc.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static short L3(short s10, short s11) {
        int i10;
        int i11 = s10 + 32768;
        int i12 = s11 + 32768;
        int i13 = 65535;
        if (i11 >= 32768 && i12 >= 32768) {
            i10 = (((i11 + i12) * 2) - ((i11 * i12) / 32768)) - 65535;
        } else {
            i10 = (i11 * i12) / 32768;
        }
        if (i10 != 65536) {
            i13 = i10;
        }
        return (short) (i13 - 32768);
    }

    @Override
    public void A(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public void A0(t1 t1Var, float f7, float f10) {
        int i10 = this.f47344a;
    }

    @Override
    public void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f47344a;
    }

    @Override
    public void B(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public boolean B0(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean B1() {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public h2.b C(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void C0(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f47344a;
    }

    @Override
    public void D0(sb sbVar, db dbVar, ng ngVar, vl vlVar) {
        sbVar.setInOutOffset(sbVar.getMeasuredHeight());
        vlVar.accept(Float.valueOf(sbVar.getTranslationY()));
        o1.k kVar = new o1.k(sbVar, sb.IN_OUT_OFFSET_Y, 0.0f);
        kVar.f17622u.a(0.8f);
        kVar.f17622u.b(400.0f);
        kVar.a(new b4(1, sbVar, ngVar));
        kVar.b(new qb(vlVar, sbVar, 1));
        kVar.h();
        dbVar.run();
    }

    @Override
    public void D1(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public void E0(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public int E1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override
    public void F(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public void F1(MessageObject messageObject) {
        int i10 = this.f47344a;
    }

    @Override
    public void G(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f47344a;
    }

    @Override
    public void G0(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f47344a) {
            case 17:
            default:
                pf.d.r(t1Var.getContext(), str);
                return;
        }
    }

    @Override
    public byte[] H() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public CharacterStyle H1(t1 t1Var) {
        switch (this.f47344a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void I(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f47344a;
    }

    @Override
    public boolean J0(long j10) {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean J1(t1 t1Var, MessageObject messageObject) {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(int i10, t1 t1Var) {
        int i11 = this.f47344a;
    }

    @Override
    public void K0(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public void K1(t1 t1Var, ah.t tVar) {
        int i10 = this.f47344a;
    }

    public boolean K3(CharSequence charSequence) {
        return false;
    }

    @Override
    public int L(w wVar) {
        String str = wVar.f4135s;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                    return 1;
                case 6:
                    return 2;
                case 7:
                case '\b':
                    return 1;
            }
        }
        throw new IllegalArgumentException(o0.h("Unsupported MIME type: ", str));
    }

    @Override
    public void L1() {
        int i10 = this.f47344a;
    }

    @Override
    public void M(MessageObject messageObject) {
        int i10 = this.f47344a;
    }

    @Override
    public void M0(int i10, t1 t1Var) {
        int i11 = this.f47344a;
    }

    @Override
    public void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f47344a;
    }

    @Override
    public boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f47344a;
    }

    @Override
    public void O0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f47344a;
    }

    @Override
    public boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P() {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(L3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public xu0 P1() {
        switch (this.f47344a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Q(t1 t1Var) {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Q1(long j10) {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R() {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f47344a;
    }

    @Override
    public void R1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f47344a;
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f47344a;
    }

    @Override
    public boolean S0(t1 t1Var, boolean z10) {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean S1(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void T(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public void T0(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public void U(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void U1(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public int V() {
        switch (this.f47344a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void V0(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public ih.a W() {
        switch (this.f47344a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void W1(t1 t1Var, long j10) {
        int i10 = this.f47344a;
    }

    @Override
    public boolean Z(t1 t1Var) {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Z0(int i10, t1 t1Var) {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean a0(w wVar) {
        String str = wVar.f4135s;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override
    public Map b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean b2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c(sb sbVar, db dbVar, bb bbVar, eb ebVar) {
        o1.k kVar = new o1.k(sbVar, sb.IN_OUT_OFFSET_Y, sbVar.getHeight());
        kVar.f17622u.a(0.8f);
        kVar.f17622u.b(400.0f);
        kVar.a(new fb(bbVar, 1));
        kVar.b(new qb(ebVar, sbVar, 0));
        kVar.h();
        dbVar.run();
    }

    @Override
    public boolean c0(t1 t1Var, TLRPC.User user) {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c2(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public g2.h createDataSource() {
        return new g2.c(false);
    }

    @Override
    public String d() {
        return null;
    }

    @Override
    public void d0(int i10) {
        int i11 = this.f47344a;
    }

    @Override
    public boolean d1(MessageObject messageObject) {
        int i10 = this.f47344a;
        return b1.a(messageObject);
    }

    @Override
    public boolean e() {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e0() {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean f() {
        switch (this.f47344a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void f0(t1 t1Var, float f7, float f10) {
        int i10 = this.f47344a;
    }

    @Override
    public void f1() {
        int i10 = this.f47344a;
    }

    @Override
    public Object f2() {
        return new ConcurrentSkipListMap();
    }

    @Override
    public String g(t1 t1Var) {
        switch (this.f47344a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public byte[] g0(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void g2() {
        int i10 = this.f47344a;
    }

    @Override
    public Object mo27get() {
        return new l5.q(Executors.newSingleThreadExecutor());
    }

    @Override
    public int h0(t1 t1Var) {
        switch (this.f47344a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void h1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f47344a;
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f47344a;
    }

    @Override
    public void i0(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public void i2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f47344a;
    }

    @Override
    public void j() {
        int i10 = this.f47344a;
    }

    @Override
    public void j0(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public Object j2(z5 z5Var) {
        switch (this.f47344a) {
            case 15:
                rb.a aVar = new rb.a();
                androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(7);
                ReferenceQueue referenceQueue = aVar.f45598a;
                Set set = aVar.f45599b;
                set.add(new rb.l(aVar, referenceQueue, set, nVar));
                Thread thread = new Thread(new j9.u(25, referenceQueue, set), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return aVar;
            default:
                return new Object();
        }
    }

    @Override
    public n2.p k0(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public void k1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.f47344a;
    }

    @Override
    public void l(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f47344a;
    }

    @Override
    public boolean l0() {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean l2(int i10) {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void m(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public int m0() {
        return 1;
    }

    @Override
    public void n() {
        int i10 = this.f47344a;
    }

    @Override
    public void n0(String str) {
        int i10 = this.f47344a;
    }

    @Override
    public void n2() {
        int i10 = this.f47344a;
    }

    @Override
    public n2.q o() {
        throw new IllegalStateException();
    }

    @Override
    public boolean o0(y5 y5Var) {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void o2(t1 t1Var, int i10, int i11) {
        int i12 = this.f47344a;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override
    public void p(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public void p1(t1 t1Var, float f7, float f10) {
        int i10 = this.f47344a;
    }

    @Override
    public p9 p2() {
        switch (this.f47344a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void q() {
        int i10 = this.f47344a;
    }

    @Override
    public void q0(t1 t1Var, float f7, float f10) {
        int i10 = this.f47344a;
    }

    @Override
    public void r(eh ehVar) {
        ehVar.run();
    }

    @Override
    public void s(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public ea.a s0(u uVar, JSONObject jSONObject) {
        return F0(uVar);
    }

    @Override
    public void t(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public boolean u() {
        return false;
    }

    @Override
    public void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f47344a;
    }

    @Override
    public void v0(t1 t1Var, float f7, float f10, boolean z10) {
        int i10 = this.f47344a;
    }

    @Override
    public boolean v1() {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String w(long j10) {
        switch (this.f47344a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        switch (this.f47344a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void w1(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public void x0(t1 t1Var) {
        int i10 = this.f47344a;
    }

    @Override
    public void x1(t1 t1Var, boolean z10) {
        int i10 = this.f47344a;
    }

    @Override
    public z3.m y(w wVar) {
        String str = wVar.f4135s;
        List list = wVar.v;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new b4.i(list);
                case 1:
                    return new qi.e(2);
                case 2:
                    return new a0(1);
                case 3:
                    return new n4.s(23);
                case 4:
                    return new g4.a(list);
                case 5:
                    return new d4.a(list);
                case 6:
                    return new h4.b(list);
                case 7:
                    return new e4.a();
                case '\b':
                    return new f4.d();
            }
        }
        throw new IllegalArgumentException(o0.h("Unsupported MIME type: ", str));
    }

    @Override
    public void y0() {
        int i10 = this.f47344a;
    }

    @Override
    public void z(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            dg.a.f8002t.z(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            dg.a.f8001q.z(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public void z0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f47344a;
    }

    @Override
    public boolean z1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.f47344a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    private final void C2() {
    }

    private final void D2() {
    }

    private final void I3() {
    }

    private final void J3() {
    }

    private final void O3() {
    }

    private final void P3() {
    }

    private final void Q0() {
    }

    private final void S3() {
    }

    private final void T3() {
    }

    private final void U0() {
    }

    private final void W3() {
    }

    private final void X3() {
    }

    private final void a3() {
    }

    private final void b1() {
    }

    private final void b3() {
    }

    private final void c1() {
    }

    @Override
    public void E() {
    }

    @Override
    public void J() {
    }

    @Override
    public void a() {
    }

    @Override
    public void release() {
    }

    @Override
    public void v() {
    }

    private final void A3(t1 t1Var) {
    }

    private final void B3(t1 t1Var) {
    }

    private final void C1(t1 t1Var) {
    }

    private final void C3(t1 t1Var) {
    }

    private final void E3(t1 t1Var) {
    }

    private final void G3(t1 t1Var) {
    }

    private final void H3(t1 t1Var) {
    }

    private final void M2(t1 t1Var) {
    }

    private final void N2(t1 t1Var) {
    }

    private final void Q2(t1 t1Var) {
    }

    private final void Q3(int i10) {
    }

    private final void R2(t1 t1Var) {
    }

    private final void R3(int i10) {
    }

    private final void S2(t1 t1Var) {
    }

    private final void T1(t1 t1Var) {
    }

    private final void T2(t1 t1Var) {
    }

    private final void U2(t1 t1Var) {
    }

    private final void U3(MessageObject messageObject) {
    }

    private final void V2(t1 t1Var) {
    }

    private final void V3(MessageObject messageObject) {
    }

    private final void W0(t1 t1Var) {
    }

    private final void X0(t1 t1Var) {
    }

    private final void Y0(t1 t1Var) {
    }

    private final void Y1(t1 t1Var) {
    }

    private final void Y2(t1 t1Var) {
    }

    private final void Z1(t1 t1Var) {
    }

    private final void Z2(t1 t1Var) {
    }

    private final void a1(t1 t1Var) {
    }

    private final void e1(t1 t1Var) {
    }

    private final void e2(t1 t1Var) {
    }

    private final void g1(t1 t1Var) {
    }

    private final void h2(t1 t1Var) {
    }

    private final void i3(String str) {
    }

    private final void j3(String str) {
    }

    private final void l1(t1 t1Var) {
    }

    private final void m1(t1 t1Var) {
    }

    private final void o3(t1 t1Var) {
    }

    private final void p3(t1 t1Var) {
    }

    private final void s1(t1 t1Var) {
    }

    private final void s3(t1 t1Var) {
    }

    private final void t1(t1 t1Var) {
    }

    private final void t3(t1 t1Var) {
    }

    private final void u1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void u2(t1 t1Var) {
    }

    private final void u3(MessageObject messageObject) {
    }

    private final void v2(t1 t1Var) {
    }

    private final void v3(MessageObject messageObject) {
    }

    private final void w2(t1 t1Var) {
    }

    private final void w3(t1 t1Var) {
    }

    private final void x2(t1 t1Var) {
    }

    private final void x3(t1 t1Var) {
    }

    private final void y1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void O(Object obj) {
    }

    @Override
    public void X(TLRPC.User user) {
    }

    @Override
    public void Y(byte[] bArr) {
    }

    @Override
    public long k(long j10) {
        return j10;
    }

    @Override
    public void t0(l2.f fVar) {
    }

    private final void A2(int i10, t1 t1Var) {
    }

    private final void B2(int i10, t1 t1Var) {
    }

    private final void D3(t1 t1Var, boolean z10) {
    }

    private final void F3(t1 t1Var, boolean z10) {
    }

    private final void L0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void N0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void O2(t1 t1Var, TLRPC.Document document) {
    }

    private final void P2(t1 t1Var, TLRPC.Document document) {
    }

    private final void V1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void X1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void a2(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void d2(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void i1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void j1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void k3(t1 t1Var, long j10) {
    }

    private final void l3(t1 t1Var, long j10) {
    }

    private final void q2(int i10, t1 t1Var) {
    }

    private final void r2(int i10, t1 t1Var) {
    }

    private final void s2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void t2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void y3(t1 t1Var, ah.t tVar) {
    }

    private final void z3(t1 t1Var, ah.t tVar) {
    }

    @Override
    public void h(byte[] bArr, j2.j jVar) {
    }

    @Override
    public void x(int i10, Object obj) {
    }

    private final void E2(t1 t1Var, float f7, float f10) {
    }

    private final void F2(t1 t1Var, float f7, float f10) {
    }

    private final void H0(t1 t1Var, float f7, float f10) {
    }

    private final void I0(t1 t1Var, float f7, float f10) {
    }

    private final void W2(t1 t1Var, float f7, float f10) {
    }

    private final void X2(t1 t1Var, float f7, float f10) {
    }

    private final void c3(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void d3(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void k2(t1 t1Var, int i10, int i11) {
    }

    private final void m2(t1 t1Var, int i10, int i11) {
    }

    private final void q1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void q3(t1 t1Var, float f7, float f10) {
    }

    private final void r1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void r3(t1 t1Var, float f7, float f10) {
    }

    private final void G2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void H2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void e3(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void f3(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void g3(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void h3(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void y2(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void z2(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void I2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void J2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void K2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void L2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void m3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void n3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void n1(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void o1(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void M3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void N3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override
    public void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
