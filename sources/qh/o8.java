package qh;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.yz;
public final class o8 implements CameraView.CameraViewDelegate, r0.o, org.telegram.ui.ActionBar.c2, h91, Utilities.CallbackVoidReturn, x61, l7, q6 {
    public final int f45836a;
    public final ca f45837b;

    public o8(ca caVar, int i10) {
        this.f45836a = i10;
        this.f45837b = caVar;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.f7757a;
        ca caVar = this.f45837b;
        caVar.V = i10;
        caVar.W = defaultWindowInsets.f7758b;
        caVar.X = defaultWindowInsets.f7759c;
        caVar.Y = defaultWindowInsets.d;
        caVar.f45115n.requestLayout();
        return r0.m1.f46451b;
    }

    @Override
    public void a(float f10) {
        ca caVar = this.f45837b;
        g9 g9Var = caVar.f45154y0;
        if (g9Var != null) {
            caVar.Q1 = f10;
            g9Var.setZoom(f10);
        }
        caVar.j0(true);
    }

    @Override
    public void b(xz xzVar) {
        MediaController.SavedFilterState savedFilterState;
        ca caVar = this.f45837b;
        if (xzVar != null) {
            s6 s6Var = caVar.H1;
            if (s6Var != null && (savedFilterState = s6Var.f46043a1) != null) {
                xzVar.f(new yz(savedFilterState));
                return;
            }
            return;
        }
        caVar.getClass();
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f45837b.H1.L.getAbsolutePath(), options);
    }

    @Override
    public void e(final b8 b8Var, final boolean z4, final boolean z10, boolean z11, final boolean z12, final TLRPC.InputPeer inputPeer, final int i10, d6 d6Var, final org.telegram.ui.web.s0 s0Var) {
        switch (this.f45836a) {
            case 10:
                ArrayList arrayList = b8Var.f45018b;
                ca caVar = this.f45837b;
                if (caVar.H1 != null) {
                    caVar.U0.x(5, true);
                    caVar.H1.E0 = b8Var;
                    int i11 = caVar.f45081c;
                    int i12 = f8.f45333a;
                    SerializedData serializedData = new SerializedData(true);
                    f8.c(serializedData, b8Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    f8.c(serializedData2, b8Var);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    s6 s6Var = caVar.H1;
                    s6Var.G0 = z11;
                    s6Var.H0 = z10;
                    s6Var.F0.clear();
                    caVar.H1.F0.addAll(arrayList);
                    s6 s6Var2 = caVar.H1;
                    s6Var2.f46066l = true;
                    s6Var2.f46085v0 = inputPeer;
                    ArrayList arrayList2 = caVar.E1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            s6 s6Var3 = (s6) obj;
                            s6Var3.E0 = b8Var;
                            ArrayList arrayList3 = s6Var3.F0;
                            s6Var3.G0 = z11;
                            s6Var3.H0 = z10;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            s6Var3.f46066l = true;
                            s6Var3.f46085v0 = inputPeer;
                        }
                    }
                    caVar.i(new l8(caVar, d6Var, 0));
                    return;
                }
                return;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z12 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final ca caVar2 = this.f45837b;
                ie0.d(i14, i15, strArr, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        final boolean z13;
                        TLRPC.InputPeer inputPeer2;
                        long clientUserId;
                        final ca caVar3 = ca.this;
                        int i16 = caVar3.f45081c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final org.telegram.ui.web.s0 s0Var2 = s0Var;
                        if (!booleanValue) {
                            s0Var2.run();
                            return;
                        }
                        g9 g9Var = caVar3.f45154y0;
                        if (g9Var != null && !g9Var.isFrontface()) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = true ^ z10;
                        TLRPC.InputPeer inputPeer3 = inputPeer;
                        if (inputPeer3 == null) {
                            inputPeer2 = new TLRPC.TL_inputPeerSelf();
                        } else {
                            inputPeer2 = inputPeer3;
                        }
                        tL_startLive.peer = inputPeer2;
                        if (inputPeer3 != null && !(inputPeer3 instanceof TLRPC.TL_inputPeerSelf)) {
                            clientUserId = DialogObject.getPeerDialogId(inputPeer3);
                        } else {
                            clientUserId = UserConfig.getInstance(i16).getClientUserId();
                        }
                        final long j10 = clientUserId;
                        tL_startLive.privacy_rules.addAll(b8Var.f45018b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z14 = z12;
                        tL_startLive.rtmp_stream = z14;
                        tL_startLive.messages_enabled = Boolean.valueOf(z4);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new mh.i6(ca.this, tLObject, tL_startLive, z14, j10, z13, tL_error, s0Var2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f45836a) {
            case 2:
                ca caVar = this.f45837b;
                caVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    caVar.f45077b.startActivity(intent);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 3:
                ca caVar2 = this.f45837b;
                caVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    caVar2.f45077b.startActivity(intent2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                ca caVar3 = this.f45837b;
                caVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    caVar3.f45077b.startActivity(intent3);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 5:
                ca caVar4 = this.f45837b;
                caVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    caVar4.f45077b.startActivity(intent4);
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 8:
                ca caVar5 = this.f45837b;
                int i11 = caVar5.f45081c;
                s6 s6Var = caVar5.H1;
                if (s6Var != null) {
                    s6Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    caVar5.S1 = !caVar5.H1.f46047c;
                    caVar5.i(null);
                    caVar5.l();
                    caVar5.m();
                    caVar5.y();
                    s6 s6Var2 = caVar5.H1;
                    s6Var2.i(true);
                    s6Var2.C0 = caVar5.Z0.getText();
                    caVar5.H1 = null;
                    caVar5.W(s6Var2, true);
                    t0 t0Var = MessagesController.getInstance(i11).getStoriesController().f17789w;
                    if (s6Var2.f46047c) {
                        t0Var.d(s6Var2);
                    } else {
                        ArrayList arrayList = t0Var.f46103b;
                        if (!s6Var2.f46083u) {
                            t0Var.e(s6Var2);
                            s6Var2.f46044b = Utilities.random.nextLong();
                            s0 s0Var = new s0(s6Var2);
                            arrayList.remove(s6Var2);
                            arrayList.add(0, s6Var2);
                            t0Var.a(s0Var);
                        }
                    }
                    caVar5.K(0, true);
                    return;
                }
                return;
            case 9:
                ca caVar6 = this.f45837b;
                s6 s6Var3 = caVar6.H1;
                if (s6Var3 != null && !s6Var3.f46057g && ((!s6Var3.f46069n || s6Var3.f46083u) && s6Var3.f46047c)) {
                    MessagesController.getInstance(caVar6.f45081c).getStoriesController().f17789w.c(caVar6.H1);
                    caVar6.H1 = null;
                }
                s6 s6Var4 = caVar6.H1;
                if (s6Var4 != null && (s6Var4.f46071o || s6Var4.f46057g || (s6Var4.f46069n && !s6Var4.f46083u))) {
                    caVar6.q(true);
                    return;
                } else {
                    caVar6.K(0, true);
                    return;
                }
        }
    }

    @Override
    public void onCameraInit() {
        ca caVar = this.f45837b;
        String C = caVar.C();
        String str = null;
        if (TextUtils.equals(C, caVar.F())) {
            C = null;
        }
        if (caVar.f45082c0 == 0) {
            str = C;
        }
        caVar.e0(str);
        i91 i91Var = caVar.S0;
        if (i91Var != null) {
            caVar.Q1 = 0.0f;
            i91Var.b(0.0f, false);
        }
        caVar.m0(true);
    }

    @Override
    public Object run() {
        Bitmap bitmap;
        q9 q9Var;
        ca caVar = this.f45837b;
        pf0 pf0Var = caVar.f45155y1;
        if (pf0Var != null) {
            bitmap = pf0Var.getUiBlurBitmap();
        } else {
            bitmap = null;
        }
        if (bitmap == null && (q9Var = caVar.U0) != null && q9Var.getTextureView() != null) {
            return caVar.U0.getTextureView().getUiBlurBitmap();
        }
        return bitmap;
    }
}
