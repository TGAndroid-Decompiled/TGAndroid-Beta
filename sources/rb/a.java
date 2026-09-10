package rb;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Trace;
import android.text.style.CharacterStyle;
import android.util.Log;
import b2.s;
import b2.s0;
import b4.i;
import bi.u6;
import c3.g;
import c5.b0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import f4.e;
import fb.n;
import g2.j;
import g2.u;
import g2.x;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.List;
import n4.y;
import nf.f;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.y5;
import org.telegram.ui.rv0;
import pb.b;
import pb.c;
import q9.d;
import r2.k;
import r2.o;
import y2.m;
public final class a implements ag.a, g, ea.a, n, ch.a, d, k1, OnFailureListener, k, u5.a, Continuation, wf.a, z3.k {
    public static volatile a f41400b;
    public static a f41401c;
    public final int f41402a;

    public a(int i10) {
        this.f41402a = i10;
    }

    public static MediaCodec B(com.google.firebase.messaging.n nVar) {
        String str = ((o) nVar.f6103a).f41182a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static k4.d n3(y2.g gVar, b0 b0Var) {
        IOException iOException = (IOException) b0Var.f4261c;
        if (iOException instanceof x) {
            int i10 = ((x) iOException).d;
            if (i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503) {
                if (gVar.a(1)) {
                    return new k4.d(1, 300000L);
                }
                if (gVar.a(2)) {
                    return new k4.d(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static long p3(b0 b0Var) {
        Throwable th2 = (IOException) b0Var.f4261c;
        if (!(th2 instanceof s0) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof u) && !(th2 instanceof m)) {
            int i10 = j.f8497b;
            while (th2 != null) {
                if (!(th2 instanceof j) || ((j) th2).f8498a != 2008) {
                    th2 = th2.getCause();
                } else {
                    return -9223372036854775807L;
                }
            }
            return Math.min((b0Var.f4260b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    @Override
    public void A(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public void A0() {
        int i10 = this.f41402a;
    }

    @Override
    public void B0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f41402a;
    }

    @Override
    public void B1(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public boolean C(s sVar) {
        String str = sVar.f2002r;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override
    public void C0(t1 t1Var, float f7, float f10) {
        int i10 = this.f41402a;
    }

    @Override
    public void C1(t1 t1Var, boolean z10) {
        int i10 = this.f41402a;
    }

    @Override
    public void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f41402a;
    }

    @Override
    public void E(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public void E0(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public boolean E1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void F1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f41402a;
    }

    @Override
    public void G0(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public boolean G1() {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f41402a;
    }

    @Override
    public void I0(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public void I1(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public int J1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override
    public void K(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public void K1(MessageObject messageObject) {
        int i10 = this.f41402a;
    }

    @Override
    public void L(int i10, t1 t1Var) {
        int i11 = this.f41402a;
    }

    @Override
    public void L1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f41402a) {
            case 16:
            default:
                f.s(t1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void M(MessageObject messageObject) {
        int i10 = this.f41402a;
    }

    @Override
    public boolean M0(long j3) {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public CharacterStyle M1(t1 t1Var) {
        switch (this.f41402a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N0(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f41402a;
    }

    @Override
    public boolean O() {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean O1(t1 t1Var, MessageObject messageObject) {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P(t1 t1Var) {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(int i10, t1 t1Var) {
        int i11 = this.f41402a;
    }

    @Override
    public Object P1(u6 u6Var) {
        switch (this.f41402a) {
            case 14:
                return new c(u6Var.x(b.class));
            default:
                return new b(u6Var.c(ob.a.class));
        }
    }

    @Override
    public boolean Q() {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q1() {
        int i10 = this.f41402a;
    }

    @Override
    public void R(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f41402a;
    }

    @Override
    public void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f41402a;
    }

    @Override
    public void S(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i10, shortBuffer2.remaining() / i11);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            short s11 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i11 == 2) {
                shortBuffer2.put(s10);
                shortBuffer2.put(s11);
            } else if (i11 == 1) {
                shortBuffer2.put(ob.a.B2(s10, s11));
            }
        }
    }

    @Override
    public void S1(t1 t1Var, ai.j jVar) {
        int i10 = this.f41402a;
    }

    @Override
    public void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f41402a;
    }

    @Override
    public int U() {
        switch (this.f41402a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f41402a;
    }

    @Override
    public void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f41402a;
    }

    @Override
    public boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean W0(t1 t1Var, boolean z10) {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public gh.a X() {
        switch (this.f41402a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void X0(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public rv0 X1() {
        switch (this.f41402a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Y(t1 t1Var) {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Y1(long j3) {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Z0(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public void Z1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f41402a;
    }

    @Override
    public boolean a(Context context) {
        return false;
    }

    @Override
    public boolean a2(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean b0(t1 t1Var, TLRPC.User user) {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public r2.l c(com.google.firebase.messaging.n r6) {
        throw new UnsupportedOperationException("Method not decompiled: rb.a.c(com.google.firebase.messaging.n):r2.l");
    }

    @Override
    public void c0(int i10) {
        int i11 = this.f41402a;
    }

    @Override
    public boolean c1(int i10, t1 t1Var) {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c2(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public z3.m d(s sVar) {
        String str = sVar.f2002r;
        List list = sVar.f2005u;
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
                    return new i(list);
                case 1:
                    return new com.google.firebase.messaging.s(2);
                case 2:
                    return new a6.i(25);
                case 3:
                    return new y(22);
                case 4:
                    return new g4.a(list);
                case 5:
                    return new d4.a(list);
                case 6:
                    return new com.google.firebase.messaging.s(list);
                case 7:
                    return new e4.a();
                case '\b':
                    return new e();
            }
        }
        throw new IllegalArgumentException(r6.i("Unsupported MIME type: ", str));
    }

    @Override
    public boolean d0() {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e() {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e2(t1 t1Var, long j3) {
        int i10 = this.f41402a;
    }

    @Override
    public boolean f() {
        switch (this.f41402a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void f0(t1 t1Var, float f7, float f10) {
        int i10 = this.f41402a;
    }

    @Override
    public String g(t1 t1Var) {
        switch (this.f41402a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean g1(MessageObject messageObject) {
        int i10 = this.f41402a;
        return em.a(messageObject);
    }

    @Override
    public int h() {
        return 872415231;
    }

    @Override
    public int h0(t1 t1Var) {
        switch (this.f41402a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f41402a;
    }

    @Override
    public void i0(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public void j() {
        int i10 = this.f41402a;
    }

    @Override
    public void j1() {
        int i10 = this.f41402a;
    }

    @Override
    public boolean j2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int k(s sVar) {
        String str = sVar.f2002r;
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
        throw new IllegalArgumentException(r6.i("Unsupported MIME type: ", str));
    }

    @Override
    public void k2(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public StackTraceElement[] l(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public boolean l0() {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void l1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f41402a;
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f41402a;
    }

    @Override
    public void n(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public void n0(String str) {
        int i10 = this.f41402a;
    }

    @Override
    public Object n2() {
        switch (this.f41402a) {
            case 8:
                return new ArrayList();
            default:
                return new fb.m(true);
        }
    }

    @Override
    public void o() {
        int i10 = this.f41402a;
    }

    @Override
    public boolean o0(y5 y5Var) {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void o1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.f41402a;
    }

    @Override
    public void o2() {
        int i10 = this.f41402a;
    }

    public int o3(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return 3;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public int p() {
        return 352321535;
    }

    @Override
    public void q(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public void q0(t1 t1Var, float f7, float f10) {
        int i10 = this.f41402a;
    }

    @Override
    public void r() {
        int i10 = this.f41402a;
    }

    @Override
    public void r2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f41402a;
    }

    @Override
    public void s(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public void t(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public void t1(t1 t1Var, float f7, float f10) {
        int i10 = this.f41402a;
    }

    @Override
    public boolean t2(int i10) {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object then(Task task) {
        return null;
    }

    @Override
    public long u() {
        return System.currentTimeMillis();
    }

    @Override
    public void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f41402a;
    }

    @Override
    public String v(long j3) {
        switch (this.f41402a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void v2() {
        int i10 = this.f41402a;
    }

    @Override
    public int w() {
        return 0;
    }

    @Override
    public void w0(t1 t1Var, float f7, float f10, boolean z10) {
        int i10 = this.f41402a;
    }

    @Override
    public void w2(t1 t1Var, int i10, int i11) {
        int i12 = this.f41402a;
    }

    @Override
    public int x() {
        return 1711276032;
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        switch (this.f41402a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public t9 x2() {
        switch (this.f41402a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean y(Context context) {
        return false;
    }

    @Override
    public void z(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public void z0(t1 t1Var) {
        int i10 = this.f41402a;
    }

    @Override
    public boolean z1() {
        switch (this.f41402a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    public a(Context context) {
        this.f41402a = 11;
    }

    private final void A1() {
    }

    private final void C3() {
    }

    private final void D1() {
    }

    private final void D3() {
    }

    private final void F2() {
    }

    private final void G2() {
    }

    private final void T() {
    }

    private final void V() {
    }

    private final void g0() {
    }

    private final void j0() {
    }

    private final void q3() {
    }

    private final void r3() {
    }

    private final void u3() {
    }

    private final void v3() {
    }

    private final void y3() {
    }

    private final void z3() {
    }

    private final void A2(t1 t1Var) {
    }

    private final void A3(MessageObject messageObject) {
    }

    private final void B3(MessageObject messageObject) {
    }

    private final void D2(t1 t1Var) {
    }

    private final void E2(t1 t1Var) {
    }

    private final void H0(t1 t1Var) {
    }

    private final void J0(t1 t1Var) {
    }

    private final void K0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void L0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void N2(String str) {
    }

    private final void O0(t1 t1Var) {
    }

    private final void O2(String str) {
    }

    private final void Q0(t1 t1Var) {
    }

    private final void T2(t1 t1Var) {
    }

    private final void U2(t1 t1Var) {
    }

    private final void W(t1 t1Var) {
    }

    private final void X2(t1 t1Var) {
    }

    private final void Y0(t1 t1Var) {
    }

    private final void Y2(t1 t1Var) {
    }

    private final void Z(t1 t1Var) {
    }

    private final void Z2(MessageObject messageObject) {
    }

    private final void a0(t1 t1Var) {
    }

    private final void a1(t1 t1Var) {
    }

    private final void a3(MessageObject messageObject) {
    }

    private final void b3(t1 t1Var) {
    }

    private final void c3(t1 t1Var) {
    }

    private final void e0(t1 t1Var) {
    }

    private final void e1(t1 t1Var) {
    }

    private final void f1(t1 t1Var) {
    }

    private final void f3(t1 t1Var) {
    }

    private final void g3(t1 t1Var) {
    }

    private final void h3(t1 t1Var) {
    }

    private final void i2(t1 t1Var) {
    }

    private final void j3(t1 t1Var) {
    }

    private final void k0(t1 t1Var) {
    }

    private final void l2(t1 t1Var) {
    }

    private final void l3(t1 t1Var) {
    }

    private final void m0(t1 t1Var) {
    }

    private final void m3(t1 t1Var) {
    }

    private final void q1(t1 t1Var) {
    }

    private final void q2(t1 t1Var) {
    }

    private final void r1(t1 t1Var) {
    }

    private final void s0(t1 t1Var) {
    }

    private final void s1(t1 t1Var) {
    }

    private final void s2(t1 t1Var) {
    }

    private final void t0(t1 t1Var) {
    }

    private final void u1(t1 t1Var) {
    }

    private final void u2(t1 t1Var) {
    }

    private final void w3(int i10) {
    }

    private final void x3(int i10) {
    }

    private final void y2(t1 t1Var) {
    }

    private final void z2(t1 t1Var) {
    }

    @Override
    public long b(long j3) {
        return j3;
    }

    private final void I(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void J(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void P2(t1 t1Var, long j3) {
    }

    private final void Q2(t1 t1Var, long j3) {
    }

    private final void T0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void U0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void b1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void d1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void d3(t1 t1Var, ai.j jVar) {
    }

    private final void e3(t1 t1Var, ai.j jVar) {
    }

    private final void i3(t1 t1Var, boolean z10) {
    }

    private final void k1(int i10, t1 t1Var) {
    }

    private final void k3(t1 t1Var, boolean z10) {
    }

    private final void m1(int i10, t1 t1Var) {
    }

    private final void m2(t1 t1Var, TLRPC.Document document) {
    }

    private final void n1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void p0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void p1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void p2(t1 t1Var, TLRPC.Document document) {
    }

    private final void r0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void x1(int i10, t1 t1Var) {
    }

    private final void y1(int i10, t1 t1Var) {
    }

    private final void B2(t1 t1Var, float f7, float f10) {
    }

    private final void C2(t1 t1Var, float f7, float f10) {
    }

    private final void D0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void F(t1 t1Var, float f7, float f10) {
    }

    private final void F0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void G(t1 t1Var, float f7, float f10) {
    }

    private final void H1(t1 t1Var, float f7, float f10) {
    }

    private final void H2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void I2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void R1(t1 t1Var, float f7, float f10) {
    }

    private final void V2(t1 t1Var, float f7, float f10) {
    }

    private final void W2(t1 t1Var, float f7, float f10) {
    }

    private final void h1(t1 t1Var, int i10, int i11) {
    }

    private final void i1(t1 t1Var, int i10, int i11) {
    }

    private final void J2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void K2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void L2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void M2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void W1(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void b2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void v1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void w1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void R2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void S2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void d2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void f2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void g2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void h2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void v0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void y0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void s3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void t3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
