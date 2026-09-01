package sf;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import c9.t;
import dg.t0;
import h5.d0;
import j7.j0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import m.s;
import o4.h0;
import oh.p5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.z4;
import org.telegram.ui.jy;
import org.telegram.ui.mf1;
import org.telegram.ui.py;
import org.telegram.ui.web.v1;
import qh.p0;
import qh.v9;
import r3.o;
import s5.m;
import sh.x3;
import vf.m1;
import vf.o1;
import vf.p1;
import vf.r1;
import vf.w0;
import vf.x0;
import vf.z0;
import wh.a5;
import wh.c4;
import wh.e1;
import wh.i5;
import wh.j5;
import wh.m0;
import wh.r0;
import wh.r3;
import wh.v5;
import wh.x5;
import wh.y2;
import wh.z;
import wh.z1;
import wh.z2;
import z3.p;
public final class g implements c2, Utilities.Callback5, t0.e, r3.c, vt, m0, jy, j5, xd.b, r8.e, c9.e {
    public final int f47320a;
    public final Object f47321b;

    public g(Object obj, int i10) {
        this.f47320a = i10;
        this.f47321b = obj;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(py pyVar) {
        return false;
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        ((Switch) this.f47321b).invalidate();
    }

    @Override
    public q70 a(e1 e1Var) {
        return q70.H((z1) ((f1) this.f47321b).f22788b, e1Var);
    }

    @Override
    public Object apply(Object obj) {
        p pVar = (p) obj;
        ((z3.i) this.f47321b).getClass();
        return pVar;
    }

    public h0 b(m mVar) {
        InputStream inputStream;
        w2.b bVar = (w2.b) this.f47321b;
        URL url = (URL) mVar.f47062b;
        String c3 = j0.c("CctTransportBackend");
        if (Log.isLoggable(c3, 4)) {
            Log.i(c3, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f49334g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) mVar.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                ai aiVar = bVar.f49329a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                w9.d dVar = (w9.d) aiVar.f25265b;
                w9.e eVar = new w9.e(bufferedWriter, dVar.f49476a, dVar.f49477b, dVar.f49478c, dVar.d);
                eVar.h((x2.i) mVar.f47063c);
                eVar.j();
                eVar.f49480b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c10 = j0.c("CctTransportBackend");
                if (Log.isLoggable(c10, 4)) {
                    Log.i(c10, String.format("Status Code: %d", valueOf));
                }
                j0.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                j0.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new h0(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        h0 h0Var = new h0(responseCode, null, x2.m.a(new BufferedReader(new InputStreamReader(inputStream))).f50290a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return h0Var;
                    } catch (Throwable th2) {
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                return new h0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (ConnectException e6) {
            e = e6;
            j0.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new h0(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            j0.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new h0(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            j0.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new h0(400, null, 0L);
        } catch (u9.b e12) {
            e = e12;
            j0.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new h0(400, null, 0L);
        }
    }

    @Override
    public void b0() {
        switch (this.f47320a) {
            case 13:
                r0 r0Var = (r0) this.f47321b;
                e1 e1Var = r0Var.d;
                wh.a aVar = r0Var.f49965f;
                if (aVar != null) {
                    aVar.f49632s = true;
                    aVar.f49631r = e1Var.B;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f49617b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = x5.f(e1Var.getText());
                    }
                }
                z2 z2Var = r0Var.h;
                if (z2Var != null && r0Var.f49965f != null) {
                    r3.O1(z2Var.f50218a);
                    return;
                }
                return;
            case 18:
                ((a5) this.f47321b).h();
                return;
            default:
                i5 i5Var = (i5) this.f47321b;
                wh.a aVar2 = i5Var.f50175a;
                if (aVar2 != null) {
                    aVar2.f49632s = true;
                    aVar2.f49631r = i5Var.f49798r.B;
                }
                i5Var.u();
                y2 y2Var = i5Var.B;
                if (y2Var != null && i5Var.f50175a != null) {
                    r3.O1(y2Var.f50171a);
                    return;
                }
                return;
        }
    }

    public void c(int i10) {
        z zVar = (z) this.f47321b;
        zVar.f50177c = i10;
        zVar.f(i10);
    }

    @Override
    public boolean d(t0.i iVar, int i10, Bundle bundle) {
        r0.e eVar;
        s sVar = (s) this.f47321b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f47829a.b();
                Parcelable parcelable = (Parcelable) iVar.f47829a.d();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e6) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e6);
                return false;
            }
        }
        t0.h hVar = iVar.f47829a;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.a()));
        if (i11 >= 31) {
            eVar = new r0.d(clipData, 2);
        } else {
            r0.f fVar = new r0.f();
            fVar.f46418b = clipData;
            fVar.f46419c = 2;
            eVar = fVar;
        }
        eVar.b(hVar.c());
        eVar.setExtras(bundle);
        if (r0.j0.i(sVar, eVar.build()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public Object e0(c5.j jVar) {
        return new z9.c((Context) jVar.a(Context.class), ((w8.g) jVar.a(w8.g.class)).d(), jVar.w(z9.d.class), jVar.c(ja.b.class), (Executor) jVar.f((t) this.f47321b));
    }

    @Override
    public long f(long j10) {
        o oVar = (o) this.f47321b;
        return d0.i((j10 * oVar.f46569e) / 1000000, 0L, oVar.f46573j - 1);
    }

    @Override
    public void j(d2 d2Var, int i10) {
        switch (this.f47320a) {
            case 1:
                ((sh.d) this.f47321b).run();
                return;
            case 2:
                sh.j jVar = (sh.j) this.f47321b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = jVar.getMessagesController().getInputUser(jVar.M);
                updatestarrefprogram.commission_permille = 0;
                d2 d2Var2 = new d2(jVar.getParentActivity(), 3, null);
                d2Var2.q(150L);
                jVar.getConnectionsManager().sendRequest(updatestarrefprogram, new sh.b(jVar, d2Var2, 0));
                return;
            case 8:
                m1 m1Var = ((vf.f1) this.f47321b).f49049a;
                p1 f10 = p1.f(m1.b0(m1Var));
                ArrayList arrayList = m1Var.f49133b;
                int i11 = f10.f49171a;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (f10.c(((Integer) arrayList.get(i12)).intValue()) == null) {
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        o1 c3 = f10.c(((Integer) arrayList.get(i13)).intValue());
                        f10.f49172b.remove(c3);
                        f10.a(c3.f49161b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c3.f49160a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new p5(20));
                        if ("hello".equals(c3.f49161b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(c3.f49161b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull userFull2 = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull2 != null) {
                                userFull2.flags2 &= -9;
                                userFull2.business_away_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull2, true);
                            }
                        }
                    }
                    f10.l();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
                    messagesStorage.getStorageQueue().postRunnable(new p0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                m1.X(m1Var);
                return;
            default:
                ((t0) this.f47321b).run();
                return;
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        w0 w0Var;
        w0 w0Var2;
        int i11;
        switch (this.f47320a) {
            case 3:
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((x3) this.f47321b).V((j51) obj);
                return;
            case 4:
            case 5:
            case 8:
            default:
                j51 j51Var = (j51) obj;
                View view2 = (View) obj2;
                Integer num = (Integer) obj3;
                Float f10 = (Float) obj4;
                Float f11 = (Float) obj5;
                if (((r3[]) this.f47321b)[0] != null) {
                    num.intValue();
                    f10.floatValue();
                    f11.floatValue();
                    if (view2 instanceof v5) {
                        ((v5) view2).B();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                x0 x0Var = (x0) this.f47321b;
                j51 j51Var2 = (j51) obj;
                View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i12 = j51Var2.d;
                if (i12 == -1) {
                    boolean z4 = !x0Var.f49237e;
                    x0Var.f49237e = z4;
                    ((s8) view3).setChecked(z4);
                    x0Var.f49234a.V2.N(true);
                    x0Var.Y(true);
                    return;
                } else if (i12 == -2) {
                    ?? p2Var = new p2(null);
                    p2Var.f49189n = x0Var.f49240r;
                    p2Var.f49186c = new v1(19, x0Var, view3);
                    x0Var.presentFragment((p2) p2Var);
                    return;
                } else if (j51Var2.f2505a == 5 && i12 >= 0 && i12 < x0Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue >= view3.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue <= AndroidUtilities.dp(76.0f)) {
                        if (x0Var.h[j51Var2.d].isEmpty()) {
                            ((org.telegram.ui.Cells.j5) view3).setChecked(true);
                            x0Var.h[j51Var2.d].add(new w0(0, 1439));
                            x0Var.X(j51Var2.d);
                        } else {
                            x0Var.h[j51Var2.d].clear();
                            ((org.telegram.ui.Cells.j5) view3).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.j5) view3).setValue(x0.a0(x0Var.h[j51Var2.d]));
                        x0Var.Y(true);
                        return;
                    }
                    int i13 = (j51Var2.d + 6) % 7;
                    int i14 = 0;
                    for (int i15 = 0; i15 < x0Var.h[i13].size(); i15++) {
                        if (((w0) x0Var.h[i13].get(i15)).f49232b > i14) {
                            i14 = ((w0) x0Var.h[i13].get(i15)).f49232b;
                        }
                    }
                    int max = Math.max(0, i14 - 1439);
                    int i16 = (j51Var2.d + 1) % 7;
                    int i17 = 1440;
                    for (int i18 = 0; i18 < x0Var.h[i16].size(); i18++) {
                        if (((w0) x0Var.h[i16].get(i18)).f49231a < i17) {
                            i17 = ((w0) x0Var.h[i16].get(i18)).f49231a;
                        }
                    }
                    int i19 = i17 + 1439;
                    CharSequence charSequence = j51Var2.f28014l;
                    ArrayList arrayList = x0Var.h[j51Var2.d];
                    int i20 = 0;
                    for (int i21 = 0; i21 < 7; i21++) {
                        ArrayList arrayList2 = x0Var.h[i21];
                        if (arrayList2 != null) {
                            i20 = Math.max(1, arrayList2.size()) + i20;
                        }
                    }
                    z0 z0Var = new z0(charSequence, arrayList, max, i19, 28 - i20);
                    z0Var.f49252f = new v9(x0Var, 23);
                    z0Var.h = new vf.d0(2, x0Var, j51Var2);
                    x0Var.presentFragment(z0Var);
                    return;
                } else {
                    return;
                }
            case 7:
                final z0 z0Var2 = (z0) this.f47321b;
                j51 j51Var3 = (j51) obj;
                final View view4 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i22 = z0Var2.f49250c;
                int i23 = z0Var2.d;
                ArrayList arrayList3 = z0Var2.f49249b;
                int i24 = j51Var3.d;
                if (i24 == -1) {
                    z0Var2.f49254r = !z0Var2.f49254r;
                    arrayList3.clear();
                    if (z0Var2.f49254r) {
                        arrayList3.add(new w0(0, 1439));
                    }
                    s8 s8Var = (s8) view4;
                    boolean z10 = z0Var2.f49254r;
                    j51Var3.f28008e = z10;
                    s8Var.setChecked(z10);
                    boolean z11 = z0Var2.f49254r;
                    if (z11) {
                        i11 = k6.f21696f6;
                    } else {
                        i11 = k6.e6;
                    }
                    s8Var.b(k6.w0(null, i11, false), z11);
                    z0Var2.f49253n.V2.N(true);
                    v9 v9Var = z0Var2.f49252f;
                    if (v9Var != null) {
                        v9Var.run();
                        return;
                    }
                    return;
                } else if (i24 == -2) {
                    if (!arrayList3.isEmpty() && !z0Var2.U()) {
                        int i25 = ((w0) l.d.i(1, arrayList3)).f49232b;
                        int clamp = Utilities.clamp(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new w0(clamp, Utilities.clamp((i25 + 1560) / 2, i23, clamp + 1)));
                    } else {
                        if (z0Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp2 = Utilities.clamp(480, i23 - 1, i22);
                        arrayList3.add(new w0(clamp2, Utilities.clamp(1200, i23, clamp2 + 1)));
                    }
                    v9 v9Var2 = z0Var2.f49252f;
                    if (v9Var2 != null) {
                        v9Var2.run();
                    }
                    z0Var2.f49253n.V2.N(true);
                    return;
                } else if (j51Var3.f2505a == 3 && (i10 = i24 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i26 = i10 - 1;
                    if (i26 >= 0) {
                        w0Var = (w0) arrayList3.get(i26);
                    } else {
                        w0Var = null;
                    }
                    final w0 w0Var3 = (w0) arrayList3.get(i10);
                    int i27 = i10 + 1;
                    if (i27 < arrayList3.size()) {
                        w0Var2 = (w0) arrayList3.get(i27);
                    } else {
                        w0Var2 = null;
                    }
                    int i28 = j51Var3.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = z0Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i29 = w0Var3.f49231a;
                        if (w0Var != null) {
                            i22 = w0Var.f49232b + 1;
                        }
                        z4.X(parentActivity, string, i29, i22, w0Var3.f49232b - 1, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        z0 z0Var3 = z0Var2;
                                        boolean V = z0Var3.V();
                                        int intValue = num2.intValue();
                                        w0Var3.f49231a = intValue;
                                        ((o8) view4).u(w0.a(intValue), true);
                                        if (V != z0Var3.V()) {
                                            z0Var3.f49253n.V2.N(true);
                                        }
                                        v9 v9Var3 = z0Var3.f49252f;
                                        if (v9Var3 != null) {
                                            v9Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        z0 z0Var4 = z0Var2;
                                        boolean V2 = z0Var4.V();
                                        int intValue2 = num2.intValue();
                                        w0Var3.f49232b = intValue2;
                                        ((o8) view4).u(w0.a(intValue2), true);
                                        if (V2 != z0Var4.V()) {
                                            z0Var4.f49253n.V2.N(true);
                                        }
                                        v9 v9Var4 = z0Var4.f49252f;
                                        if (v9Var4 != null) {
                                            v9Var4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 1) {
                        Activity parentActivity2 = z0Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i30 = w0Var3.f49232b;
                        int i31 = w0Var3.f49231a + 1;
                        if (w0Var2 != null) {
                            i23 = w0Var2.f49231a - 1;
                        }
                        z4.X(parentActivity2, string2, i30, i31, i23, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        z0 z0Var3 = z0Var2;
                                        boolean V = z0Var3.V();
                                        int intValue = num2.intValue();
                                        w0Var3.f49231a = intValue;
                                        ((o8) view4).u(w0.a(intValue), true);
                                        if (V != z0Var3.V()) {
                                            z0Var3.f49253n.V2.N(true);
                                        }
                                        v9 v9Var3 = z0Var3.f49252f;
                                        if (v9Var3 != null) {
                                            v9Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        z0 z0Var4 = z0Var2;
                                        boolean V2 = z0Var4.V();
                                        int intValue2 = num2.intValue();
                                        w0Var3.f49232b = intValue2;
                                        ((o8) view4).u(w0.a(intValue2), true);
                                        if (V2 != z0Var4.V()) {
                                            z0Var4.f49253n.V2.N(true);
                                        }
                                        v9 v9Var4 = z0Var4.f49252f;
                                        if (v9Var4 != null) {
                                            v9Var4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 2) {
                        arrayList3.remove(i10);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new w0(0, 1439));
                        }
                        z0Var2.f49253n.V2.N(true);
                        v9 v9Var3 = z0Var2.f49252f;
                        if (v9Var3 != null) {
                            v9Var3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 9:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                r1.U((r1) this.f47321b, (j51) obj, (View) obj2);
                return;
        }
    }

    @Override
    public boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, mf1 mf1Var) {
        c4 c4Var = (c4) this.f47321b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        c4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        pyVar.finishFragment();
        return true;
    }

    @Override
    public void z(float f10, int i10) {
    }
}
