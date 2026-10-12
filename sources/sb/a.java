package sb;

import a3.l;
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
import androidx.lifecycle.s0;
import b2.x;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.internal.play_billing.y3;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.m;
import d2.b;
import e2.m0;
import e9.n0;
import gb.o;
import i5.e;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import n2.f;
import n2.g;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.d0;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.x0;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.pg;
import org.telegram.ui.q71;
import org.telegram.ui.un;
import org.telegram.ui.wv0;
import r2.k;
import r9.d;
import rb.h;
import v1.c;
import v7.u6;
import y2.n;
public final class a implements q71, e, cg.a, r9.e, fa.a, o, s, n, n2.n, d, pg, l1, u0, k, OnFailureListener, s0, SuccessContinuation, y6.d {
    public static a f45085b;
    public final int f45086a;

    public a(int i10) {
        this.f45086a = i10;
    }

    public static MediaCodec r2(m mVar) {
        String str = ((r2.o) mVar.f6191a).f43844a;
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
                a2.putByteArray(b.f6294x, byteArrayOutputStream.toByteArray());
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
            aVar = cg.a.f4752o;
        } else if (i11 > i12) {
            aVar = cg.a.f4749k;
        } else if (i11 < i12) {
            aVar = cg.a.f4750l;
        } else {
            aVar = cg.a.f4751m;
        }
        return aVar.E1(i10, i11, i12);
    }

    @Override
    public void G1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.s(u1Var.getContext(), str);
    }

    @Override
    public r2.l H(com.google.firebase.messaging.m r6) {
        throw new UnsupportedOperationException("Method not decompiled: sb.a.H(com.google.firebase.messaging.m):r2.l");
    }

    @Override
    public CharacterStyle H1(u1 u1Var) {
        return null;
    }

    @Override
    public int I0(x xVar) {
        if (xVar.f2522w != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean J0(long j10) {
        return false;
    }

    @Override
    public boolean J1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers K() {
        return null;
    }

    @Override
    public m2 L0() {
        return null;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean O1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
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
            aVar = cg.a.f4752o;
        } else if (i10 > i11) {
            aVar = cg.a.f4749k;
        } else if (i10 < i11) {
            aVar = cg.a.f4750l;
        } else {
            aVar = cg.a.f4751m;
        }
        aVar.P0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override
    public wv0 P1() {
        return null;
    }

    @Override
    public boolean Q(u1 u1Var) {
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
    public boolean S0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean S1(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public g U0(n2.k kVar, x xVar) {
        if (xVar.f2522w == null) {
            return null;
        }
        return new n2.o(new f(6001, new Exception()));
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public p0 W0(Class cls, c cVar) {
        return e(cls);
    }

    @Override
    public ih.a Y() {
        return null;
    }

    @Override
    public int Y0() {
        return 0;
    }

    @Override
    public boolean Z(u1 u1Var) {
        return false;
    }

    @Override
    public boolean Z0(int i10, u1 u1Var) {
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
        int i10 = j7.c.f12878a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f12879a.transact(1, obtain, obtain2, 0);
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
    public boolean b2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public long d() {
        return 0L;
    }

    @Override
    public boolean d1(MessageObject messageObject) {
        return d0.a(messageObject);
    }

    @Override
    public Object d2(Uri uri, g2.k kVar) {
        return Long.valueOf(m0.V(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override
    public p0 e(Class cls) {
        return new w1.b();
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
        switch (this.f45086a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public Object f2() {
        switch (this.f45086a) {
            case 9:
                return new ArrayList();
            default:
                return new gb.n(true);
        }
    }

    @Override
    public String g(u1 u1Var) {
        return null;
    }

    @Override
    public int h0(u1 u1Var) {
        return 0;
    }

    @Override
    public boolean h2(x0 x0Var, float f7, float f10) {
        return false;
    }

    @Override
    public n2.m j0(n2.k kVar, x xVar) {
        return n2.m.f15966u;
    }

    @Override
    public boolean j1() {
        return false;
    }

    @Override
    public Object j2(z5 z5Var) {
        return new rb.d(z5Var.b(h.class));
    }

    @Override
    public boolean l() {
        return false;
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
    public boolean o0(b6 b6Var) {
        return false;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public l p(Context context, String str, y6.c cVar) {
        l lVar = new l();
        lVar.f139a = cVar.y(context, str);
        int i10 = 1;
        int l4 = cVar.l(context, str, true);
        lVar.f140b = l4;
        int i11 = lVar.f139a;
        if (i11 == 0) {
            i11 = 0;
            if (l4 == 0) {
                i10 = 0;
                lVar.f141c = i10;
                return lVar;
            }
        }
        if (l4 < i11) {
            i10 = -1;
        }
        lVar.f141c = i10;
        return lVar;
    }

    @Override
    public un p0() {
        return null;
    }

    @Override
    public p9 p2() {
        return null;
    }

    @Override
    public int q() {
        return 0;
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
    public List v(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (r9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f44029a;
            if (str != null) {
                aVar = new r9.a(str, aVar.f44030b, aVar.f44031c, aVar.d, aVar.e, new h0(9, str, aVar), aVar.f44033g);
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
    public boolean z1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    public a(Object obj, int i10) {
        this.f45086a = i10;
    }

    public a() {
        this.f45086a = 23;
        new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
    }

    @Override
    public void F0() {
    }

    @Override
    public void G() {
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
    public void X() {
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
    public void n1() {
    }

    @Override
    public void n2() {
    }

    @Override
    public void o() {
    }

    @Override
    public void q2() {
    }

    @Override
    public void release() {
    }

    @Override
    public void s() {
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
    public void A(u1 u1Var) {
    }

    @Override
    public void B(u1 u1Var) {
    }

    @Override
    public void C(boolean z10) {
    }

    @Override
    public void C0(u1 u1Var) {
    }

    @Override
    public void D1(u1 u1Var) {
    }

    @Override
    public void E0(u1 u1Var) {
    }

    @Override
    public void F(u1 u1Var) {
    }

    @Override
    public void F1(MessageObject messageObject) {
    }

    @Override
    public void G0(u1 u1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void K0(u1 u1Var) {
    }

    @Override
    public void L(u1 u1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void T(u1 u1Var) {
    }

    @Override
    public void T0(u1 u1Var) {
    }

    @Override
    public void U1(u1 u1Var) {
    }

    @Override
    public void V0(u1 u1Var) {
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
    public void b0(x0 x0Var) {
    }

    @Override
    public void c2(u1 u1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void i0(u1 u1Var) {
    }

    @Override
    public void k0(x0 x0Var) {
    }

    @Override
    public void n(u1 u1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void q1(CharSequence charSequence) {
    }

    @Override
    public void r(u1 u1Var) {
    }

    @Override
    public void r0(x0 x0Var) {
    }

    @Override
    public void s1(long j10) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void t1(x0 x0Var) {
    }

    @Override
    public void u(u1 u1Var) {
    }

    @Override
    public void w1(u1 u1Var) {
    }

    @Override
    public void x0(u1 u1Var) {
    }

    @Override
    public void z(float f7) {
    }

    @Override
    public void A1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void D(Looper looper, j2.k kVar) {
    }

    @Override
    public void D0(int i10, int i11) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void K1(u1 u1Var, t tVar) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void M0(int i10, u1 u1Var) {
    }

    @Override
    public void M1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void O0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void U(float f7, int i10) {
    }

    @Override
    public void W(x0 x0Var, int i10) {
    }

    @Override
    public void W1(u1 u1Var, long j10) {
    }

    @Override
    public void X1(x0 x0Var, String str) {
    }

    @Override
    public void h1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void k1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void x1(u1 u1Var, boolean z10) {
    }

    @Override
    public void A0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void C1(x0 x0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public void R0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void c1(x0 x0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void f0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void g0(x0 x0Var, int i10, int i11) {
    }

    @Override
    public void g1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void o1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void o2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void p1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void z0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void N1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void J(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override
    public void R1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void i2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void k2(x0 x0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
