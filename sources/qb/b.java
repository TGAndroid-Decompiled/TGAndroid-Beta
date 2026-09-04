package qb;

import ah.u;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.CharacterStyle;
import android.view.View;
import c3.b0;
import c3.h0;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.d0;
import e9.i0;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import n7.z0;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.z5;
import org.telegram.ui.ov0;
import org.telegram.ui.sn;
public final class b implements androidx.car.app.messaging.model.b, bg.a, c3.q, cf.b, da.c, fb.n, com.google.android.gms.common.api.internal.s, y2.o, n2.m, q9.d, og, k1, t0, r0.r, xf.a {
    public static b f44271b;
    public final int f44272a;

    public b(int i10) {
        this.f44272a = i10;
    }

    public static da.a s2(ob.a aVar) {
        return new da.a(System.currentTimeMillis() + 3600000, new com.google.android.gms.internal.cast.a(8), new ac.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static byte[] t2(i0 i0Var, long j3) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            d2.b bVar = (d2.b) it.next();
            Bundle a2 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                e2.d.g(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a2.putByteArray(d2.b.f6489x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a2);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j3);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static Calendar u2() {
        if (f44271b == null) {
            f44271b = new b(25);
        }
        f44271b.getClass();
        return Calendar.getInstance();
    }

    public static String v2(ad.c cVar) {
        String str = cVar.f404a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            return "￼";
        } else if ("iframe".equals(str)) {
            return " ";
        } else {
            return null;
        }
    }

    public static void w2(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new tc.g("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new tc.g("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public Object D(cf.c cVar) {
        switch (this.f44272a) {
            case 14:
                g gVar = (g) cVar.a(g.class);
                return new rb.a(0);
            default:
                a aVar = (a) cVar.a(a.class);
                return new b(0);
        }
    }

    @Override
    public boolean E0(Context context) {
        return false;
    }

    @Override
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(t1Var.getContext(), str);
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override
    public int H0(b2.s sVar) {
        if (sVar.v != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public CharacterStyle H1(t1 t1Var) {
        return null;
    }

    @Override
    public boolean I0(long j3) {
        return false;
    }

    @Override
    public boolean J1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public n2 K0() {
        return null;
    }

    @Override
    public boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void O0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean Q(t1 t1Var) {
        return false;
    }

    @Override
    public ov0 Q1() {
        return null;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public h0 R1(int i10, int i11) {
        return new c3.n();
    }

    @Override
    public boolean S1(long j3) {
        return false;
    }

    @Override
    public n2.g T0(n2.j jVar, b2.s sVar) {
        if (sVar.v == null) {
            return null;
        }
        return new n2.n(new n2.f(6001, new Exception()));
    }

    @Override
    public boolean U1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public int W0() {
        return 0;
    }

    @Override
    public boolean X0(int i10, t1 t1Var) {
        return false;
    }

    @Override
    public ih.a Y() {
        return null;
    }

    @Override
    public TL_stories.StoryItem Y0() {
        return null;
    }

    @Override
    public boolean Z(t1 t1Var) {
        return false;
    }

    @Override
    public long a() {
        return 0L;
    }

    @Override
    public boolean a0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean a1(long j3) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        j7.d dVar = (j7.d) ((j7.e) obj).u();
        b7.b bVar = new b7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = j7.c.f13556a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f13557a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c1(MessageObject messageObject) {
        return wl.a(messageObject);
    }

    @Override
    public long d() {
        return 0L;
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public boolean d1() {
        return false;
    }

    @Override
    public boolean d2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean e(Context context) {
        return false;
    }

    @Override
    public boolean f() {
        switch (this.f44272a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int f0(t1 t1Var) {
        return 0;
    }

    @Override
    public Object f2(Uri uri, g2.k kVar) {
        return Long.valueOf(d0.T(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override
    public String g(t1 t1Var) {
        return null;
    }

    @Override
    public n2.l h0(n2.j jVar, b2.s sVar) {
        return n2.l.f16403u;
    }

    @Override
    public Object h2() {
        switch (this.f44272a) {
            case 8:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override
    public boolean i1() {
        return false;
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public boolean j2(w0 w0Var, float f7, float f10) {
        return false;
    }

    @Override
    public da.a k0(ob.a aVar, JSONObject jSONObject) {
        return s2(aVar);
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean m2(int i10) {
        return false;
    }

    @Override
    public boolean n0(z5 z5Var) {
        return false;
    }

    @Override
    public sn o0() {
        return null;
    }

    @Override
    public int p() {
        return 0;
    }

    @Override
    public TLRPC.Peer q() {
        return null;
    }

    @Override
    public boolean q1() {
        return false;
    }

    @Override
    public r9 q2() {
        return null;
    }

    @Override
    public boolean u0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean u1() {
        return false;
    }

    @Override
    public String w(long j3) {
        return null;
    }

    @Override
    public cf.a y1(z0 z0Var) {
        return new ye.h(z0Var);
    }

    @Override
    public boolean z0() {
        return true;
    }

    @Override
    public boolean z1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    public b(j7.a aVar) {
        this.f44272a = 11;
    }

    @Override
    public void C() {
    }

    @Override
    public void D0() {
    }

    @Override
    public void G0() {
    }

    @Override
    public void L1() {
    }

    @Override
    public void P0() {
    }

    @Override
    public void U() {
    }

    @Override
    public void V1() {
    }

    @Override
    public void Z0() {
    }

    @Override
    public void a2() {
    }

    @Override
    public void b() {
    }

    @Override
    public void e1() {
    }

    @Override
    public void g2() {
    }

    @Override
    public void h() {
    }

    @Override
    public void h1() {
    }

    @Override
    public void i2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void k() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void l0() {
    }

    @Override
    public void l1() {
    }

    @Override
    public void m1() {
    }

    @Override
    public void n2() {
    }

    @Override
    public void o() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void r0() {
    }

    @Override
    public void r2() {
    }

    @Override
    public void release() {
    }

    @Override
    public void s() {
    }

    @Override
    public void t1() {
    }

    @Override
    public void v() {
    }

    @Override
    public void w0() {
    }

    @Override
    public void x1() {
    }

    @Override
    public void A(t1 t1Var) {
    }

    @Override
    public void A0(t1 t1Var) {
    }

    @Override
    public void C0(t1 t1Var) {
    }

    @Override
    public void D1(t1 t1Var) {
    }

    @Override
    public void F(t1 t1Var) {
    }

    @Override
    public void F0(t1 t1Var) {
    }

    @Override
    public void F1(MessageObject messageObject) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(t1 t1Var) {
    }

    @Override
    public void L(t1 t1Var) {
    }

    @Override
    public void M0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void P1(b0 b0Var) {
    }

    @Override
    public void S0(t1 t1Var) {
    }

    @Override
    public void T(t1 t1Var) {
    }

    @Override
    public void U0(t1 t1Var) {
    }

    @Override
    public void V0(int i10) {
    }

    @Override
    public void W(boolean z10) {
    }

    @Override
    public void W1(t1 t1Var) {
    }

    @Override
    public void X(w0 w0Var) {
    }

    @Override
    public void X1(int i10) {
    }

    @Override
    public void b2(boolean z10) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void e2(t1 t1Var) {
    }

    @Override
    public void g0(t1 t1Var) {
    }

    @Override
    public void i0(w0 w0Var) {
    }

    @Override
    public void m0(String str) {
    }

    @Override
    public void n(t1 t1Var) {
    }

    @Override
    public void p1(CharSequence charSequence) {
    }

    @Override
    public void q0(w0 w0Var) {
    }

    @Override
    public void r(t1 t1Var) {
    }

    @Override
    public void r1(long j3) {
    }

    @Override
    public void s1(w0 w0Var) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void u(t1 t1Var) {
    }

    @Override
    public void v0(t1 t1Var) {
    }

    @Override
    public void v1(t1 t1Var) {
    }

    @Override
    public void x(float f7) {
    }

    @Override
    public void y(t1 t1Var) {
    }

    @Override
    public void z(boolean z10) {
    }

    @Override
    public void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void B(Looper looper, j2.k kVar) {
    }

    @Override
    public void B0(int i10, int i11) {
    }

    @Override
    public void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void J(float f7, int i10) {
    }

    @Override
    public void K(w0 w0Var, int i10) {
    }

    @Override
    public void K1(t1 t1Var, u uVar) {
    }

    @Override
    public void L0(int i10, t1 t1Var) {
    }

    @Override
    public void M(int i10, t1 t1Var) {
    }

    @Override
    public void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void N0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Y1(t1 t1Var, long j3) {
    }

    @Override
    public void Z1(w0 w0Var, String str) {
    }

    @Override
    public void g1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void j1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void w1(t1 t1Var, boolean z10) {
    }

    @Override
    public void C1(w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public int E1(int i10, int i11, int i12) {
        return i10;
    }

    @Override
    public void Q0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void b0(w0 w0Var, int i10, int i11) {
    }

    @Override
    public void b1(w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void e0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void f1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void n1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void o1(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void p0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void p2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void x0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void y0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    @Override
    public void s0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void t0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void G(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override
    public void T1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void k2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void l2(w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void c2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
