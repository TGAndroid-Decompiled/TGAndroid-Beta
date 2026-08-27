package w9;

import af.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.TreeSet;
import m3.j;
import m3.m;
import m3.t;
import m3.w;
import nh.a4;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.zk;
import org.telegram.ui.ou0;
import za.k;

public class d implements s0, n0, f3.a, ff.a, j6.d, kf.a, lf.a, m, oa.m, ib, j1, s, z8.d {

    public final int f49285a;

    public d(int i10) {
        this.f49285a = i10;
    }

    public static void A3(String str) throws cc.c {
        if (str == null || str.length() == 0) {
            throw new cc.c("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new cc.c("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        switch (this.f49285a) {
        }
        return true;
    }

    @Override
    public void B0(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public void B1(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public w C(int i10, int i11) {
        return new j();
    }

    @Override
    public void C0() {
        int i10 = this.f49285a;
    }

    @Override
    public int C1(int i10, int i11, int i12) {
        kf.a aVar;
        if (i11 == 6) {
            aVar = kf.a.f15189l;
        } else if (i11 > i12) {
            aVar = kf.a.f15186i;
        } else {
            aVar = i11 < i12 ? kf.a.f15187j : kf.a.f15188k;
        }
        return aVar.C1(i10, i11, i12);
    }

    @Override
    public void D(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public void D0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        kf.a aVar;
        if (i10 == 6) {
            aVar = kf.a.f15189l;
        } else if (i10 > i11) {
            aVar = kf.a.f15186i;
        } else {
            aVar = i10 < i11 ? kf.a.f15187j : kf.a.f15188k;
        }
        aVar.D0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override
    public void D1(MessageObject messageObject) {
        int i10 = this.f49285a;
    }

    @Override
    public long E() {
        return System.currentTimeMillis();
    }

    @Override
    public void E0(s1 s1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f49285a;
    }

    @Override
    public void E1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f49285a) {
        }
        we.e.s(s1Var.getContext(), str);
    }

    @Override
    public void F0(s1 s1Var, float f10, float f11) {
        int i10 = this.f49285a;
    }

    @Override
    public CharacterStyle F1(s1 s1Var) {
        switch (this.f49285a) {
        }
        return null;
    }

    @Override
    public void G0(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f49285a;
    }

    @Override
    public void H(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public void H0(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public boolean H1(s1 s1Var, MessageObject messageObject) {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public void I1() {
        int i10 = this.f49285a;
    }

    @Override
    public void J0(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public void K1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f49285a;
    }

    @Override
    public void L(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f49285a;
    }

    @Override
    public boolean L0(long j10) {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public void L1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f49285a;
    }

    @Override
    public void M(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public void M0(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public boolean M1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public void O(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f49285a;
    }

    @Override
    public void O0(int i10, s1 s1Var) {
        int i11 = this.f49285a;
    }

    @Override
    public ou0 O1() {
        switch (this.f49285a) {
        }
        return null;
    }

    @Override
    public void Q(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public void Q0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f49285a;
    }

    @Override
    public boolean Q1(long j10) {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public void R(int i10, s1 s1Var) {
        int i11 = this.f49285a;
    }

    @Override
    public void R0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f49285a;
    }

    @Override
    public void R1(s1 s1Var, int i10, float f10, float f11, boolean z10) {
        int i11 = this.f49285a;
    }

    @Override
    public boolean S0(s1 s1Var, boolean z10) {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public void T(MessageObject messageObject) {
        int i10 = this.f49285a;
    }

    @Override
    public boolean U(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public void U0(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public boolean V() {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public boolean V1(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public boolean W(s1 s1Var) {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public void W0(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public boolean X() {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public void Y(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
        int i11 = this.f49285a;
    }

    @Override
    public boolean Y0(int i10, s1 s1Var) {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public b8.b Y1(Context context, String str, j6.c cVar) {
        b8.b bVar = new b8.b();
        bVar.f2041a = cVar.A(context, str);
        int i10 = 1;
        int iG = cVar.g(context, str, true);
        bVar.f2042b = iG;
        int i11 = bVar.f2041a;
        if (i11 == 0) {
            i11 = 0;
            if (iG == 0) {
                i10 = 0;
            } else if (iG < i11) {
                i10 = -1;
            }
        } else if (iG < i11) {
            i10 = -1;
        }
        bVar.f2043c = i10;
        return bVar;
    }

    @Override
    public void Z(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public void Z1(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public void a() {
        synchronized (d5.a.h) {
            Object obj = d5.a.f4769i;
            synchronized (obj) {
                if (d5.a.f4770j) {
                    return;
                }
                long jA = d5.a.a();
                synchronized (obj) {
                    d5.a.f4771k = jA;
                    d5.a.f4770j = true;
                }
            }
        }
    }

    @Override
    public boolean a1(MessageObject messageObject) {
        int i10 = this.f49285a;
        return rl.a(messageObject);
    }

    @Override
    public void a2(s1 s1Var, fh.f fVar) {
        int i10 = this.f49285a;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        u6.d dVar = (u6.d) ((u6.e) obj).u();
        m6.b bVar = new m6.b(1, (TaskCompletionSource) obj2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = u6.c.f48427a;
        parcelObtain.writeStrongBinder(bVar);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            dVar.f48428a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override
    public boolean b(Context context) {
        return e0.b.j(context);
    }

    @Override
    public int b0() {
        switch (this.f49285a) {
        }
        return 0;
    }

    @Override
    public void b2(s1 s1Var, long j10) {
        int i10 = this.f49285a;
    }

    @Override
    public void c(jb jbVar, ua uaVar, sa saVar, va vaVar) {
        o1.j jVar = new o1.j(jbVar, jb.IN_OUT_OFFSET_Y, jbVar.getHeight());
        jVar.f19147u.a(0.8f);
        jVar.f19147u.b(400.0f);
        jVar.a(new wa(saVar, 1));
        jVar.b(new hb(vaVar, jbVar, 0));
        jVar.f();
        uaVar.run();
    }

    @Override
    public void c0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(i0.a.k(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
        }
        int iRemaining = shortBuffer.remaining() / i12;
        int iCeil = (int) Math.ceil((((double) i11) / ((double) i10)) * ((double) iRemaining));
        int i13 = iRemaining - iCeil;
        float f10 = iCeil;
        float f11 = f10 / f10;
        float f12 = i13;
        float f13 = f12 / f12;
        while (iCeil > 0 && i13 > 0) {
            if (f11 >= f13) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                iCeil--;
                f11 = iCeil / f10;
            } else {
                shortBuffer.position(shortBuffer.position() + i12);
                i13--;
                f13 = i13 / f12;
            }
        }
    }

    @Override
    public boolean c2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public boolean d() {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public qg.a d0() {
        switch (this.f49285a) {
        }
        return null;
    }

    @Override
    public void d1() {
        int i10 = this.f49285a;
    }

    @Override
    public void d2(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public p0 e(Class cls) {
        return new m0(true);
    }

    @Override
    public boolean e0(s1 s1Var) {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public void e1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f49285a;
    }

    @Override
    public boolean f() {
        switch (this.f49285a) {
        }
        return true;
    }

    @Override
    public boolean f0(s1 s1Var, TLRPC.User user) {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public Object f2() {
        switch (this.f49285a) {
            case 16:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override
    public void g(jb jbVar, ua uaVar, bg bgVar, zk zkVar) {
        jbVar.setInOutOffset(jbVar.getMeasuredHeight());
        zkVar.accept(Float.valueOf(jbVar.getTranslationY()));
        o1.j jVar = new o1.j(jbVar, jb.IN_OUT_OFFSET_Y, 0.0f);
        jVar.f19147u.a(0.8f);
        jVar.f19147u.b(400.0f);
        jVar.a(new a4(1, jbVar, bgVar));
        jVar.b(new hb(zkVar, jbVar, 1));
        jVar.f();
        uaVar.run();
    }

    @Override
    public String h(s1 s1Var) {
        switch (this.f49285a) {
        }
        return null;
    }

    @Override
    public void h1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.f49285a;
    }

    @Override
    public void h2() {
        int i10 = this.f49285a;
    }

    @Override
    public boolean i(Context context) {
        return e0.b.m(context);
    }

    @Override
    public void i0(int i10) {
        int i11 = this.f49285a;
    }

    @Override
    public void i2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i10 = this.f49285a;
    }

    @Override
    public void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f49285a;
    }

    @Override
    public boolean j0() {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public void k() {
        int i10 = this.f49285a;
    }

    @Override
    public void k0(s1 s1Var, float f10, float f11) {
        int i10 = this.f49285a;
    }

    @Override
    public boolean k2(int i10) {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public int l0(s1 s1Var) {
        switch (this.f49285a) {
        }
        return 0;
    }

    @Override
    public void m0(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public void m1(s1 s1Var, float f10, float f11) {
        int i10 = this.f49285a;
    }

    @Override
    public void m2() {
        int i10 = this.f49285a;
    }

    @Override
    public void n2(s1 s1Var, int i10, int i11) {
        int i12 = this.f49285a;
    }

    public Signature[] n3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public void o(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f49285a;
    }

    @Override
    public k9 o2() {
        switch (this.f49285a) {
        }
        return null;
    }

    @Override
    public void p(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public boolean p0() {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public void q() {
        int i10 = this.f49285a;
    }

    @Override
    public p0 r(Class cls, v1.b bVar) {
        return e(cls);
    }

    @Override
    public void r0(String str) {
        int i10 = this.f49285a;
    }

    @Override
    public boolean s0(t5 t5Var) {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public boolean s1() {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public void t(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public void t0(s1 s1Var, float f10, float f11) {
        int i10 = this.f49285a;
    }

    @Override
    public void u() {
        int i10 = this.f49285a;
    }

    @Override
    public Object u0(h hVar) {
        switch (this.f49285a) {
            case 24:
                return new ya.c(hVar.y(ya.b.class));
            case 25:
                return new ya.b(hVar.e(xa.a.class));
            default:
                return new k((Context) hVar.a(Context.class));
        }
    }

    @Override
    public void u1(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public void v(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public void v0(s1 s1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.f49285a;
    }

    @Override
    public void v1(s1 s1Var, boolean z10) {
        int i10 = this.f49285a;
    }

    @Override
    public void x(s1 s1Var) {
        int i10 = this.f49285a;
    }

    @Override
    public void x0(s1 s1Var, float f10, float f11, boolean z10) {
        int i10 = this.f49285a;
    }

    @Override
    public boolean x1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.f49285a) {
        }
        return false;
    }

    @Override
    public void y1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f49285a;
    }

    @Override
    public String z(long j10) {
        switch (this.f49285a) {
        }
        return null;
    }

    @Override
    public boolean z1() {
        switch (this.f49285a) {
        }
        return false;
    }

    public d(u6.a aVar) {
        this.f49285a = 22;
    }

    private final void B() {
    }

    private final void B3() {
    }

    private final void C3() {
    }

    private final void F() {
    }

    private final void F2() {
    }

    private final void G2() {
    }

    private final void N() {
    }

    private final void P() {
    }

    private final void T1() {
    }

    private final void U1() {
    }

    private final void o3() {
    }

    private final void p3() {
    }

    private final void s3() {
    }

    private final void t3() {
    }

    private final void w3() {
    }

    private final void x3() {
    }

    @Override
    public void A() {
    }

    @Override
    public void l() {
    }

    private final void A1(s1 s1Var) {
    }

    private final void A2(s1 s1Var) {
    }

    private final void D2(s1 s1Var) {
    }

    private final void E2(s1 s1Var) {
    }

    private final void G(s1 s1Var) {
    }

    private final void I(s1 s1Var) {
    }

    private final void I0(s1 s1Var) {
    }

    private final void J(s1 s1Var) {
    }

    private final void K(s1 s1Var) {
    }

    private final void K0(s1 s1Var) {
    }

    private final void N0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void N2(String str) {
    }

    private final void O2(String str) {
    }

    private final void P0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void S(s1 s1Var) {
    }

    private final void T0(s1 s1Var) {
    }

    private final void T2(s1 s1Var) {
    }

    private final void U2(s1 s1Var) {
    }

    private final void V0(s1 s1Var) {
    }

    private final void X2(s1 s1Var) {
    }

    private final void Y2(s1 s1Var) {
    }

    private final void Z2(MessageObject messageObject) {
    }

    private final void a0(s1 s1Var) {
    }

    private final void a3(MessageObject messageObject) {
    }

    private final void b1(s1 s1Var) {
    }

    private final void b3(s1 s1Var) {
    }

    private final void c1(s1 s1Var) {
    }

    private final void c3(s1 s1Var) {
    }

    private final void f3(s1 s1Var) {
    }

    private final void g3(s1 s1Var) {
    }

    private final void h3(s1 s1Var) {
    }

    private final void i1(s1 s1Var) {
    }

    private final void j1(s1 s1Var) {
    }

    private final void j3(s1 s1Var) {
    }

    private final void l3(s1 s1Var) {
    }

    private final void m3(s1 s1Var) {
    }

    private final void n0(s1 s1Var) {
    }

    private final void o0(s1 s1Var) {
    }

    private final void r1(s1 s1Var) {
    }

    private final void r2(s1 s1Var) {
    }

    private final void s2(s1 s1Var) {
    }

    private final void t1(s1 s1Var) {
    }

    private final void u3(int i10) {
    }

    private final void v2(s1 s1Var) {
    }

    private final void v3(int i10) {
    }

    private final void w1(s1 s1Var) {
    }

    private final void w2(s1 s1Var) {
    }

    private final void x2(s1 s1Var) {
    }

    private final void y2(s1 s1Var) {
    }

    private final void y3(MessageObject messageObject) {
    }

    private final void z2(s1 s1Var) {
    }

    private final void z3(MessageObject messageObject) {
    }

    @Override
    public void n(t tVar) {
    }

    private final void P1(int i10, s1 s1Var) {
    }

    private final void P2(s1 s1Var, long j10) {
    }

    private final void Q2(s1 s1Var, long j10) {
    }

    private final void S1(int i10, s1 s1Var) {
    }

    private final void X0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void Z0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void d3(s1 s1Var, fh.f fVar) {
    }

    private final void e3(s1 s1Var, fh.f fVar) {
    }

    private final void f1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void g0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void g1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void h0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void i3(s1 s1Var, boolean z10) {
    }

    private final void k3(s1 s1Var, boolean z10) {
    }

    private final void n1(int i10, s1 s1Var) {
    }

    private final void o1(int i10, s1 s1Var) {
    }

    private final void p1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void q1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void t2(s1 s1Var, TLRPC.Document document) {
    }

    private final void u2(s1 s1Var, TLRPC.Document document) {
    }

    private final void w(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void y(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void B2(s1 s1Var, float f10, float f11) {
    }

    private final void C2(s1 s1Var, float f10, float f11) {
    }

    private final void H2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void I2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void V2(s1 s1Var, float f10, float f11) {
    }

    private final void W1(s1 s1Var, float f10, float f11) {
    }

    private final void W2(s1 s1Var, float f10, float f11) {
    }

    private final void X1(s1 s1Var, float f10, float f11) {
    }

    private final void k1(s1 s1Var, int i10, int i11) {
    }

    private final void l1(s1 s1Var, int i10, int i11) {
    }

    private final void m(s1 s1Var, float f10, float f11) {
    }

    private final void s(s1 s1Var, float f10, float f11) {
    }

    private final void y0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final void z0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final void J1(s1 s1Var, float f10, float f11, boolean z10) {
    }

    private final void J2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void K2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void L2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void M2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void N1(s1 s1Var, float f10, float f11, boolean z10) {
    }

    private final void e2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void g2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void R2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void S2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void j2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void l2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void p2(s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    private final void q2(s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    private final void q0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    private final void w0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    private final void q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void r3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
