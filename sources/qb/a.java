package qb;

import a8.r7;
import ab.g;
import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import b7.c;
import b7.f;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentRegistrar;
import f3.c0;
import f3.j0;
import f3.n;
import f3.q;
import h2.m0;
import j2.k;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.fj;
import org.telegram.messenger.ij;
import org.telegram.messenger.o10;
import org.telegram.messenger.o2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.wf;
import org.telegram.ui.er0;
import org.telegram.ui.p11;
import org.telegram.ui.qm;
import pb.h;
import u9.d;
import u9.e;
public class a implements c, p11, eg.a, q, fg.a, bm0, e, bi, Continuation, d, b3.q, wf, l1, OnFailureListener, u4.c, y9.a {
    public static final a f53942b = new a(14);
    public static a f53943c;
    public static a d;
    public final int f53944a;

    public a(int i7) {
        this.f53944a = i7;
    }

    public static Calendar u4() {
        if (d == null) {
            d = new a(27);
        }
        d.getClass();
        return Calendar.getInstance();
    }

    @Override
    public void A0(q1 q1Var, TLObject tLObject, boolean z9) {
        int i7 = this.f53944a;
    }

    @Override
    public void A1(ij ijVar) {
        int i7 = this.f53944a;
    }

    @Override
    public void B0(q1 q1Var, float f10, float f11) {
        int i7 = this.f53944a;
    }

    @Override
    public void B1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        switch (this.f53944a) {
            case 18:
            default:
                vf.c.t(q1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void C(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public CharacterStyle C1(q1 q1Var) {
        switch (this.f53944a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void D0(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public void D1(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
        int i11 = this.f53944a;
    }

    @Override
    public void E0(q1 q1Var, boolean z9, boolean z10) {
        int i7 = this.f53944a;
    }

    @Override
    public boolean E1(q1 q1Var, ij ijVar) {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void F1() {
        int i7 = this.f53944a;
    }

    @Override
    public void G(q1 q1Var, o2 o2Var) {
        int i7 = this.f53944a;
    }

    @Override
    public void G0(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public boolean G1() {
        return false;
    }

    @Override
    public void H(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public void H0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public void H1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i7 = this.f53944a;
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers I() {
        return null;
    }

    @Override
    public void I1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7 = this.f53944a;
    }

    @Override
    public void J(fj fjVar) {
        int i7 = this.f53944a;
    }

    @Override
    public boolean J0(long j3) {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean J1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
        int i7 = this.f53944a;
    }

    @Override
    public void K0(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public void K1(q1 q1Var, o10 o10Var) {
        int i7 = this.f53944a;
    }

    @Override
    public void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i7 = this.f53944a;
    }

    @Override
    public Object L1(Uri uri, k kVar) {
        return Long.valueOf(m0.V(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override
    public void N(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public void N0(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
        int i7 = this.f53944a;
    }

    @Override
    public er0 N1() {
        switch (this.f53944a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean O0(q1 q1Var, boolean z9) {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public j0 O1(int i7, int i10) {
        return new n();
    }

    @Override
    public void P(ij ijVar) {
        int i7 = this.f53944a;
    }

    @Override
    public void P0(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public void P1(String str, String str2) {
        int i7 = this.f53944a;
    }

    @Override
    public boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q0(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public boolean Q1(long j3) {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R() {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R1(q1 q1Var, int i7, float f10, float f11, boolean z9) {
        int i10 = this.f53944a;
    }

    @Override
    public boolean S(q1 q1Var) {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int S0() {
        return 0;
    }

    @Override
    public boolean S1(q1 q1Var, TLRPC.TodoItem todoItem) {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean T() {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public TL_stories.StoryItem T0() {
        return null;
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
        int i10 = this.f53944a;
    }

    @Override
    public void U1(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public void V(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public boolean V0(long j3) {
        return false;
    }

    @Override
    public boolean W0(ij ijVar) {
        int i7 = this.f53944a;
        return f1.a(ijVar);
    }

    @Override
    public void W1(q1 q1Var, long j3) {
        int i7 = this.f53944a;
    }

    @Override
    public int X() {
        switch (this.f53944a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean X0() {
        return false;
    }

    @Override
    public jh.a Z() {
        switch (this.f53944a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Z0() {
        int i7 = this.f53944a;
    }

    @Override
    public boolean a0(q1 q1Var) {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a2(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public boolean b0(q1 q1Var, TLRPC.User user) {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.f53944a;
    }

    @Override
    public boolean b2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public void c0(qg qgVar) {
        qgVar.run();
    }

    @Override
    public void c2(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public boolean d() {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d0(int i7) {
        int i10 = this.f53944a;
    }

    @Override
    public boolean d1() {
        return false;
    }

    @Override
    public Object e(r7 r7Var) {
        return new pb.d(r7Var.c(h.class));
    }

    @Override
    public boolean e0() {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e2() {
        int i7 = this.f53944a;
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public void f2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
        int i7 = this.f53944a;
    }

    @Override
    public boolean g() {
        switch (this.f53944a) {
            case 18:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void g0(q1 q1Var, float f10, float f11) {
        int i7 = this.f53944a;
    }

    @Override
    public void g1(q1 q1Var, int i7) {
        int i10 = this.f53944a;
    }

    @Override
    public boolean g2(int i7) {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String h(q1 q1Var) {
        switch (this.f53944a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int h0(q1 q1Var) {
        switch (this.f53944a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public List i(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (u9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f56338a;
            if (str != null) {
                aVar = new u9.a(str, aVar.f56339b, aVar.f56340c, aVar.d, aVar.f56341e, new g(18, str, aVar), aVar.f56343g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override
    public void i0(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public void i2() {
        int i7 = this.f53944a;
    }

    @Override
    public void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
        int i12 = this.f53944a;
    }

    @Override
    public void j1(q1 q1Var, float f10, float f11) {
        int i7 = this.f53944a;
    }

    @Override
    public void j2(q1 q1Var, int i7, int i10) {
        int i11 = this.f53944a;
    }

    @Override
    public void k() {
        int i7 = this.f53944a;
    }

    @Override
    public boolean k0() {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public j9 k2() {
        switch (this.f53944a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int l() {
        return 0;
    }

    @Override
    public boolean l1() {
        return false;
    }

    @Override
    public int m(Context context, String str, boolean z9) {
        return f.d(context, str, z9);
    }

    @Override
    public void m0(String str) {
        int i7 = this.f53944a;
    }

    @Override
    public void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10 = this.f53944a;
    }

    @Override
    public boolean n0(r5 r5Var) {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean n1() {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void o(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public qm o0() {
        return null;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public void p() {
        int i7 = this.f53944a;
    }

    @Override
    public void p0(q1 q1Var, float f10, float f11) {
        int i7 = this.f53944a;
    }

    @Override
    public boolean p1(q1 q1Var, int i7) {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int q(Context context, String str) {
        return f.a(context, str);
    }

    @Override
    public void q0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 < i10) {
            fg.a.v.q0(shortBuffer, i7, shortBuffer2, i10, i11);
        } else if (i7 > i10) {
            fg.a.f11479u.q0(shortBuffer, i7, shortBuffer2, i10, i11);
        } else if (i7 == i10) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public void q1(q1 q1Var, boolean z9, boolean z10) {
        int i7 = this.f53944a;
    }

    @Override
    public void r(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public void r1(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public TLRPC.Peer s() {
        return null;
    }

    @Override
    public void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
        int i7 = this.f53944a;
    }

    @Override
    public void s1(q1 q1Var, boolean z9) {
        int i7 = this.f53944a;
    }

    @Override
    public Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }

    @Override
    public void u() {
        int i7 = this.f53944a;
    }

    @Override
    public void u0(q1 q1Var, float f10, float f11, boolean z9) {
        int i7 = this.f53944a;
    }

    @Override
    public boolean u1(q1 q1Var, TLRPC.Chat chat) {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void v(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public boolean v0() {
        return true;
    }

    @Override
    public void v1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.f53944a;
    }

    @Override
    public boolean w1() {
        switch (this.f53944a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void x(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public boolean x0(ij ijVar) {
        switch (this.f53944a) {
            case 18:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void x1(q1 q1Var, int i7) {
        int i10 = this.f53944a;
    }

    public boolean x4(CharSequence charSequence) {
        return false;
    }

    @Override
    public String y(long j3) {
        switch (this.f53944a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void y0(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public void y1(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public void z(q1 q1Var) {
        int i7 = this.f53944a;
    }

    @Override
    public void z0() {
        int i7 = this.f53944a;
    }

    public a(WearAuthListenerService wearAuthListenerService) {
        this.f53944a = 1;
    }

    private final void A4() {
    }

    private final void B4() {
    }

    private final void E4() {
    }

    private final void F4() {
    }

    private final void I4() {
    }

    private final void J4() {
    }

    private final void K3() {
    }

    private final void L3() {
    }

    private final void k3() {
    }

    private final void l3() {
    }

    private final void q2() {
    }

    private final void r2() {
    }

    private final void v4() {
    }

    private final void w2() {
    }

    private final void w4() {
    }

    private final void x2() {
    }

    @Override
    public void C0() {
    }

    @Override
    public void D() {
    }

    @Override
    public void E() {
    }

    @Override
    public void F0() {
    }

    @Override
    public void I0() {
    }

    @Override
    public void L() {
    }

    @Override
    public void T1() {
    }

    @Override
    public void U0() {
    }

    @Override
    public void W() {
    }

    @Override
    public void X1() {
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
    }

    @Override
    public void c1() {
    }

    @Override
    public void d2() {
    }

    @Override
    public void e1() {
    }

    @Override
    public void f1() {
    }

    @Override
    public void finish() {
    }

    @Override
    public void h1() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void j0() {
    }

    @Override
    public void l2() {
    }

    @Override
    public void m1() {
    }

    @Override
    public void r0() {
    }

    @Override
    public void t() {
    }

    @Override
    public void t0() {
    }

    @Override
    public void t1() {
    }

    @Override
    public void w0() {
    }

    private final void A3(q1 q1Var) {
    }

    private final void B3(q1 q1Var) {
    }

    private final void C2(q1 q1Var) {
    }

    private final void C3(q1 q1Var) {
    }

    private final void C4(int i7) {
    }

    private final void D2(q1 q1Var) {
    }

    private final void D3(q1 q1Var) {
    }

    private final void D4(int i7) {
    }

    private final void E3(q1 q1Var) {
    }

    private final void F3(q1 q1Var) {
    }

    private final void G4(ij ijVar) {
    }

    private final void H4(ij ijVar) {
    }

    private final void I2(q1 q1Var) {
    }

    private final void I3(q1 q1Var) {
    }

    private final void J2(q1 q1Var) {
    }

    private final void J3(q1 q1Var) {
    }

    private final void K2(fj fjVar) {
    }

    private final void L2(fj fjVar) {
    }

    private final void M2(q1 q1Var) {
    }

    private final void N2(q1 q1Var) {
    }

    private final void Q2(q1 q1Var) {
    }

    private final void R2(q1 q1Var) {
    }

    private final void S3(String str) {
    }

    private final void T3(String str) {
    }

    private final void U2(q1 q1Var) {
    }

    private final void V2(q1 q1Var) {
    }

    private final void Y3(q1 q1Var) {
    }

    private final void Z3(q1 q1Var) {
    }

    private final void c3(q1 q1Var) {
    }

    private final void c4(q1 q1Var) {
    }

    private final void d3(q1 q1Var) {
    }

    private final void d4(q1 q1Var) {
    }

    private final void e3(q1 q1Var) {
    }

    private final void e4(ij ijVar) {
    }

    private final void f3(q1 q1Var) {
    }

    private final void f4(ij ijVar) {
    }

    private final void g4(q1 q1Var) {
    }

    private final void h4(q1 q1Var) {
    }

    private final void k4(q1 q1Var) {
    }

    private final void l4(q1 q1Var) {
    }

    private final void q4(q1 q1Var) {
    }

    private final void s2(q1 q1Var) {
    }

    private final void s4(q1 q1Var) {
    }

    private final void t2(q1 q1Var) {
    }

    private final void u2(q1 q1Var) {
    }

    private final void u3(q1 q1Var) {
    }

    private final void v2(q1 q1Var) {
    }

    private final void v3(q1 q1Var) {
    }

    private final void y2(q1 q1Var) {
    }

    private final void z2(q1 q1Var) {
    }

    @Override
    public void A(float f10) {
    }

    @Override
    public void B(boolean z9) {
    }

    @Override
    public void M0(Object obj) {
    }

    @Override
    public void O(t2 t2Var) {
    }

    @Override
    public void R0(int i7) {
    }

    @Override
    public void V1(int i7) {
    }

    @Override
    public void Y(boolean z9) {
    }

    @Override
    public void Y0(TLRPC.User user) {
    }

    @Override
    public void Y1(boolean z9) {
    }

    @Override
    public void f(c0 c0Var) {
    }

    @Override
    public void k1(CharSequence charSequence) {
    }

    @Override
    public void w(float f10) {
    }

    private final void A2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void B2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void O2(q1 q1Var, o2 o2Var) {
    }

    private final void P2(q1 q1Var, o2 o2Var) {
    }

    private final void S2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void T2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void U3(q1 q1Var, long j3) {
    }

    private final void V3(q1 q1Var, long j3) {
    }

    private final void Y2(q1 q1Var, int i7) {
    }

    private final void Z2(q1 q1Var, int i7) {
    }

    private final void a3(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void b3(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void i3(q1 q1Var, int i7) {
    }

    private final void i4(q1 q1Var, o10 o10Var) {
    }

    private final void j3(q1 q1Var, int i7) {
    }

    private final void j4(q1 q1Var, o10 o10Var) {
    }

    private final void m4(q1 q1Var, boolean z9) {
    }

    private final void o2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void o4(q1 q1Var, boolean z9) {
    }

    private final void p2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void w3(String str, String str2) {
    }

    private final void x3(String str, String str2) {
    }

    @Override
    public void M(float f10, int i7) {
    }

    @Override
    public void l0(int i7, Object obj) {
    }

    private final void G2(q1 q1Var, TLObject tLObject, boolean z9) {
    }

    private final void G3(q1 q1Var, float f10, float f11) {
    }

    private final void H2(q1 q1Var, TLObject tLObject, boolean z9) {
    }

    private final void H3(q1 q1Var, float f10, float f11) {
    }

    private final void M3(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    private final void N3(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    private final void W2(q1 q1Var, int i7, int i10) {
    }

    private final void X2(q1 q1Var, int i7, int i10) {
    }

    private final void a4(q1 q1Var, float f10, float f11) {
    }

    private final void b4(q1 q1Var, float f10, float f11) {
    }

    private final void m2(q1 q1Var, float f10, float f11) {
    }

    private final void m3(q1 q1Var, float f10, float f11) {
    }

    private final void n2(q1 q1Var, float f10, float f11) {
    }

    private final void n3(q1 q1Var, float f10, float f11) {
    }

    private final void n4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final void p4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final void r4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final void t4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final void y3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void z3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void a1(CharSequence charSequence, boolean z9, boolean z10) {
    }

    @Override
    public void i1(View view, CharSequence charSequence, boolean z9) {
    }

    @Override
    public int z1(int i7, int i10, int i11) {
        return i7;
    }

    private final void O3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void P3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void Q3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void R3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void g3(q1 q1Var, float f10, float f11, boolean z9) {
    }

    private final void h3(q1 q1Var, float f10, float f11, boolean z9) {
    }

    private final void o3(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final void p3(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
    }

    private final void W3(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final void X3(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final void q3(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    private final void r3(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    private final void s3(q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    private final void t3(q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    @Override
    public void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
    }

    private final void E2(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    private final void F2(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    @Override
    public void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
    }

    @Override
    public void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }

    private final void y4(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    private final void z4(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
