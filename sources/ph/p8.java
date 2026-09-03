package ph;

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
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wz;
public final class p8 implements CameraView.CameraViewDelegate, r0.o, org.telegram.ui.ActionBar.c2, g91, Utilities.CallbackVoidReturn, v61, m7, r6 {
    public final int f42215a;
    public final da f42216b;

    public p8(da daVar, int i10) {
        this.f42215a = i10;
        this.f42216b = daVar;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.f7196a;
        da daVar = this.f42216b;
        daVar.V = i10;
        daVar.W = defaultWindowInsets.f7197b;
        daVar.X = defaultWindowInsets.f7198c;
        daVar.Y = defaultWindowInsets.d;
        daVar.f41550n.requestLayout();
        return r0.m1.f43153b;
    }

    @Override
    public void a(float f10) {
        da daVar = this.f42216b;
        i9 i9Var = daVar.f41589y0;
        if (i9Var != null) {
            daVar.Q1 = f10;
            i9Var.setZoom(f10);
        }
        daVar.j0(true);
    }

    @Override
    public void b(vz vzVar) {
        MediaController.SavedFilterState savedFilterState;
        da daVar = this.f42216b;
        if (vzVar != null) {
            t6 t6Var = daVar.H1;
            if (t6Var != null && (savedFilterState = t6Var.f42401a1) != null) {
                vzVar.f(new wz(savedFilterState));
                return;
            }
            return;
        }
        daVar.getClass();
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f42216b.H1.L.getAbsolutePath(), options);
    }

    @Override
    public void d(final c8 c8Var, final boolean z4, final boolean z10, boolean z11, final boolean z12, final TLRPC.InputPeer inputPeer, final int i10, e6 e6Var, final org.telegram.ui.web.q0 q0Var) {
        switch (this.f42215a) {
            case 10:
                ArrayList arrayList = c8Var.f41438b;
                da daVar = this.f42216b;
                if (daVar.H1 != null) {
                    daVar.U0.x(5, true);
                    daVar.H1.E0 = c8Var;
                    int i11 = daVar.f41517c;
                    int i12 = f8.f41706a;
                    SerializedData serializedData = new SerializedData(true);
                    f8.c(serializedData, c8Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    f8.c(serializedData2, c8Var);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    t6 t6Var = daVar.H1;
                    t6Var.G0 = z11;
                    t6Var.H0 = z10;
                    t6Var.F0.clear();
                    daVar.H1.F0.addAll(arrayList);
                    t6 t6Var2 = daVar.H1;
                    t6Var2.f42423l = true;
                    t6Var2.f42442v0 = inputPeer;
                    ArrayList arrayList2 = daVar.E1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            t6 t6Var3 = (t6) obj;
                            t6Var3.E0 = c8Var;
                            ArrayList arrayList3 = t6Var3.F0;
                            t6Var3.G0 = z11;
                            t6Var3.H0 = z10;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            t6Var3.f42423l = true;
                            t6Var3.f42442v0 = inputPeer;
                        }
                    }
                    daVar.i(new m8(daVar, e6Var, 0));
                    return;
                }
                return;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z12 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final da daVar2 = this.f42216b;
                he0.d(i14, i15, strArr, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        final boolean z13;
                        TLRPC.InputPeer inputPeer2;
                        long clientUserId;
                        final da daVar3 = da.this;
                        int i16 = daVar3.f41517c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final org.telegram.ui.web.q0 q0Var2 = q0Var;
                        if (!booleanValue) {
                            q0Var2.run();
                            return;
                        }
                        i9 i9Var = daVar3.f41589y0;
                        if (i9Var != null && !i9Var.isFrontface()) {
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
                        tL_startLive.privacy_rules.addAll(c8Var.f41438b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z14 = z12;
                        tL_startLive.rtmp_stream = z14;
                        tL_startLive.messages_enabled = Boolean.valueOf(z4);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new lh.i6(da.this, tLObject, tL_startLive, z14, j10, z13, tL_error, q0Var2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f42215a) {
            case 2:
                da daVar = this.f42216b;
                daVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    daVar.f41513b.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                da daVar2 = this.f42216b;
                daVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    daVar2.f41513b.startActivity(intent2);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                da daVar3 = this.f42216b;
                daVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    daVar3.f41513b.startActivity(intent3);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 5:
                da daVar4 = this.f42216b;
                daVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    daVar4.f41513b.startActivity(intent4);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 8:
                da daVar5 = this.f42216b;
                int i11 = daVar5.f41517c;
                t6 t6Var = daVar5.H1;
                if (t6Var != null) {
                    t6Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    daVar5.S1 = !daVar5.H1.f42405c;
                    daVar5.i(null);
                    daVar5.l();
                    daVar5.m();
                    daVar5.y();
                    t6 t6Var2 = daVar5.H1;
                    t6Var2.i(true);
                    t6Var2.C0 = daVar5.Z0.getText();
                    daVar5.H1 = null;
                    daVar5.W(t6Var2, true);
                    t0 t0Var = MessagesController.getInstance(i11).getStoriesController().f15915w;
                    if (t6Var2.f42405c) {
                        t0Var.d(t6Var2);
                    } else {
                        ArrayList arrayList = t0Var.f42384b;
                        if (!t6Var2.f42440u) {
                            t0Var.e(t6Var2);
                            t6Var2.f42402b = Utilities.random.nextLong();
                            s0 s0Var = new s0(t6Var2);
                            arrayList.remove(t6Var2);
                            arrayList.add(0, t6Var2);
                            t0Var.a(s0Var);
                        }
                    }
                    daVar5.K(0, true);
                    return;
                }
                return;
            case 9:
                da daVar6 = this.f42216b;
                t6 t6Var3 = daVar6.H1;
                if (t6Var3 != null && !t6Var3.f42414g && ((!t6Var3.f42426n || t6Var3.f42440u) && t6Var3.f42405c)) {
                    MessagesController.getInstance(daVar6.f41517c).getStoriesController().f15915w.c(daVar6.H1);
                    daVar6.H1 = null;
                }
                t6 t6Var4 = daVar6.H1;
                if (t6Var4 != null && (t6Var4.f42428o || t6Var4.f42414g || (t6Var4.f42426n && !t6Var4.f42440u))) {
                    daVar6.q(true);
                    return;
                } else {
                    daVar6.K(0, true);
                    return;
                }
        }
    }

    @Override
    public void onCameraInit() {
        da daVar = this.f42216b;
        String C = daVar.C();
        String str = null;
        if (TextUtils.equals(C, daVar.F())) {
            C = null;
        }
        if (daVar.f41518c0 == 0) {
            str = C;
        }
        daVar.e0(str);
        h91 h91Var = daVar.S0;
        if (h91Var != null) {
            daVar.Q1 = 0.0f;
            h91Var.b(0.0f, false);
        }
        daVar.m0(true);
    }

    @Override
    public Object run() {
        Bitmap bitmap;
        s9 s9Var;
        da daVar = this.f42216b;
        of0 of0Var = daVar.f41590y1;
        if (of0Var != null) {
            bitmap = of0Var.getUiBlurBitmap();
        } else {
            bitmap = null;
        }
        if (bitmap == null && (s9Var = daVar.U0) != null && s9Var.getTextureView() != null) {
            return daVar.U0.getTextureView().getUiBlurBitmap();
        }
        return bitmap;
    }
}
