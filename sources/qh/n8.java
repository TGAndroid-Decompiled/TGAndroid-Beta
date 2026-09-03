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
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.yz;
public final class n8 implements CameraView.CameraViewDelegate, r0.o, org.telegram.ui.ActionBar.c2, g91, Utilities.CallbackVoidReturn, w61, k7, p6 {
    public final int f45808a;
    public final ba f45809b;

    public n8(ba baVar, int i10) {
        this.f45808a = i10;
        this.f45809b = baVar;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.f7757a;
        ba baVar = this.f45809b;
        baVar.V = i10;
        baVar.W = defaultWindowInsets.f7758b;
        baVar.X = defaultWindowInsets.f7759c;
        baVar.Y = defaultWindowInsets.d;
        baVar.f45081n.requestLayout();
        return r0.m1.f46482b;
    }

    @Override
    public void a(float f10) {
        ba baVar = this.f45809b;
        f9 f9Var = baVar.f45120y0;
        if (f9Var != null) {
            baVar.Q1 = f10;
            f9Var.setZoom(f10);
        }
        baVar.j0(true);
    }

    @Override
    public void b(xz xzVar) {
        MediaController.SavedFilterState savedFilterState;
        ba baVar = this.f45809b;
        if (xzVar != null) {
            r6 r6Var = baVar.H1;
            if (r6Var != null && (savedFilterState = r6Var.f45994a1) != null) {
                xzVar.f(new yz(savedFilterState));
                return;
            }
            return;
        }
        baVar.getClass();
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f45809b.H1.L.getAbsolutePath(), options);
    }

    @Override
    public void e(final a8 a8Var, final boolean z4, final boolean z10, boolean z11, final boolean z12, final TLRPC.InputPeer inputPeer, final int i10, l6 l6Var, final org.telegram.ui.web.s0 s0Var) {
        switch (this.f45808a) {
            case 10:
                ArrayList arrayList = a8Var.f44995b;
                ba baVar = this.f45809b;
                if (baVar.H1 != null) {
                    baVar.U0.x(5, true);
                    baVar.H1.E0 = a8Var;
                    int i11 = baVar.f45047c;
                    int i12 = e8.f45307a;
                    SerializedData serializedData = new SerializedData(true);
                    e8.c(serializedData, a8Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    e8.c(serializedData2, a8Var);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    r6 r6Var = baVar.H1;
                    r6Var.G0 = z11;
                    r6Var.H0 = z10;
                    r6Var.F0.clear();
                    baVar.H1.F0.addAll(arrayList);
                    r6 r6Var2 = baVar.H1;
                    r6Var2.f46017l = true;
                    r6Var2.f46036v0 = inputPeer;
                    ArrayList arrayList2 = baVar.E1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            r6 r6Var3 = (r6) obj;
                            r6Var3.E0 = a8Var;
                            ArrayList arrayList3 = r6Var3.F0;
                            r6Var3.G0 = z11;
                            r6Var3.H0 = z10;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            r6Var3.f46017l = true;
                            r6Var3.f46036v0 = inputPeer;
                        }
                    }
                    baVar.i(new k8(baVar, l6Var, 0));
                    return;
                }
                return;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z12 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final ba baVar2 = this.f45809b;
                ie0.d(i14, i15, strArr, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        final boolean z13;
                        TLRPC.InputPeer inputPeer2;
                        long clientUserId;
                        final ba baVar3 = ba.this;
                        int i16 = baVar3.f45047c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final org.telegram.ui.web.s0 s0Var2 = s0Var;
                        if (!booleanValue) {
                            s0Var2.run();
                            return;
                        }
                        f9 f9Var = baVar3.f45120y0;
                        if (f9Var != null && !f9Var.isFrontface()) {
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
                        tL_startLive.privacy_rules.addAll(a8Var.f44995b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z14 = z12;
                        tL_startLive.rtmp_stream = z14;
                        tL_startLive.messages_enabled = Boolean.valueOf(z4);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new mh.i6(ba.this, tLObject, tL_startLive, z14, j10, z13, tL_error, s0Var2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f45808a) {
            case 2:
                ba baVar = this.f45809b;
                baVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    baVar.f45043b.startActivity(intent);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 3:
                ba baVar2 = this.f45809b;
                baVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    baVar2.f45043b.startActivity(intent2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                ba baVar3 = this.f45809b;
                baVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    baVar3.f45043b.startActivity(intent3);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 5:
                ba baVar4 = this.f45809b;
                baVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    baVar4.f45043b.startActivity(intent4);
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 8:
                ba baVar5 = this.f45809b;
                int i11 = baVar5.f45047c;
                r6 r6Var = baVar5.H1;
                if (r6Var != null) {
                    r6Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    baVar5.S1 = !baVar5.H1.f45998c;
                    baVar5.i(null);
                    baVar5.l();
                    baVar5.m();
                    baVar5.y();
                    r6 r6Var2 = baVar5.H1;
                    r6Var2.i(true);
                    r6Var2.C0 = baVar5.Z0.getText();
                    baVar5.H1 = null;
                    baVar5.W(r6Var2, true);
                    t0 t0Var = MessagesController.getInstance(i11).getStoriesController().f17791w;
                    if (r6Var2.f45998c) {
                        t0Var.d(r6Var2);
                    } else {
                        ArrayList arrayList = t0Var.f46116b;
                        if (!r6Var2.f46034u) {
                            t0Var.e(r6Var2);
                            r6Var2.f45995b = Utilities.random.nextLong();
                            s0 s0Var = new s0(r6Var2);
                            arrayList.remove(r6Var2);
                            arrayList.add(0, r6Var2);
                            t0Var.a(s0Var);
                        }
                    }
                    baVar5.K(0, true);
                    return;
                }
                return;
            case 9:
                ba baVar6 = this.f45809b;
                r6 r6Var3 = baVar6.H1;
                if (r6Var3 != null && !r6Var3.f46008g && ((!r6Var3.f46020n || r6Var3.f46034u) && r6Var3.f45998c)) {
                    MessagesController.getInstance(baVar6.f45047c).getStoriesController().f17791w.c(baVar6.H1);
                    baVar6.H1 = null;
                }
                r6 r6Var4 = baVar6.H1;
                if (r6Var4 != null && (r6Var4.f46022o || r6Var4.f46008g || (r6Var4.f46020n && !r6Var4.f46034u))) {
                    baVar6.q(true);
                    return;
                } else {
                    baVar6.K(0, true);
                    return;
                }
        }
    }

    @Override
    public void onCameraInit() {
        ba baVar = this.f45809b;
        String C = baVar.C();
        String str = null;
        if (TextUtils.equals(C, baVar.F())) {
            C = null;
        }
        if (baVar.f45048c0 == 0) {
            str = C;
        }
        baVar.e0(str);
        h91 h91Var = baVar.S0;
        if (h91Var != null) {
            baVar.Q1 = 0.0f;
            h91Var.b(0.0f, false);
        }
        baVar.m0(true);
    }

    @Override
    public Object run() {
        Bitmap bitmap;
        p9 p9Var;
        ba baVar = this.f45809b;
        pf0 pf0Var = baVar.f45121y1;
        if (pf0Var != null) {
            bitmap = pf0Var.getUiBlurBitmap();
        } else {
            bitmap = null;
        }
        if (bitmap == null && (p9Var = baVar.U0) != null && p9Var.getTextureView() != null) {
            return baVar.U0.getTextureView().getUiBlurBitmap();
        }
        return bitmap;
    }
}
