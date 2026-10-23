package org.telegram.ui;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;
public final class rj0 extends org.telegram.ui.ActionBar.h3 implements AdapterView.OnItemSelectedListener {
    public static final int f41158e0 = 0;
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public boolean I;
    public String J;
    public String K;
    public final org.telegram.ui.ActionBar.o2 L;
    public final int M;
    public final pj0 N;
    public final View O;
    public final pj0 P;
    public final ImageView Q;
    public final org.telegram.ui.Components.xp R;
    public final TextView S;
    public final LinearLayout T;
    public int U;
    public final nj0 V;
    public final TextView W;
    public final RadialProgressView X;
    public final FrameLayout Y;
    public final TextView Z;
    public String f41159a0;
    public final LinearLayout f41160b;
    public int f41161b0;
    public final org.telegram.ui.Components.td0 f41162c;
    public int f41163c0;
    public final org.telegram.ui.Components.td0 d;
    public boolean f41164d0;
    public final FrameLayout e;
    public final View f41165f;
    public final ei.d h;
    public final org.telegram.ui.Components.td0 f41166n;
    public final org.telegram.ui.Components.vd0 f41167r;
    public final org.telegram.ui.Components.y90 f41168s;
    public final ArrayList v;
    public final HashMap f41169w;
    public final HashMap f41170x;
    public boolean f41171y;

    public rj0(android.content.Context r25, org.telegram.ui.ActionBar.o2 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rj0.<init>(android.content.Context, org.telegram.ui.ActionBar.o2):void");
    }

    public static void m(rj0 rj0Var, TLObject tLObject, org.telegram.ui.Components.qy qyVar) {
        TLRPC.User user;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(rj0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(rj0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(rj0Var.currentAccount).getUser(Long.valueOf(peerDialogId));
                qyVar.run(user);
            }
        }
        user = null;
        qyVar.run(user);
    }

    public static void n(rj0 rj0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        org.telegram.ui.ActionBar.o2 o2Var = rj0Var.L;
        rj0Var.G = false;
        if (tL_contacts_importedContacts != null) {
            if (!tL_contacts_importedContacts.users.isEmpty()) {
                MessagesController.getInstance(rj0Var.currentAccount).putUsers(tL_contacts_importedContacts.users, false);
                MessagesController.getInstance(rj0Var.currentAccount).openChatOrProfileWith(tL_contacts_importedContacts.users.get(0), null, rj0Var.L, 1, false);
                rj0Var.dismiss();
                return;
            } else if (o2Var.getParentActivity() == null) {
                return;
            } else {
                AndroidUtilities.updateViewVisibilityAnimated(rj0Var.W, true, 0.5f, true);
                AndroidUtilities.updateViewVisibilityAnimated(rj0Var.X, false, 0.5f, true);
                org.telegram.ui.Components.f5.v(o2Var, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                return;
            }
        }
        AndroidUtilities.updateViewVisibilityAnimated(rj0Var.W, true, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(rj0Var.X, false, 0.5f, true);
        org.telegram.ui.Components.f5.f0(rj0Var.currentAccount, tL_error, o2Var, tL_contacts_importContacts, new Object[0]);
    }

    public static void p(rj0 rj0Var, String str, TLRPC.User user) {
        if (user == null) {
            rj0Var.Q.setImageDrawable(null);
            rj0Var.f41168s.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new bh0(2, rj0Var, str)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else {
            Drawable mutate = rj0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
            org.telegram.ui.ActionBar.r6.z(rj0Var.Q, mutate, org.telegram.ui.ActionBar.k6.f21516v6, rj0Var.resourcesProvider, PorterDuff.Mode.SRC_IN);
            rj0Var.Q.setImageDrawable(mutate);
            if (user.contact) {
                rj0Var.f41168s.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new bh0(3, rj0Var, user)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            } else {
                rj0Var.f41168s.setText("This phone number is on Telegram.");
            }
        }
        rj0Var.y(false);
    }

    public static void s(rj0 rj0Var) {
        String replaceAll = (rj0Var.N.getText().toString() + rj0Var.P.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z10 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) rj0Var.f41169w.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) rj0Var.f41170x.get(substring);
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
            if (!TextUtils.isEmpty(rj0Var.f41159a0)) {
                rj0Var.f41159a0 = null;
                rj0Var.A(null);
            }
        } else if (!TextUtils.equals(rj0Var.f41159a0, replaceAll)) {
            rj0Var.f41159a0 = replaceAll;
            rj0Var.A(replaceAll);
        }
    }

    public static String u(LaunchActivity launchActivity, TLRPC.User user, String str) {
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
                        return a1.g.p("+", substring, str);
                    }
                }
            } else {
                return "+".concat(str);
            }
        }
        return str;
    }

    public final void A(String str) {
        if (this.f41161b0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f41161b0, true);
            this.f41161b0 = -1;
        }
        if (TextUtils.isEmpty(str)) {
            org.telegram.messenger.sl.t(this.Q.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.bs.h, 420L);
            this.f41168s.setText("");
            y(true);
            return;
        }
        org.telegram.messenger.sl.t(this.Q.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.bs.h, 420L);
        this.Q.setImageDrawable(new org.telegram.ui.Components.eq(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), getThemedColor(org.telegram.ui.ActionBar.k6.f21345m5)));
        this.f41168s.setText("");
        y(true);
        org.telegram.ui.Components.qy qyVar = new org.telegram.ui.Components.qy(14, this, str);
        TLRPC.TL_contact tL_contact = ContactsController.getInstance(this.currentAccount).contactsByPhone.get(jf.b.d(str, false));
        if (tL_contact != null) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                qyVar.run(user);
                return;
            } else {
                MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new re0(this, tL_contact, qyVar, 8));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = jf.b.d(str, false);
        this.f41161b0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolvePhone, new a50(13, this, qyVar));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21327l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        AndroidUtilities.runOnUIThread(new jj0(this, 0), 50L);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41162c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.f21310k6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.N, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.f21327l6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.N, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.P, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.P, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.P, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        return arrayList;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        if (this.F) {
            this.F = false;
            return;
        }
        this.f41171y = true;
        this.N.setText(((lt) this.v.get(i10)).f39324c);
        this.f41171y = false;
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            RadialProgressView radialProgressView = this.X;
            org.telegram.ui.ActionBar.o2 o2Var = this.L;
            if (radialProgressView != null && o2Var != null) {
                radialProgressView.setProgressColor(o2Var.getThemedColor(org.telegram.ui.ActionBar.k6.Sh));
            }
            if (this.Y != null && o2Var != null && ((themedColor = o2Var.getThemedColor(org.telegram.ui.ActionBar.k6.Oh)) != this.f41163c0 || this.f41164d0 != org.telegram.ui.ActionBar.k6.I.q())) {
                this.f41164d0 = org.telegram.ui.ActionBar.k6.I.q();
                this.f41163c0 = themedColor;
                org.telegram.ui.ActionBar.k6.E1(this.Y.getBackground(), themedColor, false);
                org.telegram.ui.ActionBar.k6.E1(this.Y.getBackground(), org.telegram.ui.ActionBar.a6.b(themedColor), true);
                this.Y.invalidate();
            }
            ImageView imageView = this.Q;
            if (imageView != null && (imageView.getDrawable() instanceof org.telegram.ui.Components.eq)) {
                ((org.telegram.ui.Components.eq) this.Q.getDrawable()).b(getThemedColor(org.telegram.ui.ActionBar.k6.f21345m5));
                this.Q.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void show() {
        super.show();
        this.f41162c.getEditText().requestFocus();
        this.f41162c.getEditText().setSelection(this.f41162c.getEditText().length());
        AndroidUtilities.runOnUIThread(new jj0(this, 1), 50L);
    }

    public final void t() {
        String str;
        this.G = true;
        AndroidUtilities.updateViewVisibilityAnimated(this.W, false, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.X, true, 0.5f, true);
        String str2 = "+" + this.N.getText().toString() + this.P.getText().toString();
        String obj = this.f41162c.getEditText().getText().toString();
        String obj2 = this.d.getEditText().getText().toString();
        if (this.f41166n.getVisibility() == 0) {
            str = this.f41166n.getEditText().getText().toString();
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_importContacts, new ca(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.M);
        if (this.R.f32618a.f24296q) {
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

    public final void v(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.V.animate();
            org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25133f;
            animate.setInterpolator(bsVar).translationY(AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.Z.animate().setInterpolator(bsVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.N.animate().setInterpolator(bsVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            return;
        }
        this.V.animate().setInterpolator(AndroidUtilities.overshootInterpolator).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.Z.animate();
        org.telegram.ui.Components.bs bsVar2 = org.telegram.ui.Components.bs.f25133f;
        animate2.setInterpolator(bsVar2).translationX(0.0f).setDuration(150L);
        this.N.animate().setInterpolator(bsVar2).translationX(0.0f).setDuration(150L);
        this.V.setText(charSequence);
    }

    public final void w(java.lang.String r12, org.telegram.ui.lt r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rj0.w(java.lang.String, org.telegram.ui.lt):void");
    }

    public final void x(String str, boolean z10) {
        String country;
        this.H = str;
        this.I = z10;
        if (!TextUtils.isEmpty(str)) {
            TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            if (this.H.startsWith("+")) {
                this.N.setText(this.H.substring(1));
            } else if (!this.I && currentUser != null && !TextUtils.isEmpty(currentUser.phone)) {
                String str2 = currentUser.phone;
                int i10 = 4;
                while (true) {
                    if (i10 >= 1) {
                        List list = (List) this.f41169w.get(str2.substring(0, i10));
                        if (list != null && list.size() > 0) {
                            String str3 = ((lt) list.get(0)).f39324c;
                            this.N.setText(str3);
                            if (str3.endsWith("0") && this.H.startsWith("0")) {
                                this.H = this.H.substring(1);
                            }
                        } else {
                            i10--;
                        }
                    } else {
                        Context context = ApplicationLoader.applicationContext;
                        if (context != null) {
                            country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                        } else {
                            country = Locale.getDefault().getCountry();
                        }
                        this.N.setText(country);
                        if (country.endsWith("0") && this.H.startsWith("0")) {
                            this.H = this.H.substring(1);
                        }
                    }
                }
                this.P.setText(this.H);
            } else {
                this.N.setText(this.H);
            }
            this.H = null;
        }
    }

    public final void y(boolean z10) {
        float f7;
        ViewPropertyAnimator animate = this.T.animate();
        float f10 = 0.0f;
        if (z10) {
            f7 = -AndroidUtilities.dp(21.33f);
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator translationY = animate.translationY(f7);
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        org.telegram.messenger.sl.t(translationY, bsVar, 420L);
        ViewPropertyAnimator animate2 = this.e.animate();
        if (z10) {
            f10 = -AndroidUtilities.dp(10.665f);
        }
        animate2.translationY(f10).setInterpolator(bsVar).setDuration(420L).start();
    }

    public final void z(boolean z10) {
        int i10;
        float f7;
        int i11;
        float f10;
        float f11;
        float f12;
        boolean z11 = this.R.f32618a.f24296q;
        final boolean z12 = !z11;
        float f13 = 0.0f;
        int i12 = 0;
        if (z10) {
            this.h.setVisibility(0);
            ViewPropertyAnimator animate = this.h.animate();
            if (!z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
            alpha.setInterpolator(bsVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final rj0 f39614b;

                {
                    this.f39614b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            rj0 rj0Var = this.f39614b;
                            if (!z13) {
                                rj0Var.h.setVisibility(4);
                                return;
                            } else {
                                rj0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            rj0 rj0Var2 = this.f39614b;
                            if (!z14) {
                                rj0Var2.f41165f.setVisibility(4);
                                return;
                            } else {
                                rj0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            rj0 rj0Var3 = this.f39614b;
                            if (z15) {
                                rj0Var3.f41166n.setVisibility(4);
                                return;
                            } else {
                                rj0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.f41165f.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f41165f.animate();
            if (!z11) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            animate2.alpha(f12).setInterpolator(bsVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final rj0 f39614b;

                {
                    this.f39614b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            rj0 rj0Var = this.f39614b;
                            if (!z13) {
                                rj0Var.h.setVisibility(4);
                                return;
                            } else {
                                rj0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            rj0 rj0Var2 = this.f39614b;
                            if (!z14) {
                                rj0Var2.f41165f.setVisibility(4);
                                return;
                            } else {
                                rj0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            rj0 rj0Var3 = this.f39614b;
                            if (z15) {
                                rj0Var3.f41166n.setVisibility(4);
                                return;
                            } else {
                                rj0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.f41166n.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f41166n.animate();
            if (z11) {
                f13 = 1.0f;
            }
            animate3.alpha(f13).setInterpolator(bsVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final rj0 f39614b;

                {
                    this.f39614b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            rj0 rj0Var = this.f39614b;
                            if (!z13) {
                                rj0Var.h.setVisibility(4);
                                return;
                            } else {
                                rj0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            rj0 rj0Var2 = this.f39614b;
                            if (!z14) {
                                rj0Var2.f41165f.setVisibility(4);
                                return;
                            } else {
                                rj0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            rj0 rj0Var3 = this.f39614b;
                            if (z15) {
                                rj0Var3.f41166n.setVisibility(4);
                                return;
                            } else {
                                rj0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            return;
        }
        this.h.animate().cancel();
        if (!z11) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.h.setVisibility(i10);
        if (!z11) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.h.setAlpha(f7);
        this.f41165f.animate().cancel();
        if (!z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f41165f.setVisibility(i11);
        if (!z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f41165f.setAlpha(f10);
        this.f41166n.animate().cancel();
        if (!z11) {
            i12 = 4;
        }
        this.f41166n.setVisibility(i12);
        if (z11) {
            f13 = 1.0f;
        }
        this.f41166n.setAlpha(f13);
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
