package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;
public final class yd0 implements Runnable {
    public final int f54348a;
    public final Object f54349b;
    public final Object f54350c;
    public final Object d;
    public final Object f54351e;

    public yd0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f54348a = i7;
        this.f54350c = obj;
        this.d = obj2;
        this.f54351e = obj3;
        this.f54349b = obj4;
    }

    @Override
    public final void run() {
        int i7;
        boolean z10;
        boolean z11;
        TLRPC.Chat O0;
        int i10;
        int i11;
        String N0;
        String a02;
        org.telegram.ui.Components.fc Q;
        String str;
        jl0 jl0Var;
        jl0 jl0Var2;
        Uri fromFile;
        TLObject O02;
        int indexOf;
        TLObject O03;
        int i12;
        String G;
        org.telegram.ui.web.v0 v0Var;
        int i13 = 2;
        switch (this.f54348a) {
            case 0:
                ce0 ce0Var = (ce0) this.f54350c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.f54351e;
                String str2 = (String) this.f54349b;
                ce0Var.N = false;
                de0 de0Var = ce0Var.f46781h0;
                de0Var.N1(false, true);
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        org.telegram.ui.Components.b5.u0(de0Var.getParentActivity(), org.telegram.messenger.gd.N0(2131743573, "UpdateAppAlert"), true);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                    bundle.putString("phoneFormated", str2);
                    de0Var.M1(6, true, bundle, false);
                    return;
                }
                de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), tL_error.text);
                return;
            case 1:
                jg0 jg0Var = (jg0) this.f54350c;
                mg.b bVar = (mg.b) this.d;
                String str3 = (String) this.f54349b;
                a51 a51Var = (a51) this.f54351e;
                mg0 mg0Var = jg0Var.f49120w.d;
                if (bVar != null) {
                    mg0Var.f50068w.l(str3, bVar);
                }
                if (bVar != null && !a51Var.f45592b && (i7 = a51Var.f45591a) >= 0) {
                    View m10 = mg0Var.h.m(i7);
                    if (m10 instanceof l41) {
                        jg0Var.f49590r.f50211e = bVar;
                        l41 l41Var = (l41) m10;
                        l41Var.f49585b.f19917u0.d(false, false);
                        l41Var.g(false);
                    }
                }
                jg0Var.f();
                return;
            case 2:
                qh0 qh0Var = (qh0) this.f54350c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f54351e;
                ArrayList arrayList3 = (ArrayList) this.f54349b;
                jg.z1 z1Var = qh0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = qh0Var.f51461n;
                if (notificationsCustomSettingsActivity.f43240f) {
                    qh0Var.f51460f = null;
                    qh0Var.d = arrayList;
                    qh0Var.f51459e = arrayList2;
                    z1Var.f(arrayList3, null);
                    if (notificationsCustomSettingsActivity.f43240f && !z1Var.e()) {
                        notificationsCustomSettingsActivity.f43238c.c();
                    }
                    qh0Var.f();
                    return;
                }
                return;
            case 3:
                kl0 kl0Var = (kl0) this.f54350c;
                TLRPC.Message message = (TLRPC.Message) this.f54349b;
                String str4 = "";
                kl0Var.f49458b1 = true;
                kl0Var.f49471g1 = 1;
                kl0Var.D0((org.telegram.ui.ActionBar.r4) this.d, (Activity) this.f54351e);
                TLRPC.InputInvoice inputInvoice = kl0Var.f49461c1;
                boolean z12 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                if (z12 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12 && (jl0Var2 = kl0Var.f49455a1) != null) {
                    jl0Var2.e(kl0Var.f49471g1);
                }
                kl0Var.z0();
                if (z12 && (jl0Var = kl0Var.f49455a1) != null) {
                    jl0Var.e(kl0Var.f49471g1);
                }
                long w02 = kl0Var.w0();
                int i14 = (w02 > 0L ? 1 : (w02 == 0L ? 0 : -1));
                if (i14 > 0) {
                    str4 = org.telegram.messenger.n10.l(kl0Var.getMessagesController().c2(Long.valueOf(w02)));
                } else if (i14 < 0 && (O0 = kl0Var.getMessagesController().O0(Long.valueOf(-w02))) != null) {
                    str4 = O0.title;
                }
                long v02 = kl0Var.v0();
                if (z12) {
                    if (!z10 && !z11) {
                        i10 = 2131624227;
                    } else {
                        i10 = 2131624226;
                    }
                } else {
                    i10 = 2131624115;
                }
                int i15 = i10;
                if (!z12) {
                    N0 = null;
                } else {
                    if (z11) {
                        i11 = 2131744851;
                    } else if (z10) {
                        i11 = 2131744859;
                    } else {
                        i11 = 2131744918;
                    }
                    N0 = org.telegram.messenger.gd.N0(i11, null);
                }
                if (z12) {
                    if (z11) {
                        a02 = org.telegram.messenger.gd.H(',', "StarsGiveawaySentPopupInfo", (int) v02);
                    } else {
                        if (z10) {
                            str = "StarsGiftSentPopupInfo";
                        } else {
                            str = "StarsAcquiredInfo";
                        }
                        a02 = org.telegram.messenger.gd.K(str, (int) v02, ',', str4);
                    }
                } else {
                    a02 = org.telegram.messenger.gd.a0(null, null, 2131747207, kl0Var.S0[0], kl0Var.f49483r0);
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(a02);
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(T);
                    if (i14 != 0 && N0 != null && !z11) {
                        Q = b02.L(i15, N0, W2, org.telegram.messenger.gd.N0(2131743302, null), new di.g3(w02, 3));
                    } else {
                        String str5 = N0;
                        if (str5 != null) {
                            Q = b02.I(i15, str5, W2);
                        } else {
                            Q = b02.Q(i15, 36, W2);
                        }
                    }
                    org.telegram.ui.Components.fc fcVar = Q;
                    fcVar.f35099r = false;
                    fcVar.f35091j = 5000;
                    if (message != null) {
                        fi.k3 k3Var = new fi.k3(kl0Var, fcVar, z10, message, 4);
                        org.telegram.ui.Components.kb kbVar = fcVar.f35087e;
                        if (kbVar != null) {
                            kbVar.setOnClickListener(k3Var);
                        }
                    }
                    fcVar.k(z11);
                    return;
                }
                return;
            case 4:
                kl0.i0((kl0) this.f54350c, (TLObject) this.f54351e, (TLRPC.TL_error) this.d, (TL_account.getTmpPassword) this.f54349b);
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.f54350c;
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) this.f54351e;
                String str6 = (String) this.f54349b;
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                Bitmap decodeFile = BitmapFactory.decodeFile(((org.telegram.messenger.ef) this.d).I);
                if (decodeFile == null) {
                    org.telegram.messenger.g0.g3(new kn0(photoViewer, 5));
                    return;
                }
                int[] iArr = new int[11];
                AnimatedFileNative.d(efVar.I, iArr, 0L);
                int max = Math.max(iArr[1], efVar.F);
                int max2 = Math.max(iArr[2], efVar.G);
                if ((iArr[8] / 90) % 2 == 1) {
                    max2 = max;
                    max = max2;
                }
                float f10 = max;
                float f11 = max2;
                float max3 = Math.max(decodeFile.getWidth() / f10, decodeFile.getHeight() / f11);
                int i16 = (int) (f11 * max3);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap((int) (f10 * max3), i16, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max4, max4);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str6));
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.close();
                    Bitmap createBitmap2 = Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), config);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
                    float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
                    canvas2.scale(max5, max5);
                    canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
                    org.telegram.messenger.g0.g3(new yd0((Object) photoViewer, (Object) efVar, str6, (Object) createBitmap2, 7));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    org.telegram.messenger.g0.g3(new kn0(photoViewer, 6));
                    return;
                }
            case 6:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f54350c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean[] zArr = (boolean[]) this.f54351e;
                gn0 gn0Var = (gn0) this.f54349b;
                ImageView imageView = photoViewer2.f43495x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                    photoViewer2.f43495x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer2.D2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        gn0Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f54350c;
                org.telegram.messenger.ef efVar2 = (org.telegram.messenger.ef) this.d;
                String str7 = (String) this.f54349b;
                Bitmap bitmap2 = (Bitmap) this.f54351e;
                Drawable[] drawableArr2 = PhotoViewer.f43272f9;
                if (efVar2.f27967g != null) {
                    try {
                        new File(efVar2.f27967g).delete();
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                efVar2.d = -1L;
                efVar2.f27967g = str7;
                efVar2.f27965e = null;
                efVar2.f27966f = null;
                photoViewer3.f43432q5.f34696b.setLoading(false);
                uq0 uq0Var = photoViewer3.d;
                if (uq0Var != null) {
                    uq0Var.X(photoViewer3.P4);
                }
                xo0 xo0Var = photoViewer3.f43353h1;
                if (xo0Var != null) {
                    xo0Var.setImage(bitmap2);
                }
                photoViewer3.d3(0);
                CheckBox checkBox = photoViewer3.O0;
                if (!checkBox.f32923y) {
                    checkBox.callOnClick();
                    return;
                }
                return;
            case 8:
                TLObject tLObject2 = (TLObject) this.f54351e;
                org.telegram.messenger.i10 i10Var = (org.telegram.messenger.i10) this.d;
                TLRPC.Photo photo = (TLRPC.Photo) this.f54349b;
                PhotoViewer photoViewer4 = ((ro0) this.f54350c).f51804b;
                if (tLObject2 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject2;
                    int i17 = photoViewer4.U;
                    ArrayList arrayList4 = photoViewer4.f43341f7;
                    org.telegram.messenger.mp.u1(i17).f4(tL_photos_photo.users, false);
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(photoViewer4.U).c2(Long.valueOf(i10Var.f24656n));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList4.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList4.set(indexOf2, tL_photos_photo.photo);
                        }
                        if (c22 != null) {
                            c22.photo.photo_id = tL_photos_photo.photo.f28516id;
                            i10Var.w(c22);
                            i10Var.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                hs0.Z((hs0) this.f54350c, (TLRPC.TL_error) this.d, (TLObject) this.f54351e, (TL_stars.updatePaidMessagesPrice) this.f54349b);
                return;
            case 10:
                PrivacyControlActivity.a0((PrivacyControlActivity) this.f54350c, (TLRPC.TL_error) this.d, (TLObject) this.f54351e, (boolean[]) this.f54349b);
                return;
            case 11:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f54350c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                TLObject tLObject3 = (TLObject) this.f54351e;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.f54349b;
                try {
                    t1Var.dismiss();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.R = true;
                    privacySettingsActivity.getContactsController().I = setaccountttl.ttl.days;
                    privacySettingsActivity.f43618a.f();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.f54350c;
                boolean[] zArr2 = (boolean[]) this.d;
                Activity activity = (Activity) this.f54351e;
                File file = (File) this.f54349b;
                RectF rectF = ProfileActivity.Z6;
                try {
                    t1Var2.dismiss();
                } catch (Exception unused) {
                }
                if (zArr2[0]) {
                    int i18 = Build.VERSION.SDK_INT;
                    if (i18 >= 24) {
                        org.telegram.messenger.t0.d();
                        fromFile = FileProvider.d(activity, "org.telegram.messenger.beta.provider", file);
                    } else {
                        fromFile = Uri.fromFile(file);
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i18 >= 24) {
                        intent.addFlags(1);
                    }
                    intent.setType("message/rfc822");
                    intent.putExtra("android.intent.extra.EMAIL", "");
                    intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + org.telegram.messenger.gd.E0().z0().format(System.currentTimeMillis()));
                    intent.putExtra("android.intent.extra.STREAM", fromFile);
                    if (activity != null) {
                        try {
                            activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                            return;
                        } catch (Exception e13) {
                            org.telegram.messenger.a8.g(e13, true);
                            return;
                        }
                    }
                    return;
                } else if (activity != null) {
                    Toast.makeText(activity, org.telegram.messenger.gd.N0(2131751093, null), 0).show();
                    return;
                } else {
                    return;
                }
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) this.f54350c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                int[] iArr2 = (int[]) this.f54349b;
                if (!(((TLObject) this.f54351e) instanceof TLRPC.TL_boolTrue)) {
                    RectF rectF2 = ProfileActivity.Z6;
                    profileActivity.getClass();
                    org.telegram.ui.Components.kc.b0(profileActivity).g0(tL_error2, false);
                }
                if (profileActivity.f43758r4 == iArr2[0]) {
                    profileActivity.f43758r4 = 0;
                    return;
                }
                return;
            case 14:
                ProfileActivity.i0((ProfileActivity) this.f54350c, (TLRPC.TL_error) this.d, (TLObject) this.f54351e, (String) this.f54349b);
                return;
            case 15:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f54350c;
                String[] strArr = (String[]) this.d;
                String str8 = (String) this.f54349b;
                String str9 = (String) this.f54351e;
                RectF rectF3 = ProfileActivity.Z6;
                if (org.telegram.messenger.g0.E1(profileActivity2.getParentActivity())) {
                    org.telegram.ui.Components.a31.W0(profileActivity2.getParentActivity(), profileActivity2, strArr[0], str8, str9, new n00(profileActivity2, 2), null);
                    return;
                }
                return;
            case 16:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f54350c;
                TLObject tLObject4 = (TLObject) this.f54351e;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f54349b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                if (tLObject4 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity3.f43666e1 != 0) {
                        O02 = profileActivity3.getMessagesController().c2(Long.valueOf(profileActivity3.f43666e1));
                    } else {
                        O02 = profileActivity3.getMessagesController().O0(Long.valueOf(profileActivity3.f43674f1));
                    }
                    l00.a(profileActivity3.getParentActivity(), 0, tL_username.username, O02, (TL_fragment.TL_collectibleInfo) tLObject4, profileActivity3.A0);
                    return;
                }
                RectF rectF4 = ProfileActivity.Z6;
                org.telegram.ui.Components.kc.e0(tL_error3);
                return;
            case 17:
                TLObject tLObject5 = (TLObject) this.f54351e;
                org.telegram.messenger.i10 i10Var2 = (org.telegram.messenger.i10) this.d;
                TLRPC.Photo photo2 = (TLRPC.Photo) this.f54349b;
                ProfileActivity profileActivity4 = ((qv0) this.f54350c).f51546b;
                profileActivity4.f43733o0.f35416d1--;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject5;
                    profileActivity4.getMessagesController().f4(tL_photos_photo2.users, false);
                    TLRPC.User c23 = profileActivity4.getMessagesController().c2(Long.valueOf(i10Var2.f24656n));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList5 = profileActivity4.f43733o0.W0;
                        if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(photo2)) >= 0) {
                            arrayList5.set(indexOf, photo3);
                        }
                        if (c23 != null) {
                            c23.photo.photo_id = tL_photos_photo2.photo.f28516id;
                            i10Var2.w(c23);
                            i10Var2.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 18:
                TLObject tLObject6 = (TLObject) this.f54351e;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f54349b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                ProfileActivity profileActivity5 = ((cw0) this.f54350c).f46890c.f49218e;
                profileActivity5.h5(null);
                if (tLObject6 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity5.f43666e1 != 0) {
                        O03 = profileActivity5.getMessagesController().c2(Long.valueOf(profileActivity5.f43666e1));
                    } else {
                        O03 = profileActivity5.getMessagesController().O0(Long.valueOf(profileActivity5.f43674f1));
                    }
                    TLObject tLObject7 = O03;
                    if (profileActivity5.getParentActivity() != null) {
                        l00.a(profileActivity5.getParentActivity(), 0, tL_username2.username, tLObject7, (TL_fragment.TL_collectibleInfo) tLObject6, profileActivity5.A0);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.kc.e0(tL_error4);
                return;
            case 19:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f54350c;
                org.telegram.ui.ActionBar.t1 t1Var3 = (org.telegram.ui.ActionBar.t1) this.f54351e;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.f54349b;
                try {
                    t1Var3.dismiss();
                } catch (Exception e14) {
                    org.telegram.messenger.a8.g(e14, true);
                }
                if (tL_error5 == null) {
                    sessionsActivity.d.remove(tL_webAuthorization);
                    sessionsActivity.r0();
                    y21 y21Var = sessionsActivity.f43899a;
                    if (y21Var != null) {
                        y21Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.f54350c;
                org.telegram.ui.ActionBar.t1 t1Var4 = (org.telegram.ui.ActionBar.t1) this.f54351e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.f54349b;
                try {
                    t1Var4.dismiss();
                } catch (Exception e15) {
                    org.telegram.messenger.a8.g(e15, true);
                }
                if (tL_error6 == null) {
                    sessionsActivity2.d.remove(tL_authorization);
                    sessionsActivity2.f43902e.remove(tL_authorization);
                    sessionsActivity2.r0();
                    y21 y21Var2 = sessionsActivity2.f43899a;
                    if (y21Var2 != null) {
                        y21Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                x21 x21Var = (x21) this.f54350c;
                x21Var.f53827a = (TLObject) this.f54351e;
                x21Var.f53828b = (TLRPC.TL_error) this.d;
                ((k9) this.f54349b).run();
                return;
            case 22:
                n31.d0((n31) this.f54350c, (TLRPC.TL_error) this.d, (TLObject) this.f54351e, (String) this.f54349b);
                return;
            case 23:
                m41 m41Var = (m41) this.f54350c;
                mg.b bVar2 = (mg.b) this.d;
                String str10 = (String) this.f54349b;
                a51 a51Var2 = (a51) this.f54351e;
                b51 b51Var = m41Var.f49954x;
                if (bVar2 != null) {
                    b51Var.V.l(str10, bVar2);
                }
                if (bVar2 != null && !a51Var2.f45592b && (i12 = a51Var2.f45591a) >= 0) {
                    View m11 = b51Var.U.m(i12);
                    if (m11 instanceof m41) {
                        m41Var.f49590r.f50211e = bVar2;
                        m41 m41Var2 = (m41) m11;
                        m41Var2.f49585b.f19917u0.d(false, false);
                        m41Var2.g(false);
                    }
                }
                b51.c0(b51Var);
                return;
            case 24:
                n41 n41Var = (n41) this.f54350c;
                n41Var.f50216k = false;
                n41Var.d = (mg.b) this.d;
                n41Var.f50213g = (String) this.f54349b;
                l41 l41Var2 = (l41) ((org.telegram.messenger.o10) this.f54351e).run();
                if (l41Var2 != null) {
                    l41Var2.e(n41Var, true);
                    return;
                }
                return;
            case 25:
                TLObject tLObject8 = (TLObject) this.f54351e;
                String str11 = (String) this.f54349b;
                org.telegram.ui.ActionBar.t1 t1Var5 = (org.telegram.ui.ActionBar.t1) this.d;
                u81 u81Var = ((q81) this.f54350c).f51380a;
                if (tLObject8 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject8;
                    int i19 = 0;
                    while (i19 < updates.updates.size()) {
                        if (updates.updates.get(i19) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i19);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str11;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = u81Var.getMessagesController().B1(u81Var.f52583a);
                            tL_messageService.dialog_id = u81Var.f52583a;
                            tL_messageService.f28513id = tL_updateMessageID.f28750id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(new org.telegram.messenger.fj(u81.c0(u81Var), tL_messageService, false, false));
                            TLRPC.Chat O04 = u81Var.getMessagesController().O0(Long.valueOf(-u81Var.f52583a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.f28544id = tL_updateMessageID.f28750id;
                            long j3 = u81Var.f52584b;
                            if (j3 != 0) {
                                tL_forumTopic.icon_emoji_id = j3;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= i13;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str11;
                            tL_forumTopic.top_message = tL_messageService.f28513id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = u81Var.getMessagesController().B1(u81Var.getUserConfig().f24656n);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = u81Var.F;
                            bn bnVar = u81Var.E;
                            if (bnVar != null) {
                                bnVar.ob();
                                bnVar.sb();
                                bnVar.Vb(arrayList6, O04, tL_messageService.f28513id, 1, 1, tL_forumTopic);
                                bnVar.f46146c = true;
                                bnVar.L8();
                                bnVar.wd(true);
                                bnVar.f46315p1.n(true);
                                bnVar.Cd();
                                bnVar.f46202g2.setCurrentTopic(bnVar.b());
                                bnVar.zd(true);
                                bnVar.Pc(true);
                                bnVar.D9(true);
                                bnVar.N6(true, true);
                                bnVar.hb();
                                u81Var.getMessagesController().f25864t7.q(u81Var.f52583a, tL_forumTopic, true);
                                u81Var.finishFragment();
                            } else {
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", -u81Var.f52583a);
                                bundle2.putInt("message_id", 1);
                                bundle2.putInt("unread_count", 0);
                                bundle2.putBoolean("historyPreloaded", false);
                                bn bnVar2 = new bn(bundle2);
                                bnVar2.Vb(arrayList6, O04, tL_messageService.f28513id, 1, 1, tL_forumTopic);
                                bnVar2.f46146c = true;
                                u81Var.getMessagesController().f25864t7.q(u81Var.f52583a, tL_forumTopic, true);
                                u81Var.presentFragment(bnVar2);
                            }
                        }
                        i19++;
                        i13 = 2;
                    }
                }
                t1Var5.dismiss();
                return;
            case 26:
                TwoStepVerificationActivity.j0((TwoStepVerificationActivity) this.f54350c, (byte[]) this.d, (TLObject) this.f54351e, (byte[]) this.f54349b);
                return;
            case 27:
                za1 za1Var = (za1) this.f54350c;
                String str12 = (String) this.f54349b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                if (((TLObject) this.f54351e) instanceof TLRPC.TL_boolTrue) {
                    za1Var.z0(new iy0(23, za1Var, str12));
                    return;
                } else if (tL_error7 != null && !tL_error7.text.startsWith("CODE_INVALID")) {
                    if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error7.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        za1Var.L0(org.telegram.messenger.gd.N0(2131743684, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, G));
                        return;
                    }
                    za1Var.L0(org.telegram.messenger.gd.N0(2131743684, null), tL_error7.text);
                    return;
                } else {
                    za1Var.D0();
                    return;
                }
            case 28:
                org.telegram.ui.web.s0 s0Var = (org.telegram.ui.web.s0) this.f54350c;
                fi.f7 f7Var = (fi.f7) this.d;
                String str13 = (String) this.f54349b;
                JSONObject jSONObject = (JSONObject) this.f54351e;
                if (s0Var.f53533c && ((v0Var = s0Var.R) == null || !v0Var.o(f7Var))) {
                    org.telegram.messenger.a8.b("notifyEvent " + str13 + " dropped after document change");
                    return;
                }
                s0Var.d("window.Telegram.WebView.receiveEvent('" + str13 + "', " + jSONObject + ");");
                return;
            default:
                ab.c0 c0Var = (ab.c0) this.f54350c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                p4.h hVar = (p4.h) this.f54351e;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f54349b;
                synchronized (c0Var.f908b) {
                    try {
                        if (!atomicBoolean.get()) {
                            c0Var.k(hVar);
                        } else {
                            atomicBoolean2.set(true);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public yd0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.f54348a = i7;
        this.f54350c = obj;
        this.f54351e = obj2;
        this.d = obj3;
        this.f54349b = obj4;
    }

    public yd0(Object obj, Object obj2, String str, Object obj3, int i7) {
        this.f54348a = i7;
        this.f54350c = obj;
        this.d = obj2;
        this.f54349b = str;
        this.f54351e = obj3;
    }

    public yd0(Object obj, TLObject tLObject, Object obj2, Object obj3, int i7) {
        this.f54348a = i7;
        this.f54350c = obj;
        this.f54351e = tLObject;
        this.f54349b = obj2;
        this.d = obj3;
    }
}
