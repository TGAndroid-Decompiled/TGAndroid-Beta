package t7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.fragment.app.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import ci.u5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import l.w;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.qv0;
import org.telegram.ui.yd;
public class t implements s0, bg.a, c3.g, cg.a, ea.a, fb.n, g2.g, com.google.android.gms.common.api.internal.s, w, n6.k, q9.d, jp0, l1, p2.s, OnFailureListener, r4.c, y6.c {
    public static t f48228a;

    public t(Object obj) {
    }

    @Override
    public boolean A2(int i10) {
        return false;
    }

    public Signature[] C(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public boolean D0(MessageObject messageObject) {
        return true;
    }

    @Override
    public p9 E2() {
        return null;
    }

    @Override
    public boolean H1() {
        return false;
    }

    @Override
    public boolean M1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean O1() {
        return false;
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R(u1 u1Var) {
        return false;
    }

    @Override
    public boolean R0(long j3) {
        return false;
    }

    @Override
    public int R1(int i10, int i11, int i12) {
        bg.a aVar;
        if (i11 == 6) {
            aVar = bg.a.f3890l;
        } else if (i11 > i12) {
            aVar = bg.a.f3887i;
        } else if (i11 < i12) {
            aVar = bg.a.f3888j;
        } else {
            aVar = bg.a.f3889k;
        }
        return aVar.R1(i10, i11, i12);
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(u1Var.getContext(), str);
    }

    @Override
    public CharacterStyle U1(u1 u1Var) {
        return null;
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public boolean W1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void X(float f7, boolean z10) {
        yd.f44316b = f7 * 2.0f;
    }

    @Override
    public hh.a Y() {
        return null;
    }

    @Override
    public void Y0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        bg.a aVar;
        if (i10 == 6) {
            aVar = bg.a.f3890l;
        } else if (i10 > i11) {
            aVar = bg.a.f3887i;
        } else if (i10 < i11) {
            aVar = bg.a.f3888j;
        } else {
            aVar = bg.a.f3889k;
        }
        aVar.Y0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override
    public p0 a(Class cls) {
        return new n0(true);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        j7.d dVar = (j7.d) ((j7.e) obj).u();
        b7.b bVar = new b7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = j7.c.f14067a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f14068a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override
    public boolean b0(u1 u1Var) {
        return false;
    }

    @Override
    public boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean c1(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public g2.h createDataSource() {
        return new g2.c(false);
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean e0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public qv0 e2() {
        return null;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public String g(u1 u1Var) {
        return null;
    }

    @Override
    public boolean g2(long j3) {
        return false;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public p0 h(Class cls, v1.b bVar) {
        return a(cls);
    }

    @Override
    public boolean h0() {
        return false;
    }

    @Override
    public int i0() {
        return 0;
    }

    @Override
    public boolean i1(int i10, u1 u1Var) {
        return false;
    }

    @Override
    public boolean i2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public StackTraceElement[] l(StackTraceElement[] stackTraceElementArr) {
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
    public int l0(u1 u1Var) {
        return 0;
    }

    @Override
    public int m(Context context, String str, boolean z10) {
        return y6.e.d(context, str, z10);
    }

    @Override
    public boolean n1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public int q(Context context, String str) {
        return y6.e.a(context, str);
    }

    @Override
    public boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean t0(b6 b6Var) {
        return false;
    }

    @Override
    public boolean v(l.k kVar) {
        return false;
    }

    @Override
    public Object v2() {
        return new ConcurrentSkipListMap();
    }

    @Override
    public String w(long j3) {
        return null;
    }

    @Override
    public y2.n x() {
        return new p2.r(p2.o.f45258n, null);
    }

    @Override
    public void x0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 <= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(hg.c.h(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i12;
            int ceil = ((int) Math.ceil((i11 / i10) * remaining)) - remaining;
            float f7 = remaining;
            float f10 = f7 / f7;
            float f11 = ceil;
            float f12 = f11 / f11;
            while (remaining > 0 && ceil > 0) {
                if (f10 >= f12) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    remaining--;
                    f10 = remaining / f7;
                } else {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                    }
                    ceil--;
                    f12 = ceil / f11;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
    }

    @Override
    public y2.n y(p2.o oVar, p2.l lVar) {
        return new p2.r(oVar, lVar);
    }

    @Override
    public Object y0(u5 u5Var) {
        return new qb.d(u5Var.c(qb.h.class));
    }

    @Override
    public void C2() {
    }

    @Override
    public void F0() {
    }

    @Override
    public void H() {
    }

    @Override
    public void X1() {
    }

    @Override
    public void k() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q1() {
    }

    @Override
    public void s() {
    }

    @Override
    public void w2() {
    }

    @Override
    public void z() {
    }

    @Override
    public void A(u1 u1Var) {
    }

    @Override
    public void B(u1 u1Var) {
    }

    @Override
    public void E0(u1 u1Var) {
    }

    @Override
    public void G(u1 u1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(u1 u1Var) {
    }

    @Override
    public void J1(u1 u1Var) {
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
    public void N0(u1 u1Var) {
    }

    @Override
    public void Q1(u1 u1Var) {
    }

    @Override
    public void S0(u1 u1Var) {
    }

    @Override
    public void S1(MessageObject messageObject) {
    }

    @Override
    public void U(u1 u1Var) {
    }

    @Override
    public long c(long j3) {
        return j3;
    }

    @Override
    public void d1(u1 u1Var) {
    }

    @Override
    public void f1(u1 u1Var) {
    }

    @Override
    public void g0(int i10) {
    }

    @Override
    public void k2(u1 u1Var) {
    }

    @Override
    public void m0(u1 u1Var) {
    }

    @Override
    public void o(u1 u1Var) {
    }

    @Override
    public void r(u1 u1Var) {
    }

    @Override
    public void r0(String str) {
    }

    @Override
    public void s2(u1 u1Var) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void u(u1 u1Var) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void J(int i10, Object obj) {
    }

    @Override
    public void K1(u1 u1Var, boolean z10) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void V0(int i10, u1 u1Var) {
    }

    @Override
    public void X0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void d(l.k kVar, boolean z10) {
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
    }

    @Override
    public void m2(u1 u1Var, long j3) {
    }

    @Override
    public void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void v1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void A1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void D2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void G0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void H0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void b1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void j0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void A0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void C0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void y2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void T(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
