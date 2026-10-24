package sb;

import ah.h0;
import ah.t;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.p0;
import b2.w;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.internal.play_billing.y3;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.l;
import d2.b;
import e2.m0;
import e9.n0;
import gb.m;
import gb.n;
import i5.e;
import j$.util.Objects;
import j2.j;
import j7.c;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import n2.g;
import n2.h;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.b1;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.y5;
import org.telegram.ui.in;
import org.telegram.ui.xu0;
import org.telegram.ui.z51;
import r2.k;
import r2.o;
import r9.d;
import v7.u6;
public final class a implements z51, e, cg.a, r9.e, fa.a, n, r, y2.n, n2.n, d, mg, k1, s0, k, OnFailureListener, androidx.lifecycle.s0, SuccessContinuation, y6.d {
    public static a f46586b;
    public final int f46587a;

    public a(int i10) {
        this.f46587a = i10;
    }

    public static MediaCodec r2(l lVar) {
        String str = ((o) lVar.f7657a).f45356a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static byte[] s2(n0 n0Var, long j10) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(n0Var.size());
        Iterator<E> it = n0Var.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            Bundle a2 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                u6.p(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a2.putByteArray(b.f7762x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a2);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j10);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static boolean t2(q1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: sb.a.t2(q1.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static final CharSequence u2(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    @Override
    public boolean B0() {
        return true;
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public int E1(int i10, int i11, int i12) {
        cg.a aVar;
        if (i11 == 6) {
            aVar = cg.a.f5128o;
        } else if (i11 > i12) {
            aVar = cg.a.f5125k;
        } else if (i11 < i12) {
            aVar = cg.a.f5126l;
        } else {
            aVar = cg.a.f5127m;
        }
        return aVar.E1(i10, i11, i12);
    }

    @Override
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(t1Var.getContext(), str);
    }

    @Override
    public CharacterStyle H1(t1 t1Var) {
        return null;
    }

    @Override
    public int I0(w wVar) {
        if (wVar.f4138w != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public r2.l J(com.google.firebase.messaging.l r6) {
        throw new UnsupportedOperationException("Method not decompiled: sb.a.J(com.google.firebase.messaging.l):r2.l");
    }

    @Override
    public boolean J0(long j10) {
        return false;
    }

    @Override
    public boolean J1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public o2 L0() {
        return null;
    }

    @Override
    public boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers O() {
        return null;
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
    public void P0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        cg.a aVar;
        if (i10 == 6) {
            aVar = cg.a.f5128o;
        } else if (i10 > i11) {
            aVar = cg.a.f5125k;
        } else if (i10 < i11) {
            aVar = cg.a.f5126l;
        } else {
            aVar = cg.a.f5127m;
        }
        aVar.P0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override
    public xu0 P1() {
        return null;
    }

    @Override
    public boolean Q(t1 t1Var) {
        return false;
    }

    @Override
    public boolean Q1(long j10) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean S1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public h U0(n2.k kVar, w wVar) {
        if (wVar.f4138w == null) {
            return null;
        }
        return new n2.o(new g(6001, new Exception()));
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public ih.a W() {
        return null;
    }

    @Override
    public p0 W0(Class cls, v1.b bVar) {
        return c(cls);
    }

    @Override
    public int Y0() {
        return 0;
    }

    @Override
    public boolean Z(t1 t1Var) {
        return false;
    }

    @Override
    public boolean Z0(int i10, t1 t1Var) {
        return false;
    }

    @Override
    public long a() {
        return 0L;
    }

    @Override
    public TL_stories.StoryItem a1() {
        return null;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        j7.d dVar = (j7.d) ((j7.e) obj).u();
        b7.b bVar = new b7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = c.f14339a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f14340a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public Object apply(Object obj) {
        return ((y3) obj).a();
    }

    @Override
    public boolean b1(long j10) {
        return false;
    }

    @Override
    public boolean b2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public p0 c(Class cls) {
        return new w1.b();
    }

    @Override
    public boolean c0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public long d() {
        return 0L;
    }

    @Override
    public boolean d1(MessageObject messageObject) {
        return b1.a(messageObject);
    }

    @Override
    public Object d2(Uri uri, g2.k kVar) {
        return Long.valueOf(m0.V(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public boolean e1() {
        return false;
    }

    @Override
    public boolean f() {
        switch (this.f46587a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public Object f2() {
        switch (this.f46587a) {
            case 9:
                return new ArrayList();
            default:
                return new m(true);
        }
    }

    @Override
    public String g(t1 t1Var) {
        return null;
    }

    @Override
    public int h0(t1 t1Var) {
        return 0;
    }

    @Override
    public boolean h2(v0 v0Var, float f7, float f10) {
        return false;
    }

    @Override
    public n2.m j0(n2.k kVar, w wVar) {
        return n2.m.f17123u;
    }

    @Override
    public boolean j1() {
        return false;
    }

    @Override
    public Object j2(z5 z5Var) {
        return new rb.d(z5Var.b(rb.h.class));
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public boolean l2(int i10) {
        return false;
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    public boolean o0(y5 y5Var) {
        return false;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public in p0() {
        return null;
    }

    @Override
    public p9 p2() {
        return null;
    }

    @Override
    public a3.l r(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        lVar.f139a = cVar.y(context, str);
        int i10 = 1;
        int o10 = cVar.o(context, str, true);
        lVar.f140b = o10;
        int i11 = lVar.f139a;
        if (i11 == 0) {
            i11 = 0;
            if (o10 == 0) {
                i10 = 0;
                lVar.f141c = i10;
                return lVar;
            }
        }
        if (o10 < i11) {
            i10 = -1;
        }
        lVar.f141c = i10;
        return lVar;
    }

    @Override
    public boolean r1() {
        return false;
    }

    @Override
    public StackTraceElement[] s0(StackTraceElement[] stackTraceElementArr) {
        int i10;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i14 = i11 - intValue;
                if (i11 + i14 <= stackTraceElementArr.length) {
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (stackTraceElementArr[intValue + i15].equals(stackTraceElementArr[i11 + i15])) {
                        }
                    }
                    int intValue2 = i11 - num.intValue();
                    if (i13 < 10) {
                        System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, intValue2);
                        i12 += intValue2;
                        i13++;
                    }
                    i10 = (intValue2 - 1) + i11;
                    hashMap.put(stackTraceElement, Integer.valueOf(i11));
                    i11 = i10 + 1;
                }
            }
            stackTraceElementArr2[i12] = stackTraceElementArr[i11];
            i12++;
            i13 = 1;
            i10 = i11;
            hashMap.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        if (i12 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public int u() {
        return 0;
    }

    @Override
    public List v(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (r9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f45541a;
            if (str != null) {
                aVar = new r9.a(str, aVar.f45542b, aVar.f45543c, aVar.d, aVar.e, new h0(11, str, aVar), aVar.f45545g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override
    public boolean v1() {
        return false;
    }

    @Override
    public String w(long j10) {
        return null;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public TLRPC.Peer x() {
        return null;
    }

    @Override
    public boolean z1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    public a(Object obj, int i10) {
        this.f46587a = i10;
    }

    public a() {
        this.f46587a = 23;
        new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
    }

    @Override
    public void F0() {
    }

    @Override
    public void H() {
    }

    @Override
    public void H0() {
    }

    @Override
    public void L1() {
    }

    @Override
    public void Q0() {
    }

    @Override
    public void T1() {
    }

    @Override
    public void Y() {
    }

    @Override
    public void Y1() {
    }

    @Override
    public void b() {
    }

    @Override
    public void e2() {
    }

    @Override
    public void f1() {
    }

    @Override
    public void g2() {
    }

    @Override
    public void h() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void j() {
    }

    @Override
    public void k() {
    }

    @Override
    public void l1() {
    }

    @Override
    public void m0() {
    }

    @Override
    public void m1() {
    }

    @Override
    public void m2() {
    }

    @Override
    public void n() {
    }

    @Override
    public void n1() {
    }

    @Override
    public void n2() {
    }

    @Override
    public void q() {
    }

    @Override
    public void q2() {
    }

    @Override
    public void release() {
    }

    @Override
    public void t0() {
    }

    @Override
    public void u1() {
    }

    @Override
    public void y() {
    }

    @Override
    public void y0() {
    }

    @Override
    public void y1() {
    }

    @Override
    public void A(t1 t1Var) {
    }

    @Override
    public void B(t1 t1Var) {
    }

    @Override
    public void C(boolean z10) {
    }

    @Override
    public void C0(t1 t1Var) {
    }

    @Override
    public void D1(t1 t1Var) {
    }

    @Override
    public void E0(t1 t1Var) {
    }

    @Override
    public void F(t1 t1Var) {
    }

    @Override
    public void F1(MessageObject messageObject) {
    }

    @Override
    public void G(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void G0(t1 t1Var) {
    }

    @Override
    public void I(t1 t1Var) {
    }

    @Override
    public void K0(t1 t1Var) {
    }

    @Override
    public void M(MessageObject messageObject) {
    }

    @Override
    public void N0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void T(t1 t1Var) {
    }

    @Override
    public void T0(t1 t1Var) {
    }

    @Override
    public void U1(t1 t1Var) {
    }

    @Override
    public void V0(t1 t1Var) {
    }

    @Override
    public void V1(int i10) {
    }

    @Override
    public void X0(int i10) {
    }

    @Override
    public void Z1(boolean z10) {
    }

    @Override
    public void a0(boolean z10) {
    }

    @Override
    public void b0(v0 v0Var) {
    }

    @Override
    public void c2(t1 t1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void i0(t1 t1Var) {
    }

    @Override
    public void k0(v0 v0Var) {
    }

    @Override
    public void m(t1 t1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void p(t1 t1Var) {
    }

    @Override
    public void q1(CharSequence charSequence) {
    }

    @Override
    public void r0(v0 v0Var) {
    }

    @Override
    public void s(t1 t1Var) {
    }

    @Override
    public void s1(long j10) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void t1(v0 v0Var) {
    }

    @Override
    public void w1(t1 t1Var) {
    }

    @Override
    public void x0(t1 t1Var) {
    }

    @Override
    public void z(float f7) {
    }

    @Override
    public void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void D0(int i10, int i11) {
    }

    @Override
    public void E(Looper looper, j jVar) {
    }

    @Override
    public void K(int i10, t1 t1Var) {
    }

    @Override
    public void K1(t1 t1Var, t tVar) {
    }

    @Override
    public void M0(int i10, t1 t1Var) {
    }

    @Override
    public void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void O0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void U(float f7, int i10) {
    }

    @Override
    public void W1(t1 t1Var, long j10) {
    }

    @Override
    public void X(v0 v0Var, int i10) {
    }

    @Override
    public void X1(v0 v0Var, String str) {
    }

    @Override
    public void h1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void k1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void x1(t1 t1Var, boolean z10) {
    }

    @Override
    public void A0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void C1(v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void c1(v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void f0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void g0(v0 v0Var, int i10, int i11) {
    }

    @Override
    public void g1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void o1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void o2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void p1(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void q0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void z0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void L(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override
    public void R1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void i2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void k2(v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
