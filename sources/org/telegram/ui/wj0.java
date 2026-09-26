package org.telegram.ui;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.Build;
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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;
public final class wj0 extends org.telegram.ui.ActionBar.e3 implements AdapterView.OnItemSelectedListener {
    public static final int f39377d0 = 0;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public String I;
    public boolean J;
    public String K;
    public String L;
    public final org.telegram.ui.ActionBar.m2 M;
    public final int N;
    public final uj0 O;
    public final View P;
    public final uj0 Q;
    public final ImageView R;
    public final org.telegram.ui.Components.op S;
    public final TextView T;
    public final LinearLayout U;
    public int V;
    public final tj0 W;
    public final TextView X;
    public final RadialProgressView Y;
    public final FrameLayout Z;
    public final TextView f39378a0;
    public final LinearLayout f39379b;
    public String f39380b0;
    public final org.telegram.ui.Components.uq f39381c;
    public int f39382c0;
    public final org.telegram.ui.Components.id0 d;
    public final org.telegram.ui.Components.id0 e;
    public final FrameLayout f39383f;
    public final View h;
    public final ci.d f39384n;
    public final org.telegram.ui.Components.id0 f39385r;
    public final org.telegram.ui.Components.jd0 f39386s;
    public final org.telegram.ui.Components.n90 v;
    public final ArrayList f39387w;
    public final HashMap f39388x;
    public final HashMap f39389y;

    public wj0(android.content.Context r25, org.telegram.ui.ActionBar.m2 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wj0.<init>(android.content.Context, org.telegram.ui.ActionBar.m2):void");
    }

    public static void m(wj0 wj0Var, TLObject tLObject, bt btVar) {
        TLRPC.User user;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(wj0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(wj0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(wj0Var.currentAccount).getUser(Long.valueOf(peerDialogId));
                btVar.run(user);
            }
        }
        user = null;
        btVar.run(user);
    }

    public static void n(wj0 wj0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        org.telegram.ui.ActionBar.m2 m2Var = wj0Var.M;
        wj0Var.H = false;
        if (tL_contacts_importedContacts != null) {
            if (!tL_contacts_importedContacts.users.isEmpty()) {
                MessagesController.getInstance(wj0Var.currentAccount).putUsers(tL_contacts_importedContacts.users, false);
                MessagesController.getInstance(wj0Var.currentAccount).openChatOrProfileWith(tL_contacts_importedContacts.users.get(0), null, wj0Var.M, 1, false);
                wj0Var.dismiss();
                return;
            } else if (m2Var.getParentActivity() == null) {
                return;
            } else {
                AndroidUtilities.updateViewVisibilityAnimated(wj0Var.X, true, 0.5f, true);
                AndroidUtilities.updateViewVisibilityAnimated(wj0Var.Y, false, 0.5f, true);
                org.telegram.ui.Components.e5.v(m2Var, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                return;
            }
        }
        AndroidUtilities.updateViewVisibilityAnimated(wj0Var.X, true, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(wj0Var.Y, false, 0.5f, true);
        org.telegram.ui.Components.e5.f0(wj0Var.currentAccount, tL_error, m2Var, tL_contacts_importContacts, new Object[0]);
    }

    public static void q(wj0 wj0Var) {
        String replaceAll = (wj0Var.O.getText().toString() + wj0Var.Q.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z10 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) wj0Var.f39388x.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) wj0Var.f39389y.get(substring);
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
            if (!TextUtils.isEmpty(wj0Var.f39380b0)) {
                wj0Var.f39380b0 = null;
                wj0Var.y(null);
            }
        } else if (!TextUtils.equals(wj0Var.f39380b0, replaceAll)) {
            wj0Var.f39380b0 = replaceAll;
            wj0Var.y(replaceAll);
        }
    }

    public static String s(LaunchActivity launchActivity, TLRPC.User user, String str) {
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (!str.startsWith("+")) {
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                String str2 = user.phone;
                for (int i10 = 4; i10 >= 1; i10--) {
                    String substring = str2.substring(0, i10);
                    if (((String) hashMap.get(substring)) != null) {
                        return a4.a.q("+", substring, str);
                    }
                }
            } else {
                return "+".concat(str);
            }
        }
        return str;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        AndroidUtilities.runOnUIThread(new oj0(this, 0), 50L);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 8388608, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.f19186k6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.f19204l6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39381c, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.D7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39381c, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.E7));
        return arrayList;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j3) {
        if (this.G) {
            this.G = false;
            return;
        }
        this.E = true;
        this.O.setText(((qt) this.f39387w.get(i10)).f36983c);
        this.E = false;
    }

    public final void r() {
        String str;
        this.H = true;
        AndroidUtilities.updateViewVisibilityAnimated(this.X, false, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.Y, true, 0.5f, true);
        String str2 = "+" + this.O.getText().toString() + this.Q.getText().toString();
        String obj = this.d.getEditText().getText().toString();
        String obj2 = this.e.getEditText().getText().toString();
        if (this.f39385r.getVisibility() == 0) {
            str = this.f39385r.getEditText().getText().toString();
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_importContacts, new aa(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.N);
        if (this.S.f27167a.f22194q) {
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
            } catch (OperationApplicationException | RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        this.d.getEditText().requestFocus();
        this.d.getEditText().setSelection(this.d.getEditText().length());
        AndroidUtilities.runOnUIThread(new oj0(this, 1), 50L);
    }

    public final void t(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.W.animate();
            org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f28030f;
            animate.setInterpolator(rrVar).translationY(AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.f39378a0.animate().setInterpolator(rrVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.O.animate().setInterpolator(rrVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            return;
        }
        this.W.animate().setInterpolator(AndroidUtilities.overshootInterpolator).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.f39378a0.animate();
        org.telegram.ui.Components.rr rrVar2 = org.telegram.ui.Components.rr.f28030f;
        animate2.setInterpolator(rrVar2).translationX(0.0f).setDuration(150L);
        this.O.animate().setInterpolator(rrVar2).translationX(0.0f).setDuration(150L);
        this.W.setText(charSequence);
    }

    public final void u(java.lang.String r12, org.telegram.ui.qt r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wj0.u(java.lang.String, org.telegram.ui.qt):void");
    }

    public final void v(String str, boolean z10) {
        String country;
        this.I = str;
        this.J = z10;
        if (!TextUtils.isEmpty(str)) {
            TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            if (this.I.startsWith("+")) {
                this.O.setText(this.I.substring(1));
            } else if (!this.J && currentUser != null && !TextUtils.isEmpty(currentUser.phone)) {
                String str2 = currentUser.phone;
                int i10 = 4;
                while (true) {
                    if (i10 >= 1) {
                        List list = (List) this.f39388x.get(str2.substring(0, i10));
                        if (list != null && list.size() > 0) {
                            String str3 = ((qt) list.get(0)).f36983c;
                            this.O.setText(str3);
                            if (str3.endsWith("0") && this.I.startsWith("0")) {
                                this.I = this.I.substring(1);
                            }
                        } else {
                            i10--;
                        }
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        Context context = ApplicationLoader.applicationContext;
                        if (context != null) {
                            country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                        } else {
                            country = Locale.getDefault().getCountry();
                        }
                        this.O.setText(country);
                        if (country.endsWith("0") && this.I.startsWith("0")) {
                            this.I = this.I.substring(1);
                        }
                    }
                }
                this.Q.setText(this.I);
            } else {
                this.O.setText(this.I);
            }
            this.I = null;
        }
    }

    public final void w(boolean z10) {
        float f7;
        ViewPropertyAnimator animate = this.U.animate();
        float f10 = 0.0f;
        if (z10) {
            f7 = -AndroidUtilities.dp(21.33f);
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator translationY = animate.translationY(f7);
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
        org.telegram.messenger.ok.s(translationY, rrVar, 420L);
        ViewPropertyAnimator animate2 = this.f39383f.animate();
        if (z10) {
            f10 = -AndroidUtilities.dp(10.665f);
        }
        animate2.translationY(f10).setInterpolator(rrVar).setDuration(420L).start();
    }

    public final void x(boolean z10) {
        int i10;
        float f7;
        int i11;
        float f10;
        float f11;
        float f12;
        boolean z11 = this.S.f27167a.f22194q;
        final boolean z12 = !z11;
        float f13 = 0.0f;
        int i12 = 0;
        if (z10) {
            this.f39384n.setVisibility(0);
            ViewPropertyAnimator animate = this.f39384n.animate();
            if (!z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
            alpha.setInterpolator(rrVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final wj0 f37368b;

                {
                    this.f37368b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            wj0 wj0Var = this.f37368b;
                            if (!z13) {
                                wj0Var.f39384n.setVisibility(4);
                                return;
                            } else {
                                wj0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            wj0 wj0Var2 = this.f37368b;
                            if (!z14) {
                                wj0Var2.h.setVisibility(4);
                                return;
                            } else {
                                wj0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            wj0 wj0Var3 = this.f37368b;
                            if (z15) {
                                wj0Var3.f39385r.setVisibility(4);
                                return;
                            } else {
                                wj0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.h.setVisibility(0);
            ViewPropertyAnimator animate2 = this.h.animate();
            if (!z11) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            animate2.alpha(f12).setInterpolator(rrVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final wj0 f37368b;

                {
                    this.f37368b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            wj0 wj0Var = this.f37368b;
                            if (!z13) {
                                wj0Var.f39384n.setVisibility(4);
                                return;
                            } else {
                                wj0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            wj0 wj0Var2 = this.f37368b;
                            if (!z14) {
                                wj0Var2.h.setVisibility(4);
                                return;
                            } else {
                                wj0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            wj0 wj0Var3 = this.f37368b;
                            if (z15) {
                                wj0Var3.f39385r.setVisibility(4);
                                return;
                            } else {
                                wj0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.f39385r.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f39385r.animate();
            if (z11) {
                f13 = 1.0f;
            }
            animate3.alpha(f13).setInterpolator(rrVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final wj0 f37368b;

                {
                    this.f37368b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            wj0 wj0Var = this.f37368b;
                            if (!z13) {
                                wj0Var.f39384n.setVisibility(4);
                                return;
                            } else {
                                wj0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            wj0 wj0Var2 = this.f37368b;
                            if (!z14) {
                                wj0Var2.h.setVisibility(4);
                                return;
                            } else {
                                wj0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            wj0 wj0Var3 = this.f37368b;
                            if (z15) {
                                wj0Var3.f39385r.setVisibility(4);
                                return;
                            } else {
                                wj0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            return;
        }
        this.f39384n.animate().cancel();
        if (!z11) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f39384n.setVisibility(i10);
        if (!z11) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f39384n.setAlpha(f7);
        this.h.animate().cancel();
        if (!z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.h.setVisibility(i11);
        if (!z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.h.setAlpha(f10);
        this.f39385r.animate().cancel();
        if (!z11) {
            i12 = 4;
        }
        this.f39385r.setVisibility(i12);
        if (z11) {
            f13 = 1.0f;
        }
        this.f39385r.setAlpha(f13);
    }

    public final void y(String str) {
        if (this.f39382c0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f39382c0, true);
            this.f39382c0 = -1;
        }
        if (TextUtils.isEmpty(str)) {
            org.telegram.messenger.ok.s(this.R.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.rr.h, 420L);
            this.v.setText("");
            w(true);
            return;
        }
        org.telegram.messenger.ok.s(this.R.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.rr.h, 420L);
        this.R.setImageDrawable(new org.telegram.ui.Components.up(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), getThemedColor(org.telegram.ui.ActionBar.h6.f19222m5)));
        this.v.setText("");
        w(true);
        bt btVar = new bt(8, this, str);
        TLRPC.TL_contact tL_contact = ContactsController.getInstance(this.currentAccount).contactsByPhone.get(gf.b.d(str, false));
        if (tL_contact != null) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                btVar.run(user);
                return;
            } else {
                MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new jf0((Object) this, (Object) tL_contact, (Object) btVar, 6));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = gf.b.d(str, false);
        this.f39382c0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolvePhone, new vb0(6, this, btVar));
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
