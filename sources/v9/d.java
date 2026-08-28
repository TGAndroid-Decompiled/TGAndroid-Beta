package v9;

import android.content.Context;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import androidx.emoji2.text.m;
import androidx.lifecycle.s0;
import com.google.android.exoplayer2.upstream.e0;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.p0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.components.ComponentRegistrar;
import d5.f0;
import d5.q;
import h3.t1;
import ih.v3;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import l.w;
import mh.c4;
import na.n;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.ya;
import org.telegram.ui.a61;
import org.telegram.ui.fm;
import org.telegram.ui.nu0;
import y3.i;
import y3.j;
import y3.k;
import ya.l;
public final class d implements y2.b, Continuation, ef.a, a61, jf.a, y8.e, w, m9.a, n, kb, k1, s, y8.d, s0, j {
    public final int f48374a;

    public d(int i9) {
        this.f48374a = i9;
    }

    public static k0 k3(j0 j0Var, n2.w wVar) {
        IOException iOException = (IOException) wVar.f18361c;
        if (iOException instanceof h0) {
            int i9 = ((h0) iOException).d;
            if (i9 == 403 || i9 == 404 || i9 == 410 || i9 == 416 || i9 == 500 || i9 == 503) {
                if (j0Var.a(1)) {
                    return new k0(1, 300000L);
                }
                if (j0Var.a(2)) {
                    return new k0(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static long m3(n2.w wVar) {
        Throwable th = (IOException) wVar.f18361c;
        if (!(th instanceof t1) && !(th instanceof FileNotFoundException) && !(th instanceof e0) && !(th instanceof p0)) {
            int i9 = com.google.android.exoplayer2.upstream.n.f2572b;
            while (th != null) {
                if (!(th instanceof com.google.android.exoplayer2.upstream.n) || ((com.google.android.exoplayer2.upstream.n) th).f2573a != 2008) {
                    th = th.getCause();
                } else {
                    return -9223372036854775807L;
                }
            }
            return Math.min((wVar.f18360b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    public static void z3(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new bc.g("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new bc.g("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    @Override
    public void A0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public void A1(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public void B0() {
        int i9 = this.f48374a;
    }

    @Override
    public int B1(int i9, int i10, int i11) {
        jf.a aVar;
        if (i10 == 6) {
            aVar = jf.a.f14340l;
        } else if (i10 > i11) {
            aVar = jf.a.f14337i;
        } else if (i10 < i11) {
            aVar = jf.a.f14338j;
        } else {
            aVar = jf.a.f14339k;
        }
        return aVar.B1(i9, i10, i11);
    }

    @Override
    public String C(long j10) {
        switch (this.f48374a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void C1(MessageObject messageObject) {
        int i9 = this.f48374a;
    }

    @Override
    public void D0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
        int i9 = this.f48374a;
    }

    @Override
    public void D1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f48374a) {
            case 19:
            default:
                ve.e.s(t1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void E0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        int i9 = this.f48374a;
    }

    @Override
    public CharacterStyle E1(org.telegram.ui.Cells.t1 t1Var) {
        switch (this.f48374a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void F(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public void F0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
        int i11 = this.f48374a;
    }

    @Override
    public k G(i iVar) {
        int i9 = f0.f4349a;
        if (i9 >= 23 && i9 >= 31) {
            int g10 = q.g(iVar.f49502c.B);
            d5.a.v("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + f0.B(g10));
            return new w4.e(g10).G(iVar);
        }
        return new ya.b(26).G(iVar);
    }

    @Override
    public void G0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public boolean G1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void H0(ShortBuffer shortBuffer, int i9, ShortBuffer shortBuffer2, int i10) {
        jf.a aVar;
        if (i9 == 6) {
            aVar = jf.a.f14340l;
        } else if (i9 > i10) {
            aVar = jf.a.f14337i;
        } else if (i9 < i10) {
            aVar = jf.a.f14338j;
        } else {
            aVar = jf.a.f14339k;
        }
        aVar.H0(shortBuffer, i9, shortBuffer2, i10);
    }

    @Override
    public Object H1(b3.b bVar) {
        switch (this.f48374a) {
            case 24:
                ya.a aVar = new ya.a();
                m mVar = new m(6);
                ReferenceQueue referenceQueue = aVar.f49682a;
                Set set = aVar.f49683b;
                set.add(new l(aVar, referenceQueue, set, mVar));
                Thread thread = new Thread(new fm(referenceQueue, set, false, 9), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return aVar;
            default:
                return new ya.k((Context) bVar.a(Context.class));
        }
    }

    @Override
    public void I0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public void I1() {
        int i9 = this.f48374a;
    }

    @Override
    public void J(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public boolean K0(long j10) {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i9 = this.f48374a;
    }

    @Override
    public void M(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i9 = this.f48374a;
    }

    @Override
    public void M0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i9 = this.f48374a;
    }

    @Override
    public void N(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public void O0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        int i10 = this.f48374a;
    }

    @Override
    public boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i9 = this.f48374a;
    }

    @Override
    public nu0 P1() {
        switch (this.f48374a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Q0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i9 = this.f48374a;
    }

    @Override
    public void R(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public void R0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i9 = this.f48374a;
    }

    @Override
    public boolean R1(long j10) {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S(int i9, org.telegram.ui.Cells.t1 t1Var) {
        int i10 = this.f48374a;
    }

    @Override
    public boolean S0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S1(org.telegram.ui.Cells.t1 t1Var, int i9, float f10, float f11, boolean z10) {
        int i10 = this.f48374a;
    }

    @Override
    public void U(MessageObject messageObject) {
        int i9 = this.f48374a;
    }

    @Override
    public void U0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public boolean V(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean W() {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void W0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public boolean W1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean X(org.telegram.ui.Cells.t1 t1Var) {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Y() {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Y0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object Y1() {
        switch (this.f48374a) {
            case 16:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override
    public void Z(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
        int i10 = this.f48374a;
    }

    @Override
    public boolean Z0(MessageObject messageObject) {
        int i9 = this.f48374a;
        return ll.a(messageObject);
    }

    @Override
    public androidx.lifecycle.p0 a(Class cls) {
        return new w1.b();
    }

    @Override
    public void a0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        t6.d dVar = (t6.d) ((t6.e) obj).u();
        l6.b bVar = new l6.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i9 = t6.c.f47705a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f47706a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (y8.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f49621a;
            if (str != null) {
                aVar = new y8.a(str, aVar.f49622b, aVar.f49623c, aVar.d, aVar.f49624e, new v3(2, str, aVar), aVar.f49626g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override
    public int b0() {
        switch (this.f48374a) {
            case 19:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void b2(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public boolean d(Context context) {
        return false;
    }

    @Override
    public pg.a d0() {
        switch (this.f48374a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void d1() {
        int i9 = this.f48374a;
    }

    @Override
    public void e(lb lbVar, wa waVar, ua uaVar, xa xaVar) {
        o1.j jVar = new o1.j(lbVar, lb.IN_OUT_OFFSET_Y, lbVar.getHeight());
        jVar.f18800u.a(0.8f);
        jVar.f18800u.b(400.0f);
        jVar.a(new ya(uaVar, 1));
        jVar.b(new jb(xaVar, lbVar, 0));
        jVar.f();
        waVar.run();
    }

    @Override
    public boolean e0(org.telegram.ui.Cells.t1 t1Var) {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i9 = this.f48374a;
    }

    @Override
    public void e2(org.telegram.ui.Cells.t1 t1Var, long j10) {
        int i9 = this.f48374a;
    }

    @Override
    public boolean f() {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean f0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean f2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g(lb lbVar, wa waVar, fg fgVar, dl dlVar) {
        lbVar.setInOutOffset(lbVar.getMeasuredHeight());
        dlVar.accept(Float.valueOf(lbVar.getTranslationY()));
        o1.j jVar = new o1.j(lbVar, lb.IN_OUT_OFFSET_Y, 0.0f);
        jVar.f18800u.a(0.8f);
        jVar.f18800u.b(400.0f);
        jVar.a(new c4(1, lbVar, fgVar));
        jVar.b(new jb(dlVar, lbVar, 1));
        jVar.f();
        waVar.run();
    }

    @Override
    public void g1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        int i9 = this.f48374a;
    }

    @Override
    public void g2(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public Object mo28get() {
        ya.b bVar = new ya.b(7);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            hashMap.put(t2.d.f47601a, new c3.b(30000L, 86400000L, set));
            if (set != null) {
                hashMap.put(t2.d.f47603c, new c3.b(1000L, 86400000L, set));
                if (set != null) {
                    Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(c3.c.f2284b)));
                    if (unmodifiableSet != null) {
                        hashMap.put(t2.d.f47602b, new c3.b(86400000L, 86400000L, unmodifiableSet));
                        if (hashMap.keySet().size() >= t2.d.values().length) {
                            new HashMap();
                            return new c3.a(bVar, hashMap);
                        }
                        throw new IllegalStateException("Not all priorities have been configured");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            }
            throw new NullPointerException("Null flags");
        }
        throw new NullPointerException("Null flags");
    }

    @Override
    public boolean h() {
        switch (this.f48374a) {
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public String i(org.telegram.ui.Cells.t1 t1Var) {
        switch (this.f48374a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void i0(int i9) {
        int i10 = this.f48374a;
    }

    @Override
    public boolean j(l.k kVar) {
        return false;
    }

    @Override
    public boolean j0() {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public StackTraceElement[] k(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public void k0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        int i9 = this.f48374a;
    }

    @Override
    public void k2() {
        int i9 = this.f48374a;
    }

    @Override
    public void l(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
        int i12 = this.f48374a;
    }

    @Override
    public int l0(org.telegram.ui.Cells.t1 t1Var) {
        switch (this.f48374a) {
            case 19:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void l1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        int i9 = this.f48374a;
    }

    @Override
    public void l2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i9 = this.f48374a;
    }

    public int l3(int i9) {
        if (i9 == 7) {
            return 6;
        }
        return 3;
    }

    @Override
    public void m() {
        int i9 = this.f48374a;
    }

    @Override
    public void m0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public boolean n2(int i9) {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public androidx.lifecycle.p0 o(Class cls, v1.b bVar) {
        return a(cls);
    }

    @Override
    public boolean o0() {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void o2() {
        int i9 = this.f48374a;
    }

    @Override
    public void p2(org.telegram.ui.Cells.t1 t1Var, int i9, int i10) {
        int i11 = this.f48374a;
    }

    @Override
    public void q(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
        int i10 = this.f48374a;
    }

    @Override
    public void q0(String str) {
        int i9 = this.f48374a;
    }

    @Override
    public o9 q2() {
        switch (this.f48374a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void r(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public boolean r0(t5 t5Var) {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean r1() {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s() {
        int i9 = this.f48374a;
    }

    @Override
    public void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        int i9 = this.f48374a;
    }

    @Override
    public void s1(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public void t1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        int i9 = this.f48374a;
    }

    @Override
    public Object then(Task task) {
        return null;
    }

    @Override
    public void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
        int i9 = this.f48374a;
    }

    @Override
    public void v(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public boolean v0(Context context) {
        return false;
    }

    @Override
    public void w() {
        int i9 = this.f48374a;
    }

    @Override
    public void w0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z10) {
        int i9 = this.f48374a;
    }

    @Override
    public void w1(org.telegram.ui.Cells.t1 t1Var, eh.f fVar) {
        int i9 = this.f48374a;
    }

    @Override
    public void x(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public boolean x1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void y1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i9 = this.f48374a;
    }

    @Override
    public void z(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.f48374a;
    }

    @Override
    public boolean z0(MessageObject messageObject) {
        switch (this.f48374a) {
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean z1() {
        switch (this.f48374a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    private final void A() {
    }

    private final void A3() {
    }

    private final void B3() {
    }

    private final void C2() {
    }

    private final void D2() {
    }

    private final void I() {
    }

    private final void K() {
    }

    private final void Q1() {
    }

    private final void T1() {
    }

    private final void n3() {
    }

    private final void o3() {
    }

    private final void r3() {
    }

    private final void s3() {
    }

    private final void v3() {
    }

    private final void w3() {
    }

    private final void y() {
    }

    private final void A2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void B(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void B2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void C0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void D(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void E(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void H(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void J0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void K2(String str) {
    }

    private final void L(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void L0(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void L2(String str) {
    }

    private final void N0(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void O(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void Q2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void R2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void U2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void V0(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void V2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void W2(MessageObject messageObject) {
    }

    private final void X0(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void X2(MessageObject messageObject) {
    }

    private final void Y2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void Z2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void c0(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void c1(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void c3(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void d3(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void e3(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void f1(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void g0(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void g3(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void i2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void i3(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void j2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void j3(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void o1(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void p1(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void q1(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void s2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void t2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void t3(int i9) {
    }

    private final void u1(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void u2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void u3(int i9) {
    }

    private final void v2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void w2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void x0(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void x2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void x3(MessageObject messageObject) {
    }

    private final void y0(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void y3(MessageObject messageObject) {
    }

    private final void K1(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void M2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    private final void N1(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void N2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    private final void P0(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void Q(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void T(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void T0(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void a1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void a3(org.telegram.ui.Cells.t1 t1Var, eh.f fVar) {
    }

    private final void b1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void b3(org.telegram.ui.Cells.t1 t1Var, eh.f fVar) {
    }

    private final void f3(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    private final void h3(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    private final void j1(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void k1(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void m1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void m2(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    private final void n1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void r2(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    private final void t(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void u(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void c(l.k kVar, boolean z10) {
    }

    private final void E2(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void F2(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void S2(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    private final void T2(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    private final void U1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    private final void V1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    private final void h1(org.telegram.ui.Cells.t1 t1Var, int i9, int i10) {
    }

    private final void i1(org.telegram.ui.Cells.t1 t1Var, int i9, int i10) {
    }

    private final void n(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    private final void p(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    private final void p0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void t0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void y2(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    private final void z2(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    private final void G2(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void H2(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void I2(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void J1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z10) {
    }

    private final void J2(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void X1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    private final void Z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    private final void v1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z10) {
    }

    private final void O2(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    private final void P2(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    private final void a2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void c2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void d2(org.telegram.ui.Cells.t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    private final void h2(org.telegram.ui.Cells.t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    private final void h0(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    private final void n0(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    private final void p3(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }

    private final void q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }
}
