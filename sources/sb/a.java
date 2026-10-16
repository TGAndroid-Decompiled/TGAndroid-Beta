package sb;

import ah.h0;
import ah.t;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.CharacterStyle;
import android.view.View;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import b2.x;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.internal.play_billing.y3;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import d2.b;
import e2.m0;
import e9.n0;
import g2.k;
import gb.o;
import gb.p;
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
import n2.j;
import n2.l;
import n2.m;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.pg;
import org.telegram.ui.q71;
import org.telegram.ui.un;
import org.telegram.ui.vv0;
import r2.u;
import r9.d;
import rb.h;
import v1.c;
import v7.u6;
import y2.n;
public final class a implements q71, e, cg.a, r9.e, fa.a, p, s, n, m, d, pg, l1, t0, u, s0, SuccessContinuation, y6.d {
    public static a f45085b;
    public final int f45086a;

    public a(int i10) {
        this.f45086a = i10;
    }

    public static byte[] v2(n0 n0Var, long j10) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(n0Var.size());
        Iterator<E> it = n0Var.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            Bundle a2 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                u6.p(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a2.putByteArray(b.f6297x, byteArrayOutputStream.toByteArray());
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

    public static boolean w2(q1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: sb.a.w2(q1.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static final CharSequence x2(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    @Override
    public boolean A1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean C0() {
        return true;
    }

    @Override
    public boolean C1() {
        return false;
    }

    @Override
    public int F1(int i10, int i11, int i12) {
        cg.a aVar;
        if (i11 == 6) {
            aVar = cg.a.f4755o;
        } else if (i11 > i12) {
            aVar = cg.a.f4752k;
        } else if (i11 < i12) {
            aVar = cg.a.f4753l;
        } else {
            aVar = cg.a.f4754m;
        }
        return aVar.F1(i10, i11, i12);
    }

    @Override
    public boolean G1(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public int I1() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public int J0(x xVar) {
        if (xVar.f2526w != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public void J1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers K() {
        return null;
    }

    @Override
    public boolean K0(long j10) {
        return false;
    }

    @Override
    public CharacterStyle K1(u1 u1Var) {
        return null;
    }

    @Override
    public m2 M0() {
        return null;
    }

    @Override
    public boolean M1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean Q(u1 u1Var) {
        return false;
    }

    @Override
    public void Q0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        cg.a aVar;
        if (i10 == 6) {
            aVar = cg.a.f4755o;
        } else if (i10 > i11) {
            aVar = cg.a.f4752k;
        } else if (i10 < i11) {
            aVar = cg.a.f4753l;
        } else {
            aVar = cg.a.f4754m;
        }
        aVar.Q0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public vv0 S1() {
        return null;
    }

    @Override
    public boolean T0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean T1(long j10) {
        return false;
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public g V0(j jVar, x xVar) {
        if (xVar.f2526w == null) {
            return null;
        }
        return new n2.n(new f(6001, new Exception()));
    }

    @Override
    public boolean V1(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public p0 X0(Class cls, c cVar) {
        return f(cls);
    }

    @Override
    public ih.a Y() {
        return null;
    }

    @Override
    public boolean Z(u1 u1Var) {
        return false;
    }

    @Override
    public int Z0() {
        return 0;
    }

    @Override
    public long a() {
        return 0L;
    }

    @Override
    public boolean a1(int i10, u1 u1Var) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        j7.d dVar = (j7.d) ((j7.e) obj).u();
        b7.b bVar = new b7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = j7.c.f12882a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f12883a.transact(1, obtain, obtain2, 0);
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
    public TL_stories.StoryItem b1() {
        return null;
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
    public boolean c1(long j10) {
        return false;
    }

    @Override
    public long d() {
        return 0L;
    }

    @Override
    public boolean e() {
        switch (this.f45086a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public boolean e1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override
    public boolean e2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public p0 f(Class cls) {
        return new w1.b();
    }

    @Override
    public boolean f1() {
        return false;
    }

    @Override
    public String g(u1 u1Var) {
        return null;
    }

    @Override
    public Object g2(Uri uri, k kVar) {
        return Long.valueOf(m0.V(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override
    public int h0(u1 u1Var) {
        return 0;
    }

    @Override
    public Object i2() {
        switch (this.f45086a) {
            case 9:
                return new ArrayList();
            default:
                return new o(true);
        }
    }

    @Override
    public l j0(j jVar, x xVar) {
        return l.f15677u;
    }

    @Override
    public boolean k1() {
        return false;
    }

    @Override
    public boolean k2(w0 w0Var, float f7, float f10) {
        return false;
    }

    @Override
    public MediaCodecInfo l(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public boolean m2() {
        return false;
    }

    @Override
    public Object n2(z5 z5Var) {
        return new rb.d(z5Var.b(h.class));
    }

    @Override
    public boolean o0(b6 b6Var) {
        return false;
    }

    @Override
    public boolean p() {
        return false;
    }

    @Override
    public un p0() {
        return null;
    }

    @Override
    public boolean p2(int i10) {
        return false;
    }

    @Override
    public a3.l q(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        lVar.f139a = cVar.H(context, str);
        int i10 = 1;
        int q6 = cVar.q(context, str, true);
        lVar.f140b = q6;
        int i11 = lVar.f139a;
        if (i11 == 0) {
            i11 = 0;
            if (q6 == 0) {
                i10 = 0;
                lVar.f141c = i10;
                return lVar;
            }
        }
        if (q6 < i11) {
            i10 = -1;
        }
        lVar.f141c = i10;
        return lVar;
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
    public boolean s1() {
        return false;
    }

    @Override
    public p9 t2() {
        return null;
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public int v() {
        return 0;
    }

    @Override
    public List w(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (r9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f43788a;
            if (str != null) {
                aVar = new r9.a(str, aVar.f43789b, aVar.f43790c, aVar.d, aVar.e, new h0(9, str, aVar), aVar.f43792g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override
    public boolean w0(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean w1() {
        return false;
    }

    @Override
    public String x(long j10) {
        return null;
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override
    public TLRPC.Peer y() {
        return null;
    }

    public a(Object obj, int i10) {
        this.f45086a = i10;
    }

    public a() {
        this.f45086a = 23;
        new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
    }

    @Override
    public void G0() {
    }

    @Override
    public void H() {
    }

    @Override
    public void I0() {
    }

    @Override
    public void O1() {
    }

    @Override
    public void R0() {
    }

    @Override
    public void W1() {
    }

    @Override
    public void X() {
    }

    @Override
    public void b() {
    }

    @Override
    public void b2() {
    }

    @Override
    public void g1() {
    }

    @Override
    public void h() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void j1() {
    }

    @Override
    public void j2() {
    }

    @Override
    public void k() {
    }

    @Override
    public void m0() {
    }

    @Override
    public void m1() {
    }

    @Override
    public void n1() {
    }

    @Override
    public void o() {
    }

    @Override
    public void o1() {
    }

    @Override
    public void q2() {
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
    public void t0() {
    }

    @Override
    public void u2() {
    }

    @Override
    public void v1() {
    }

    @Override
    public void z() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void z1() {
    }

    @Override
    public void A(float f7) {
    }

    @Override
    public void B(u1 u1Var) {
    }

    @Override
    public void C(u1 u1Var) {
    }

    @Override
    public void D(boolean z10) {
    }

    @Override
    public void D0(u1 u1Var) {
    }

    @Override
    public void E1(u1 u1Var) {
    }

    @Override
    public void F0(u1 u1Var) {
    }

    @Override
    public void G(u1 u1Var) {
    }

    @Override
    public void H0(u1 u1Var) {
    }

    @Override
    public void H1(MessageObject messageObject) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void L(u1 u1Var) {
    }

    @Override
    public void L0(u1 u1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void O0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void T(u1 u1Var) {
    }

    @Override
    public void U0(u1 u1Var) {
    }

    @Override
    public void W0(u1 u1Var) {
    }

    @Override
    public void X1(u1 u1Var) {
    }

    @Override
    public void Y0(int i10) {
    }

    @Override
    public void Y1(int i10) {
    }

    @Override
    public void a0(boolean z10) {
    }

    @Override
    public void b0(w0 w0Var) {
    }

    @Override
    public void c2(boolean z10) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void f2(u1 u1Var) {
    }

    @Override
    public void i0(u1 u1Var) {
    }

    @Override
    public void k0(w0 w0Var) {
    }

    @Override
    public void n(u1 u1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void r(u1 u1Var) {
    }

    @Override
    public void r0(w0 w0Var) {
    }

    @Override
    public void r1(CharSequence charSequence) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void t1(long j10) {
    }

    @Override
    public void u(u1 u1Var) {
    }

    @Override
    public void u1(w0 w0Var) {
    }

    @Override
    public void x1(u1 u1Var) {
    }

    @Override
    public void y0(u1 u1Var) {
    }

    @Override
    public void B1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void E0(int i10, int i11) {
    }

    @Override
    public void F(Looper looper, j2.k kVar) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void N0(int i10, u1 u1Var) {
    }

    @Override
    public void N1(u1 u1Var, t tVar) {
    }

    @Override
    public void P0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void P1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void U(float f7, int i10) {
    }

    @Override
    public void W(w0 w0Var, int i10) {
    }

    @Override
    public void Z1(u1 u1Var, long j10) {
    }

    @Override
    public void a2(w0 w0Var, String str) {
    }

    @Override
    public void i1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void l1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void y1(u1 u1Var, boolean z10) {
    }

    @Override
    public void A0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void D1(w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public void S0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void d1(w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void f0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void g0(w0 w0Var, int i10, int i11) {
    }

    @Override
    public void h1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void p1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void q0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void s2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void Q1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
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
    public void U1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void l2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void o2(w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void d2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }

    @Override
    public void L1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
