package ph;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ky;
import org.telegram.ui.qy;
import org.telegram.ui.sf1;
import ph.ga;
public final class z8 implements CameraController.VideoTakeCallback, n2.a, org.telegram.ui.ActionBar.c2, Utilities.Callback5, t0.e, r3.c, st, vh.m0, ky, vh.k5, xd.b, r8.e, c9.f {
    public final int f42701a;
    public final Object f42702b;

    public z8(Object obj, int i10) {
        this.f42701a = i10;
        this.f42702b = obj;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean I(qy qyVar) {
        return false;
    }

    @Override
    public void J() {
        switch (this.f42701a) {
            case 12:
                vh.r0 r0Var = (vh.r0) this.f42702b;
                vh.e1 e1Var = r0Var.d;
                vh.a aVar = r0Var.f46178f;
                if (aVar != null) {
                    aVar.f45867s = true;
                    aVar.f45866r = e1Var.B;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f45853b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = vh.y5.f(e1Var.getText());
                    }
                }
                vh.a3 a3Var = r0Var.h;
                if (a3Var != null && r0Var.f46178f != null) {
                    vh.s3.N1(a3Var.f45875a);
                    return;
                }
                return;
            case 17:
                ((vh.b5) this.f42702b).h();
                return;
            default:
                vh.j5 j5Var = (vh.j5) this.f42702b;
                vh.a aVar2 = j5Var.f46414a;
                if (aVar2 != null) {
                    aVar2.f45867s = true;
                    aVar2.f45866r = j5Var.f46038r.B;
                }
                j5Var.u();
                vh.z2 z2Var = j5Var.B;
                if (z2Var != null && j5Var.f46414a != null) {
                    vh.s3.N1(z2Var.f46422a);
                    return;
                }
                return;
        }
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        ((Switch) this.f42702b).invalidate();
    }

    @Override
    public p70 a(vh.e1 e1Var) {
        return p70.H((vh.y1) ((zz) this.f42702b).f31508b, e1Var);
    }

    @Override
    public Object apply(Object obj) {
        z3.o oVar = (z3.o) obj;
        ((z3.i) this.f42702b).getClass();
        return oVar;
    }

    public o4.h0 b(s5.m mVar) {
        InputStream inputStream;
        w2.b bVar = (w2.b) this.f42702b;
        URL url = (URL) mVar.f44153b;
        String c3 = j7.i0.c("CctTransportBackend");
        if (Log.isLoggable(c3, 4)) {
            Log.i(c3, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f46448g);
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
                tp0 tp0Var = bVar.f46444a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                w9.d dVar = (w9.d) tp0Var.f29015b;
                w9.e eVar = new w9.e(bufferedWriter, dVar.f46580a, dVar.f46581b, dVar.f46582c, dVar.d);
                eVar.h((x2.i) mVar.f44154c);
                eVar.j();
                eVar.f46584b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c10 = j7.i0.c("CctTransportBackend");
                if (Log.isLoggable(c10, 4)) {
                    Log.i(c10, String.format("Status Code: %d", valueOf));
                }
                j7.i0.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                j7.i0.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new o4.h0(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        o4.h0 h0Var = new o4.h0(responseCode, null, x2.m.a(new BufferedReader(new InputStreamReader(inputStream))).f46762a);
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
                return new o4.h0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
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
        } catch (ConnectException e) {
            e = e;
            j7.i0.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new o4.h0(500, null, 0L);
        } catch (UnknownHostException e6) {
            e = e6;
            j7.i0.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new o4.h0(500, null, 0L);
        } catch (IOException e10) {
            e = e10;
            j7.i0.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new o4.h0(400, null, 0L);
        } catch (u9.b e11) {
            e = e11;
            j7.i0.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new o4.h0(400, null, 0L);
        }
    }

    public void c(int i10) {
        vh.z zVar = (vh.z) this.f42702b;
        zVar.f46416c = i10;
        zVar.f(i10);
    }

    @Override
    public Object d0(c5.j jVar) {
        return new z9.c((Context) jVar.a(Context.class), ((w8.g) jVar.a(w8.g.class)).d(), jVar.x(z9.d.class), jVar.c(ja.b.class), (Executor) jVar.f((c9.u) this.f42702b));
    }

    @Override
    public boolean h(t0.i iVar, int i10, Bundle bundle) {
        r0.e eVar;
        m.s sVar = (m.s) this.f42702b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f44492a.b();
                Parcelable parcelable = (Parcelable) iVar.f44492a.d();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        t0.h hVar = iVar.f44492a;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.a()));
        if (i11 >= 31) {
            eVar = new r0.d(clipData, 2);
        } else {
            r0.f fVar = new r0.f();
            fVar.f43124b = clipData;
            fVar.f43125c = 2;
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
    public void i(WebView webView, b4.e0 e0Var, Uri uri, boolean z4, o2.f fVar) {
        o2.f fVar2;
        rf.j jVar = (rf.j) this.f42702b;
        if (webView == jVar.f43508m && z4 && jVar.d.equals(uri.toString())) {
            int i10 = e0Var.f1378b;
            if (i10 == 0) {
                e0Var.e(0);
                jVar.g((String) e0Var.f1379c, fVar);
            } else if (i10 == 1) {
                synchronized (jVar.f43499a) {
                    if (!jVar.f43511p && (fVar2 = jVar.f43509n) != null && fVar2 == fVar) {
                        e0Var.e(1);
                        byte[] bArr = (byte[]) e0Var.d;
                        Objects.requireNonNull(bArr);
                        jVar.f43504i.execute(new e6(11, jVar, bArr));
                    }
                }
            }
        }
    }

    @Override
    public long k(long j10) {
        r3.o oVar = (r3.o) this.f42702b;
        return h5.d0.i((j10 * oVar.e) / 1000000, 0L, oVar.f43261j - 1);
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f42701a) {
            case 2:
                ((rh.d) this.f42702b).run();
                return;
            case 3:
                rh.j jVar = (rh.j) this.f42702b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = jVar.getMessagesController().getInputUser(jVar.M);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(jVar.getParentActivity(), 3, null);
                d2Var2.q(150L);
                jVar.getConnectionsManager().sendRequest(updatestarrefprogram, new rh.b(jVar, d2Var2, 0));
                return;
            case 9:
                uf.m1 m1Var = ((uf.f1) this.f42702b).f45370a;
                uf.p1 f10 = uf.p1.f(uf.m1.b0(m1Var));
                ArrayList arrayList = m1Var.f45448b;
                int i11 = f10.f45481a;
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
                        uf.o1 c3 = f10.c(((Integer) arrayList.get(i13)).intValue());
                        f10.f45482b.remove(c3);
                        f10.a(c3.f45472b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c3.f45471a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new nh.p5(20));
                        if ("hello".equals(c3.f45472b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(c3.f45472b)) {
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
                uf.m1.X(m1Var);
                return;
            default:
                ((cg.u0) this.f42702b).run();
                return;
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        a9 a9Var = (a9) this.f42702b;
        da daVar = a9Var.f41310a;
        s5 s5Var = daVar.L0;
        int i10 = daVar.f41517c;
        if (s5Var != null) {
            s5Var.g(true);
        }
        if (daVar.q0()) {
            daVar.f41567s.d();
        }
        if (daVar.D1 != null && daVar.f41589y0 != null) {
            daVar.N1 = false;
            daVar.O1 = false;
            o5 o5Var = daVar.f41592z0;
            if (o5Var != null) {
                o5Var.c(false);
            }
            if (j10 <= 800) {
                daVar.h(false, true);
                daVar.d0(false);
                daVar.G0.b(false, true);
                s5 s5Var2 = daVar.L0;
                if (s5Var2 != null) {
                    s5Var2.g(true);
                }
                try {
                    daVar.D1.delete();
                    daVar.D1 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (str != null) {
                    try {
                        new File(str).delete();
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                return;
            }
            daVar.i0(false, true);
            t6 o10 = t6.o(daVar.D1, str, j10);
            o10.J0 = daVar.f41568s0;
            o10.K0 = daVar.f41571t0;
            o10.B();
            daVar.h(false, true);
            daVar.d0(false);
            daVar.G0.b(false, true);
            s5 s5Var3 = daVar.L0;
            if (s5Var3 != null) {
                s5Var3.g(true);
            }
            if (daVar.f41585x0.j()) {
                daVar.D1 = null;
                o10.P = 1.0f;
                if (daVar.f41585x0.l(o10)) {
                    t6 a2 = t6.a(daVar.f41585x0.getLayout(), daVar.f41585x0.getContent());
                    daVar.H1 = a2;
                    f8.a(i10, a2);
                    daVar.I1 = false;
                    int videoWidth = daVar.f41589y0.getVideoWidth();
                    int videoHeight = daVar.f41589y0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        t6 t6Var = daVar.H1;
                        t6Var.f42422k0 = videoWidth;
                        t6Var.f42424l0 = videoHeight;
                        t6Var.A();
                    }
                }
                daVar.m0(true);
                return;
            }
            daVar.H1 = o10;
            f8.a(i10, o10);
            daVar.I1 = false;
            int videoWidth2 = daVar.f41589y0.getVideoWidth();
            int videoHeight2 = daVar.f41589y0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                t6 t6Var2 = daVar.H1;
                t6Var2.f42422k0 = videoWidth2;
                t6Var2.f42424l0 = videoHeight2;
                t6Var2.A();
            }
            daVar.L(new x8(a9Var, 3), 0L);
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        uf.w0 w0Var;
        uf.w0 w0Var2;
        int i11;
        switch (this.f42701a) {
            case 4:
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((rh.x3) this.f42702b).V((i51) obj);
                return;
            case 5:
            case 6:
            case 9:
            default:
                i51 i51Var = (i51) obj;
                View view2 = (View) obj2;
                Integer num = (Integer) obj3;
                Float f10 = (Float) obj4;
                Float f11 = (Float) obj5;
                if (((vh.s3[]) this.f42702b)[0] != null) {
                    num.intValue();
                    f10.floatValue();
                    f11.floatValue();
                    if (view2 instanceof vh.w5) {
                        ((vh.w5) view2).B();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                uf.x0 x0Var = (uf.x0) this.f42702b;
                i51 i51Var2 = (i51) obj;
                View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i12 = i51Var2.d;
                if (i12 == -1) {
                    boolean z4 = !x0Var.e;
                    x0Var.e = z4;
                    ((org.telegram.ui.Cells.r8) view3).setChecked(z4);
                    x0Var.f45537a.V2.N(true);
                    x0Var.Y(true);
                    return;
                } else if (i12 == -2) {
                    ?? p2Var = new org.telegram.ui.ActionBar.p2(null);
                    p2Var.f45497n = x0Var.f45542r;
                    p2Var.f45495c = new s1(17, x0Var, view3);
                    x0Var.presentFragment((org.telegram.ui.ActionBar.p2) p2Var);
                    return;
                } else if (i51Var2.f1830a == 5 && i12 >= 0 && i12 < x0Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue >= view3.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue <= AndroidUtilities.dp(76.0f)) {
                        if (x0Var.h[i51Var2.d].isEmpty()) {
                            ((org.telegram.ui.Cells.i5) view3).setChecked(true);
                            x0Var.h[i51Var2.d].add(new uf.w0(0, 1439));
                            x0Var.X(i51Var2.d);
                        } else {
                            x0Var.h[i51Var2.d].clear();
                            ((org.telegram.ui.Cells.i5) view3).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.i5) view3).setValue(uf.x0.a0(x0Var.h[i51Var2.d]));
                        x0Var.Y(true);
                        return;
                    }
                    int i13 = (i51Var2.d + 6) % 7;
                    int i14 = 0;
                    for (int i15 = 0; i15 < x0Var.h[i13].size(); i15++) {
                        if (((uf.w0) x0Var.h[i13].get(i15)).f45535b > i14) {
                            i14 = ((uf.w0) x0Var.h[i13].get(i15)).f45535b;
                        }
                    }
                    int max = Math.max(0, i14 - 1439);
                    int i16 = (i51Var2.d + 1) % 7;
                    int i17 = 1440;
                    for (int i18 = 0; i18 < x0Var.h[i16].size(); i18++) {
                        if (((uf.w0) x0Var.h[i16].get(i18)).f45534a < i17) {
                            i17 = ((uf.w0) x0Var.h[i16].get(i18)).f45534a;
                        }
                    }
                    int i19 = i17 + 1439;
                    CharSequence charSequence = i51Var2.f25585l;
                    ArrayList arrayList = x0Var.h[i51Var2.d];
                    int i20 = 0;
                    for (int i21 = 0; i21 < 7; i21++) {
                        ArrayList arrayList2 = x0Var.h[i21];
                        if (arrayList2 != null) {
                            i20 = Math.max(1, arrayList2.size()) + i20;
                        }
                    }
                    uf.z0 z0Var = new uf.z0(charSequence, arrayList, max, i19, 28 - i20);
                    z0Var.f45553f = new ga(x0Var, 22);
                    z0Var.h = new uf.d0(2, x0Var, i51Var2);
                    x0Var.presentFragment(z0Var);
                    return;
                } else {
                    return;
                }
            case 8:
                final uf.z0 z0Var2 = (uf.z0) this.f42702b;
                i51 i51Var3 = (i51) obj;
                final View view4 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i22 = z0Var2.f45552c;
                int i23 = z0Var2.d;
                ArrayList arrayList3 = z0Var2.f45551b;
                int i24 = i51Var3.d;
                if (i24 == -1) {
                    z0Var2.f45555r = !z0Var2.f45555r;
                    arrayList3.clear();
                    if (z0Var2.f45555r) {
                        arrayList3.add(new uf.w0(0, 1439));
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view4;
                    boolean z10 = z0Var2.f45555r;
                    i51Var3.e = z10;
                    r8Var.setChecked(z10);
                    boolean z11 = z0Var2.f45555r;
                    if (z11) {
                        i11 = org.telegram.ui.ActionBar.j6.f19917f6;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.e6;
                    }
                    r8Var.b(org.telegram.ui.ActionBar.j6.w0(null, i11, false), z11);
                    z0Var2.f45554n.V2.N(true);
                    ga gaVar = z0Var2.f45553f;
                    if (gaVar != null) {
                        gaVar.run();
                        return;
                    }
                    return;
                } else if (i24 == -2) {
                    if (!arrayList3.isEmpty() && !z0Var2.U()) {
                        int i25 = ((uf.w0) kf.k0.i(1, arrayList3)).f45535b;
                        int clamp = Utilities.clamp(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new uf.w0(clamp, Utilities.clamp((i25 + 1560) / 2, i23, clamp + 1)));
                    } else {
                        if (z0Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp2 = Utilities.clamp(480, i23 - 1, i22);
                        arrayList3.add(new uf.w0(clamp2, Utilities.clamp(1200, i23, clamp2 + 1)));
                    }
                    ga gaVar2 = z0Var2.f45553f;
                    if (gaVar2 != null) {
                        gaVar2.run();
                    }
                    z0Var2.f45554n.V2.N(true);
                    return;
                } else if (i51Var3.f1830a == 3 && (i10 = i24 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i26 = i10 - 1;
                    if (i26 >= 0) {
                        w0Var = (uf.w0) arrayList3.get(i26);
                    } else {
                        w0Var = null;
                    }
                    final uf.w0 w0Var3 = (uf.w0) arrayList3.get(i10);
                    int i27 = i10 + 1;
                    if (i27 < arrayList3.size()) {
                        w0Var2 = (uf.w0) arrayList3.get(i27);
                    } else {
                        w0Var2 = null;
                    }
                    int i28 = i51Var3.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = z0Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i29 = w0Var3.f45534a;
                        if (w0Var != null) {
                            i22 = w0Var.f45535b + 1;
                        }
                        org.telegram.ui.Components.z4.X(parentActivity, string, i29, i22, w0Var3.f45535b - 1, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        z0 z0Var3 = z0Var2;
                                        boolean V = z0Var3.V();
                                        int intValue = num2.intValue();
                                        w0Var3.f45534a = intValue;
                                        ((n8) view4).u(w0.a(intValue), true);
                                        if (V != z0Var3.V()) {
                                            z0Var3.f45554n.V2.N(true);
                                        }
                                        ga gaVar3 = z0Var3.f45553f;
                                        if (gaVar3 != null) {
                                            gaVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        z0 z0Var4 = z0Var2;
                                        boolean V2 = z0Var4.V();
                                        int intValue2 = num2.intValue();
                                        w0Var3.f45535b = intValue2;
                                        ((n8) view4).u(w0.a(intValue2), true);
                                        if (V2 != z0Var4.V()) {
                                            z0Var4.f45554n.V2.N(true);
                                        }
                                        ga gaVar4 = z0Var4.f45553f;
                                        if (gaVar4 != null) {
                                            gaVar4.run();
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
                        int i30 = w0Var3.f45535b;
                        int i31 = w0Var3.f45534a + 1;
                        if (w0Var2 != null) {
                            i23 = w0Var2.f45534a - 1;
                        }
                        org.telegram.ui.Components.z4.X(parentActivity2, string2, i30, i31, i23, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        z0 z0Var3 = z0Var2;
                                        boolean V = z0Var3.V();
                                        int intValue = num2.intValue();
                                        w0Var3.f45534a = intValue;
                                        ((n8) view4).u(w0.a(intValue), true);
                                        if (V != z0Var3.V()) {
                                            z0Var3.f45554n.V2.N(true);
                                        }
                                        ga gaVar3 = z0Var3.f45553f;
                                        if (gaVar3 != null) {
                                            gaVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        z0 z0Var4 = z0Var2;
                                        boolean V2 = z0Var4.V();
                                        int intValue2 = num2.intValue();
                                        w0Var3.f45535b = intValue2;
                                        ((n8) view4).u(w0.a(intValue2), true);
                                        if (V2 != z0Var4.V()) {
                                            z0Var4.f45554n.V2.N(true);
                                        }
                                        ga gaVar4 = z0Var4.f45553f;
                                        if (gaVar4 != null) {
                                            gaVar4.run();
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
                            arrayList3.add(new uf.w0(0, 1439));
                        }
                        z0Var2.f45554n.V2.N(true);
                        ga gaVar3 = z0Var2.f45553f;
                        if (gaVar3 != null) {
                            gaVar3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 10:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                uf.r1.U((uf.r1) this.f42702b, (i51) obj, (View) obj2);
                return;
        }
    }

    @Override
    public boolean w(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        vh.d4 d4Var = (vh.d4) this.f42702b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        d4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        qyVar.finishFragment();
        return true;
    }

    @Override
    public void z(float f10, int i10) {
    }
}
