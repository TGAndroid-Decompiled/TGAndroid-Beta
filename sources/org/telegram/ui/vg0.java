package org.telegram.ui;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;
public final class vg0 extends org.telegram.ui.ActionBar.t2 implements AdapterView.OnItemSelectedListener {
    public static final int W1 = 0;
    public boolean A1;
    public String B1;
    public String C1;
    public final org.telegram.ui.ActionBar.d2 D1;
    public final int E1;
    public final ug0 F1;
    public final View G1;
    public final ug0 H1;
    public final ImageView I1;
    public final org.telegram.ui.Components.wo J1;
    public final TextView K1;
    public final LinearLayout L1;
    public int M1;
    public final org.telegram.ui.ActionBar.k2 N1;
    public final TextView O1;
    public final RadialProgressView P1;
    public final FrameLayout Q1;
    public final TextView R1;
    public String S1;
    public int T1;
    public int U1;
    public boolean V1;
    public final LinearLayout f50512j1;
    public final org.telegram.ui.Components.fb0 k1;
    public final org.telegram.ui.Components.fb0 f50513l1;
    public final FrameLayout m1;
    public final View f50514n1;
    public final gi.d f50515o1;
    public final org.telegram.ui.Components.fb0 f50516p1;
    public final org.telegram.ui.Components.gb0 f50517q1;
    public final org.telegram.ui.Components.s70 f50518r1;
    public final ArrayList f50519s1;
    public final HashMap f50520t1;
    public final HashMap f50521u1;
    public boolean f50522v1;
    public boolean f50523w1;
    public boolean f50524x1;
    public boolean f50525y1;
    public String f50526z1;

    public vg0(android.content.Context r25, org.telegram.ui.ActionBar.d2 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vg0.<init>(android.content.Context, org.telegram.ui.ActionBar.d2):void");
    }

    public static void I0(vg0 vg0Var) {
        String replaceAll = (vg0Var.F1.getText().toString() + vg0Var.H1.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z10 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) vg0Var.f50520t1.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) vg0Var.f50521u1.get(substring);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (replaceAll.length() - min >= ((String) it.next()).replace(" ", "").length()) {
                            z10 = true;
                            break;
                        }
                    }
                }
            }
            if (z10) {
                break;
            }
        }
        if (!z10) {
            if (!TextUtils.isEmpty(vg0Var.S1)) {
                vg0Var.S1 = null;
                vg0Var.Q0(null);
            }
        } else if (!TextUtils.equals(vg0Var.S1, replaceAll)) {
            vg0Var.S1 = replaceAll;
            vg0Var.Q0(replaceAll);
        }
    }

    public static String K0(LaunchActivity launchActivity, TLRPC.User user, String str) {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(launchActivity.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                hashMap.put(split[0], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (!str.startsWith("+")) {
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                String str2 = user.phone;
                for (int i3 = 4; i3 >= 1; i3--) {
                    String substring = str2.substring(0, i3);
                    if (((String) hashMap.get(substring)) != null) {
                        return a1.g.q("+", substring, str);
                    }
                }
            } else {
                return "+".concat(str);
            }
        }
        return str;
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28026l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
    }

    public final void J0() {
        String str;
        this.f50525y1 = true;
        org.telegram.messenger.g0.Z3(this.O1, false, 0.5f, true, true);
        org.telegram.messenger.g0.Z3(this.P1, true, 0.5f, true, true);
        String str2 = "+" + this.F1.getText().toString() + this.H1.getText().toString();
        String obj = this.k1.getEditText().getText().toString();
        String obj2 = this.f50513l1.getEditText().getText().toString();
        if (this.f50516p1.getVisibility() == 0) {
            str = this.f50516p1.getEditText().getText().toString();
        } else {
            str = "";
        }
        TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
        TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
        tL_inputPhoneContact.first_name = obj;
        tL_inputPhoneContact.last_name = obj2;
        tL_inputPhoneContact.phone = str2;
        if (!TextUtils.isEmpty(str)) {
            tL_inputPhoneContact.flags = 1 | tL_inputPhoneContact.flags;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_inputPhoneContact.note = tL_textWithEntities;
            tL_textWithEntities.text = str;
        }
        tL_contacts_importContacts.contacts.add(tL_inputPhoneContact);
        ConnectionsManager.getInstance(this.f28583a).bindRequestToGuid(ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_contacts_importContacts, new y9(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.E1);
        if (this.J1.f40035a.f31334q) {
            Context context = getContext();
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
            newInsert.withValue("account_type", null);
            newInsert.withValue("account_name", null);
            arrayList.add(newInsert.build());
            Uri uri = ContactsContract.Data.CONTENT_URI;
            ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name");
            if (!TextUtils.isEmpty(obj)) {
                withValue = withValue.withValue("data2", obj);
            }
            if (!TextUtils.isEmpty(obj2)) {
                withValue = withValue.withValue("data2", obj2);
            }
            arrayList.add(withValue.build());
            if (str2 != null && !str2.isEmpty()) {
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str2).withValue("data2", 2).build());
            }
            try {
                context.getContentResolver().applyBatch("com.android.contacts", arrayList);
            } catch (OperationApplicationException | RemoteException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void L0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.N1.animate();
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40452f;
            animate.setInterpolator(xqVar).translationY(org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            this.R1.animate().setInterpolator(xqVar).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            this.F1.animate().setInterpolator(xqVar).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            return;
        }
        this.N1.animate().setInterpolator(org.telegram.messenger.g0.H).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.R1.animate();
        org.telegram.ui.Components.xq xqVar2 = org.telegram.ui.Components.xq.f40452f;
        animate2.setInterpolator(xqVar2).translationX(0.0f).setDuration(150L);
        this.F1.animate().setInterpolator(xqVar2).translationX(0.0f).setDuration(150L);
        this.N1.setText(charSequence);
    }

    public final void M0(java.lang.String r12, org.telegram.ui.ks r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vg0.M0(java.lang.String, org.telegram.ui.ks):void");
    }

    public final void N0(String str, boolean z10) {
        String country;
        this.f50526z1 = str;
        this.A1 = z10;
        if (!TextUtils.isEmpty(str)) {
            TLRPC.User f10 = org.telegram.messenger.h10.i(this.f28583a).f();
            if (this.f50526z1.startsWith("+")) {
                this.F1.setText(this.f50526z1.substring(1));
            } else if (!this.A1 && f10 != null && !TextUtils.isEmpty(f10.phone)) {
                String str2 = f10.phone;
                int i3 = 4;
                while (true) {
                    if (i3 >= 1) {
                        List list = (List) this.f50520t1.get(str2.substring(0, i3));
                        if (list != null && list.size() > 0) {
                            String str3 = ((ks) list.get(0)).f47006c;
                            this.F1.setText(str3);
                            if (str3.endsWith("0") && this.f50526z1.startsWith("0")) {
                                this.f50526z1 = this.f50526z1.substring(1);
                            }
                        } else {
                            i3--;
                        }
                    } else {
                        Context context = org.telegram.messenger.t0.f25457b;
                        if (context != null) {
                            country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                        } else {
                            country = Locale.getDefault().getCountry();
                        }
                        this.F1.setText(country);
                        if (country.endsWith("0") && this.f50526z1.startsWith("0")) {
                            this.f50526z1 = this.f50526z1.substring(1);
                        }
                    }
                }
                this.H1.setText(this.f50526z1);
            } else {
                this.F1.setText(this.f50526z1);
            }
            this.f50526z1 = null;
        }
    }

    public final void O0(boolean z10) {
        float f10;
        ViewPropertyAnimator animate = this.L1.animate();
        float f11 = 0.0f;
        if (z10) {
            f10 = -org.telegram.messenger.g0.L(21.33f);
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator translationY = animate.translationY(f10);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        org.telegram.messenger.camera.q.l(translationY, xqVar, 420L);
        ViewPropertyAnimator animate2 = this.m1.animate();
        if (z10) {
            f11 = -org.telegram.messenger.g0.L(10.665f);
        }
        animate2.translationY(f11).setInterpolator(xqVar).setDuration(420L).start();
    }

    public final void P0(boolean z10) {
        int i3;
        float f10;
        int i10;
        float f11;
        float f12;
        float f13;
        boolean z11 = this.J1.f40035a.f31334q;
        final boolean z12 = !z11;
        float f14 = 0.0f;
        int i11 = 0;
        if (z10) {
            this.f50515o1.setVisibility(0);
            ViewPropertyAnimator animate = this.f50515o1.animate();
            if (!z11) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
            alpha.setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final vg0 f49224b;

                {
                    this.f49224b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            vg0 vg0Var = this.f49224b;
                            if (!z13) {
                                vg0Var.f50515o1.setVisibility(4);
                                return;
                            } else {
                                vg0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            vg0 vg0Var2 = this.f49224b;
                            if (!z14) {
                                vg0Var2.f50514n1.setVisibility(4);
                                return;
                            } else {
                                vg0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            vg0 vg0Var3 = this.f49224b;
                            if (z15) {
                                vg0Var3.f50516p1.setVisibility(4);
                                return;
                            } else {
                                vg0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.f50514n1.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f50514n1.animate();
            if (!z11) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            animate2.alpha(f13).setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final vg0 f49224b;

                {
                    this.f49224b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            vg0 vg0Var = this.f49224b;
                            if (!z13) {
                                vg0Var.f50515o1.setVisibility(4);
                                return;
                            } else {
                                vg0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            vg0 vg0Var2 = this.f49224b;
                            if (!z14) {
                                vg0Var2.f50514n1.setVisibility(4);
                                return;
                            } else {
                                vg0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            vg0 vg0Var3 = this.f49224b;
                            if (z15) {
                                vg0Var3.f50516p1.setVisibility(4);
                                return;
                            } else {
                                vg0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.f50516p1.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f50516p1.animate();
            if (z11) {
                f14 = 1.0f;
            }
            animate3.alpha(f14).setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final vg0 f49224b;

                {
                    this.f49224b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            vg0 vg0Var = this.f49224b;
                            if (!z13) {
                                vg0Var.f50515o1.setVisibility(4);
                                return;
                            } else {
                                vg0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            vg0 vg0Var2 = this.f49224b;
                            if (!z14) {
                                vg0Var2.f50514n1.setVisibility(4);
                                return;
                            } else {
                                vg0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            vg0 vg0Var3 = this.f49224b;
                            if (z15) {
                                vg0Var3.f50516p1.setVisibility(4);
                                return;
                            } else {
                                vg0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            return;
        }
        this.f50515o1.animate().cancel();
        if (!z11) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        this.f50515o1.setVisibility(i3);
        if (!z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f50515o1.setAlpha(f10);
        this.f50514n1.animate().cancel();
        if (!z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f50514n1.setVisibility(i10);
        if (!z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        this.f50514n1.setAlpha(f11);
        this.f50516p1.animate().cancel();
        if (!z11) {
            i11 = 4;
        }
        this.f50516p1.setVisibility(i11);
        if (z11) {
            f14 = 1.0f;
        }
        this.f50516p1.setAlpha(f14);
    }

    public final void Q0(String str) {
        if (this.T1 >= 0) {
            ConnectionsManager.getInstance(this.f28583a).cancelRequest(this.T1, true);
            this.T1 = -1;
        }
        if (TextUtils.isEmpty(str)) {
            org.telegram.messenger.camera.q.l(this.I1.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.xq.h, 420L);
            this.f50518r1.setText("");
            O0(true);
            return;
        }
        org.telegram.messenger.camera.q.l(this.I1.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.xq.h, 420L);
        this.I1.setImageDrawable(new org.telegram.ui.Components.cp(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28042m5, this.J0)));
        this.f50518r1.setText("");
        O0(true);
        org.telegram.ui.Components.ei eiVar = new org.telegram.ui.Components.ei(19, this, str);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) org.telegram.messenger.g5.r(this.f28583a).f22659l0.get(mf.b.d(str, false));
        if (tL_contact != null) {
            TLRPC.User a22 = org.telegram.messenger.hp.s1(this.f28583a).a2(Long.valueOf(tL_contact.user_id));
            if (a22 != null) {
                eiVar.a(a22);
                return;
            } else {
                org.telegram.messenger.qr.a0(this.f28583a).f24934a.c(new hc0(this, tL_contact, eiVar, 9));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = mf.b.d(str, false);
        this.T1 = ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_contacts_resolvePhone, new xy(15, this, eiVar));
    }

    @Override
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.k1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50513l1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        int i10 = org.telegram.ui.ActionBar.k6.f28007k6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.F1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.f28026l6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.F1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.H1, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.H1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.H1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        return arrayList;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.g0.i3(new og0(this, 0), 50L);
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j10) {
        if (this.f50524x1) {
            this.f50524x1 = false;
            return;
        }
        this.f50522v1 = true;
        this.F1.setText(((ks) this.f50519s1.get(i3)).f47006c);
        this.f50522v1 = false;
    }

    @Override
    public final void s0() {
        int themedColor;
        super.s0();
        try {
            RadialProgressView radialProgressView = this.P1;
            org.telegram.ui.ActionBar.d2 d2Var = this.D1;
            if (radialProgressView != null && d2Var != null) {
                radialProgressView.setProgressColor(d2Var.getThemedColor(org.telegram.ui.ActionBar.k6.Gi));
            }
            if (this.Q1 != null && d2Var != null && ((themedColor = d2Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ci)) != this.U1 || this.V1 != org.telegram.ui.ActionBar.k6.I.q())) {
                this.V1 = org.telegram.ui.ActionBar.k6.I.q();
                this.U1 = themedColor;
                org.telegram.ui.ActionBar.k6.H1(this.Q1.getBackground(), themedColor, false);
                org.telegram.ui.ActionBar.k6.H1(this.Q1.getBackground(), org.telegram.ui.ActionBar.y5.b(themedColor), true);
                this.Q1.invalidate();
            }
            ImageView imageView = this.I1;
            if (imageView != null && (imageView.getDrawable() instanceof org.telegram.ui.Components.cp)) {
                ((org.telegram.ui.Components.cp) this.I1.getDrawable()).b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28042m5, this.J0));
                this.I1.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        this.k1.getEditText().requestFocus();
        this.k1.getEditText().setSelection(this.k1.getEditText().length());
        org.telegram.messenger.g0.i3(new og0(this, 1), 50L);
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
