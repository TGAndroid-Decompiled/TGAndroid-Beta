package w7;

import a8.r7;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import androidx.fragment.app.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.gms.internal.play_billing.x3;
import d3.i0;
import e2.u;
import e2.x1;
import f3.y;
import j$.util.Objects;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import l.w;
import org.telegram.messenger.fj;
import org.telegram.messenger.ij;
import org.telegram.messenger.o10;
import org.telegram.messenger.o2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.r5;
import org.telegram.ui.fr0;
public class s implements s0, b7.e, c4.k, i0, eg.a, l5.e, fg.a, ja.a, w, u9.d, l1, q6.l, sg.l1, x5.a {
    public static s f57609b;
    public final int f57610a;

    public s(int i7, boolean z9) {
        this.f57610a = i7;
    }

    @Override
    public boolean A(l.k kVar) {
        return false;
    }

    @Override
    public void A0(q1 q1Var, TLObject tLObject, boolean z9) {
        int i7 = this.f57610a;
    }

    @Override
    public void A1(ij ijVar) {
        int i7 = this.f57610a;
    }

    @Override
    public StackTraceElement[] B(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public void B0(q1 q1Var, float f10, float f11) {
        int i7 = this.f57610a;
    }

    @Override
    public void B1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        switch (this.f57610a) {
            case 17:
            case 18:
            default:
                vf.c.t(q1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void C(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public CharacterStyle C1(q1 q1Var) {
        switch (this.f57610a) {
            case 17:
                return null;
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int D(u uVar) {
        String str = uVar.f10615s;
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
        throw new IllegalArgumentException(rf.b.i("Unsupported MIME type: ", str));
    }

    @Override
    public void D0(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public void D1(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
        int i11 = this.f57610a;
    }

    @Override
    public void E0(q1 q1Var, boolean z9, boolean z10) {
        int i7 = this.f57610a;
    }

    @Override
    public boolean E1(q1 q1Var, ij ijVar) {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void F1() {
        int i7 = this.f57610a;
    }

    @Override
    public void G(q1 q1Var, o2 o2Var) {
        int i7 = this.f57610a;
    }

    @Override
    public void G0(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public void H(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public void H0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i11 = 0; i11 < min; i11++) {
            short s5 = shortBuffer.get();
            shortBuffer2.put(s5);
            shortBuffer2.put(s5);
        }
    }

    @Override
    public void H1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i7 = this.f57610a;
    }

    @Override
    public void I1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7 = this.f57610a;
    }

    @Override
    public void J(fj fjVar) {
        int i7 = this.f57610a;
    }

    @Override
    public boolean J0(long j3) {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean J1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
        int i7 = this.f57610a;
    }

    @Override
    public void K0(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public void K1(q1 q1Var, o10 o10Var) {
        int i7 = this.f57610a;
    }

    @Override
    public void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i7 = this.f57610a;
    }

    @Override
    public void N(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public void N0(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
        int i7 = this.f57610a;
    }

    @Override
    public fr0 N1() {
        switch (this.f57610a) {
            case 17:
                return null;
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean O0(q1 q1Var, boolean z9) {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P(ij ijVar) {
        int i7 = this.f57610a;
    }

    @Override
    public void P0(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public void P1(String str, String str2) {
        int i7 = this.f57610a;
    }

    @Override
    public boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q0(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public boolean Q1(long j3) {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R() {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R1(q1 q1Var, int i7, float f10, float f11, boolean z9) {
        int i10 = this.f57610a;
    }

    @Override
    public boolean S(q1 q1Var) {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean S1(q1 q1Var, TLRPC.TodoItem todoItem) {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean T() {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
        int i10 = this.f57610a;
    }

    @Override
    public void U1(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public void V(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public boolean W0(ij ijVar) {
        int i7 = this.f57610a;
        return f1.a(ijVar);
    }

    @Override
    public void W1(q1 q1Var, long j3) {
        int i7 = this.f57610a;
    }

    @Override
    public int X() {
        switch (this.f57610a) {
            case 17:
                return 0;
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public jh.a Z() {
        switch (this.f57610a) {
            case 17:
                return null;
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Z0() {
        int i7 = this.f57610a;
    }

    @Override
    public boolean a0(q1 q1Var) {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override
    public boolean b0(q1 q1Var, TLRPC.User user) {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.f57610a;
    }

    @Override
    public boolean b2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c2(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public boolean d() {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d0(int i7) {
        int i10 = this.f57610a;
    }

    @Override
    public Object e(r7 r7Var) {
        switch (this.f57610a) {
            case 14:
                pb.g gVar = (pb.g) r7Var.a(pb.g.class);
                return new qb.a(0);
            case 15:
                pb.a aVar = (pb.a) r7Var.a(pb.a.class);
                return new pb.b(0);
            case 20:
                return new pb.k((Context) r7Var.a(Context.class));
            default:
                return new Object();
        }
    }

    @Override
    public boolean e0() {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e2() {
        int i7 = this.f57610a;
    }

    @Override
    public b7.d f0(Context context, String str, b7.c cVar) {
        b7.d dVar = new b7.d();
        dVar.f2991a = cVar.q(context, str);
        int i7 = 1;
        int m10 = cVar.m(context, str, true);
        dVar.f2992b = m10;
        int i10 = dVar.f2991a;
        if (i10 == 0) {
            i10 = 0;
            if (m10 == 0) {
                i7 = 0;
                dVar.f2993c = i7;
                return dVar;
            }
        }
        if (m10 < i10) {
            i7 = -1;
        }
        dVar.f2993c = i7;
        return dVar;
    }

    @Override
    public void f2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
        int i7 = this.f57610a;
    }

    @Override
    public boolean g() {
        switch (this.f57610a) {
            case 17:
                return true;
            case 18:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void g0(q1 q1Var, float f10, float f11) {
        int i7 = this.f57610a;
    }

    @Override
    public void g1(q1 q1Var, int i7) {
        int i10 = this.f57610a;
    }

    @Override
    public boolean g2(int i7) {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String h(q1 q1Var) {
        switch (this.f57610a) {
            case 17:
                return null;
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int h0(q1 q1Var) {
        switch (this.f57610a) {
            case 17:
                return 0;
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public p0 i(Class cls) {
        return new l0(true);
    }

    @Override
    public void i0(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public void i2() {
        int i7 = this.f57610a;
    }

    @Override
    public void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
        int i12 = this.f57610a;
    }

    @Override
    public void j1(q1 q1Var, float f10, float f11) {
        int i7 = this.f57610a;
    }

    @Override
    public void j2(q1 q1Var, int i7, int i10) {
        int i11 = this.f57610a;
    }

    @Override
    public void k() {
        int i7 = this.f57610a;
    }

    @Override
    public boolean k0() {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public j9 k2() {
        switch (this.f57610a) {
            case 17:
                return null;
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public c4.m l(u uVar) {
        String str = uVar.f10615s;
        List list = uVar.v;
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
                    return new e4.h(list);
                case 1:
                    return new ui.e(2);
                case 2:
                    return new y(1);
                case 3:
                    return new j2.n(4);
                case 4:
                    return new j4.a(list);
                case 5:
                    return new g4.a(list);
                case 6:
                    return new k4.b(list);
                case 7:
                    return new h4.a();
                case '\b':
                    return new i4.d();
            }
        }
        throw new IllegalArgumentException(rf.b.i("Unsupported MIME type: ", str));
    }

    @Override
    public void m0(String str) {
        int i7 = this.f57610a;
    }

    @Override
    public void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10 = this.f57610a;
    }

    @Override
    public boolean n0(r5 r5Var) {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean n1() {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void o(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public void p() {
        int i7 = this.f57610a;
    }

    @Override
    public void p0(q1 q1Var, float f10, float f11) {
        int i7 = this.f57610a;
    }

    @Override
    public boolean p1(q1 q1Var, int i7) {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void q0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 == i10) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }

    @Override
    public void q1(q1 q1Var, boolean z9, boolean z10) {
        int i7 = this.f57610a;
    }

    @Override
    public void r(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public void r1(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public long s() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
        int i7 = this.f57610a;
    }

    @Override
    public void s1(q1 q1Var, boolean z9) {
        int i7 = this.f57610a;
    }

    @Override
    public p0 t(Class cls, y1.b bVar) {
        return i(cls);
    }

    @Override
    public void u() {
        int i7 = this.f57610a;
    }

    @Override
    public void u0(q1 q1Var, float f10, float f11, boolean z9) {
        int i7 = this.f57610a;
    }

    @Override
    public boolean u1(q1 q1Var, TLRPC.Chat chat) {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void v(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public void v1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.f57610a;
    }

    @Override
    public boolean w(u uVar) {
        String str = uVar.f10615s;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override
    public boolean w1() {
        switch (this.f57610a) {
            case 17:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void x(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public boolean x0(ij ijVar) {
        switch (this.f57610a) {
            case 17:
                return true;
            case 18:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void x1(q1 q1Var, int i7) {
        int i10 = this.f57610a;
    }

    @Override
    public String y(long j3) {
        switch (this.f57610a) {
            case 17:
                return null;
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void y0(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public void y1(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public void z(q1 q1Var) {
        int i7 = this.f57610a;
    }

    @Override
    public void z0() {
        int i7 = this.f57610a;
    }

    @Override
    public int z1(int i7, int i10, int i11) {
        return i7 * 2;
    }

    public Signature[] z4(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public s(int i7) {
        this.f57610a = i7;
        switch (i7) {
            case 22:
                new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 35) {
                    return;
                }
                return;
        }
    }

    private final void A4() {
    }

    private final void B4() {
    }

    private final void C0() {
    }

    private final void C4() {
    }

    private final void F0() {
    }

    private final void H4() {
    }

    private final void I4() {
    }

    private final void J2() {
    }

    private final void J4() {
    }

    private final void K2() {
    }

    private final void L2() {
    }

    private final void N4() {
    }

    private final void O4() {
    }

    private final void P4() {
    }

    private final void T4() {
    }

    private final void U4() {
    }

    private final void V4() {
    }

    private final void W() {
    }

    private final void Y() {
    }

    private final void c0() {
    }

    private final void w0() {
    }

    private final void w3() {
    }

    private final void x3() {
    }

    private final void y3() {
    }

    @Override
    public void f() {
    }

    @Override
    public void m() {
    }

    @Override
    public void onFirstFrameRendered() {
    }

    @Override
    public void q() {
    }

    private final void A2(q1 q1Var) {
    }

    private final void B2(q1 q1Var) {
    }

    private final void C2(q1 q1Var) {
    }

    private final void D4(String str) {
    }

    private final void G1(q1 q1Var) {
    }

    private final void I0(q1 q1Var) {
    }

    private final void I3(String str) {
    }

    private final void J3(String str) {
    }

    private final void K3(String str) {
    }

    private final void K4(int i7) {
    }

    private final void L1(q1 q1Var) {
    }

    private final void L4(int i7) {
    }

    private final void M0(q1 q1Var) {
    }

    private final void M1(q1 q1Var) {
    }

    private final void M4(int i7) {
    }

    private final void Q4(ij ijVar) {
    }

    private final void R0(q1 q1Var) {
    }

    private final void R3(q1 q1Var) {
    }

    private final void R4(ij ijVar) {
    }

    private final void S3(q1 q1Var) {
    }

    private final void S4(ij ijVar) {
    }

    private final void T3(q1 q1Var) {
    }

    private final void V0(q1 q1Var) {
    }

    private final void X0(q1 q1Var) {
    }

    private final void X1(q1 q1Var) {
    }

    private final void X3(q1 q1Var) {
    }

    private final void Y0(q1 q1Var) {
    }

    private final void Y1(q1 q1Var) {
    }

    private final void Y2(q1 q1Var) {
    }

    private final void Y3(q1 q1Var) {
    }

    private final void Z1(q1 q1Var) {
    }

    private final void Z2(q1 q1Var) {
    }

    private final void Z3(q1 q1Var) {
    }

    private final void a3(q1 q1Var) {
    }

    private final void a4(ij ijVar) {
    }

    private final void b4(ij ijVar) {
    }

    private final void c4(ij ijVar) {
    }

    private final void d4(q1 q1Var) {
    }

    private final void e4(q1 q1Var) {
    }

    private final void f4(q1 q1Var) {
    }

    private final void h3(q1 q1Var) {
    }

    private final void i1(q1 q1Var) {
    }

    private final void i3(q1 q1Var) {
    }

    private final void j0(q1 q1Var) {
    }

    private final void j3(q1 q1Var) {
    }

    private final void j4(q1 q1Var) {
    }

    private final void k1(q1 q1Var) {
    }

    private final void k3(q1 q1Var) {
    }

    private final void k4(q1 q1Var) {
    }

    private final void l0(q1 q1Var) {
    }

    private final void l1(q1 q1Var) {
    }

    private final void l2(q1 q1Var) {
    }

    private final void l3(q1 q1Var) {
    }

    private final void l4(q1 q1Var) {
    }

    private final void m1(fj fjVar) {
    }

    private final void m2(q1 q1Var) {
    }

    private final void m3(q1 q1Var) {
    }

    private final void n2(q1 q1Var) {
    }

    private final void n3(q1 q1Var) {
    }

    private final void o0(q1 q1Var) {
    }

    private final void o1(fj fjVar) {
    }

    private final void o3(q1 q1Var) {
    }

    private final void p3(q1 q1Var) {
    }

    private final void r0(q1 q1Var) {
    }

    private final void t0(q1 q1Var) {
    }

    private final void t1(fj fjVar) {
    }

    private final void t3(q1 q1Var) {
    }

    private final void t4(q1 q1Var) {
    }

    private final void u3(q1 q1Var) {
    }

    private final void v0(q1 q1Var) {
    }

    private final void v3(q1 q1Var) {
    }

    private final void v4(q1 q1Var) {
    }

    private final void x2(q1 q1Var) {
    }

    private final void x4(q1 q1Var) {
    }

    private final void y2(q1 q1Var) {
    }

    private final void z2(q1 q1Var) {
    }

    @Override
    public void a(x1 x1Var) {
    }

    private final void G2(q1 q1Var, int i7) {
    }

    private final void H2(q1 q1Var, int i7) {
    }

    private final void I2(q1 q1Var, int i7) {
    }

    private final void L(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void L3(q1 q1Var, long j3) {
    }

    private final void M(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void M3(q1 q1Var, long j3) {
    }

    private final void N3(q1 q1Var, long j3) {
    }

    private final void O(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void O1(q1 q1Var, o2 o2Var) {
    }

    private final void S0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void T0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void T1(q1 q1Var, o2 o2Var) {
    }

    private final void U0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void V1(q1 q1Var, o2 o2Var) {
    }

    private final void a2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void b3(String str, String str2) {
    }

    private final void c3(String str, String str2) {
    }

    private final void d2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void d3(String str, String str2) {
    }

    private final void g4(q1 q1Var, o10 o10Var) {
    }

    private final void h2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void h4(q1 q1Var, o10 o10Var) {
    }

    private final void i4(q1 q1Var, o10 o10Var) {
    }

    private final void m4(String str, Throwable th2) {
    }

    private final void n4(q1 q1Var, boolean z9) {
    }

    private final void p4(q1 q1Var, boolean z9) {
    }

    private final void r2(q1 q1Var, int i7) {
    }

    private final void r4(q1 q1Var, boolean z9) {
    }

    private final void s2(q1 q1Var, int i7) {
    }

    private final void t2(q1 q1Var, int i7) {
    }

    private final void u2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void v2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void w2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void c(l.k kVar, boolean z9) {
    }

    private final void A3(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    private final void B3(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    private final void E(q1 q1Var, float f10, float f11) {
    }

    private final void F(q1 q1Var, float f10, float f11) {
    }

    private final void I(q1 q1Var, float f10, float f11) {
    }

    private final void M2(q1 q1Var, float f10, float f11) {
    }

    private final void N2(q1 q1Var, float f10, float f11) {
    }

    private final void O2(q1 q1Var, float f10, float f11) {
    }

    private final void U3(q1 q1Var, float f10, float f11) {
    }

    private final void V3(q1 q1Var, float f10, float f11) {
    }

    private final void W3(q1 q1Var, float f10, float f11) {
    }

    private final void e1(q1 q1Var, TLObject tLObject, boolean z9) {
    }

    private final void e3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void f1(q1 q1Var, TLObject tLObject, boolean z9) {
    }

    private final void f3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void g3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void h1(q1 q1Var, TLObject tLObject, boolean z9) {
    }

    private final void o2(q1 q1Var, int i7, int i10) {
    }

    private final void o4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final void p2(q1 q1Var, int i7, int i10) {
    }

    private final void q2(q1 q1Var, int i7, int i10) {
    }

    private final void q3(q1 q1Var, float f10, float f11) {
    }

    private final void q4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final void r3(q1 q1Var, float f10, float f11) {
    }

    private final void s3(q1 q1Var, float f10, float f11) {
    }

    private final void s4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final void u4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final void w4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final void y4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final void z3(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    private final void C3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void D2(q1 q1Var, float f10, float f11, boolean z9) {
    }

    private final void D3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void E2(q1 q1Var, float f10, float f11, boolean z9) {
    }

    private final void E3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void F2(q1 q1Var, float f10, float f11, boolean z9) {
    }

    private final void F3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void G3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void H3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void P2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final void Q2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final void R2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final void O3(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final void P3(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final void Q3(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final void S2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    private final void T2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    private final void U2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    private final void V2(q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    private final void W2(q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    private final void X2(q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    private final void a1(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    private final void c1(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    private final void d1(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    private final void E4(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    private final void F4(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    private final void G4(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
