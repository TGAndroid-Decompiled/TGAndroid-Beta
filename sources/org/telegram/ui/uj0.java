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
public final class uj0 extends org.telegram.ui.ActionBar.g3 implements AdapterView.OnItemSelectedListener {
    public static final int f38867a0 = 0;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public String F;
    public boolean G;
    public String H;
    public String I;
    public final org.telegram.ui.ActionBar.p2 J;
    public final int K;
    public final sj0 L;
    public final View M;
    public final sj0 N;
    public final ImageView O;
    public final org.telegram.ui.Components.kp P;
    public final TextView Q;
    public final LinearLayout R;
    public int S;
    public final rj0 T;
    public final TextView U;
    public final RadialProgressView V;
    public final FrameLayout W;
    public final TextView X;
    public String Y;
    public int Z;
    public final LinearLayout f38868b;
    public final org.telegram.ui.Components.qq f38869c;
    public final org.telegram.ui.Components.ad0 d;
    public final org.telegram.ui.Components.ad0 e;
    public final FrameLayout f38870f;
    public final View h;
    public final ph.d f38871n;
    public final org.telegram.ui.Components.ad0 f38872r;
    public final org.telegram.ui.Components.bd0 f38873s;
    public final org.telegram.ui.Components.f90 v;
    public final ArrayList f38874w;
    public final HashMap f38875x;
    public final HashMap f38876y;

    public uj0(android.content.Context r25, org.telegram.ui.ActionBar.p2 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uj0.<init>(android.content.Context, org.telegram.ui.ActionBar.p2):void");
    }

    public static void m(uj0 uj0Var, TLObject tLObject, org.telegram.ui.Components.vk vkVar) {
        TLRPC.User user;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(uj0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(uj0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(uj0Var.currentAccount).getUser(Long.valueOf(peerDialogId));
                vkVar.run(user);
            }
        }
        user = null;
        vkVar.run(user);
    }

    public static void n(uj0 uj0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        org.telegram.ui.ActionBar.p2 p2Var = uj0Var.J;
        uj0Var.E = false;
        if (tL_contacts_importedContacts != null) {
            if (!tL_contacts_importedContacts.users.isEmpty()) {
                MessagesController.getInstance(uj0Var.currentAccount).putUsers(tL_contacts_importedContacts.users, false);
                MessagesController.getInstance(uj0Var.currentAccount).openChatOrProfileWith(tL_contacts_importedContacts.users.get(0), null, uj0Var.J, 1, false);
                uj0Var.dismiss();
                return;
            } else if (p2Var.getParentActivity() == null) {
                return;
            } else {
                AndroidUtilities.updateViewVisibilityAnimated(uj0Var.U, true, 0.5f, true);
                AndroidUtilities.updateViewVisibilityAnimated(uj0Var.V, false, 0.5f, true);
                org.telegram.ui.Components.z4.v(p2Var, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                return;
            }
        }
        AndroidUtilities.updateViewVisibilityAnimated(uj0Var.U, true, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(uj0Var.V, false, 0.5f, true);
        org.telegram.ui.Components.z4.f0(uj0Var.currentAccount, tL_error, p2Var, tL_contacts_importContacts, new Object[0]);
    }

    public static void q(uj0 uj0Var) {
        String replaceAll = (uj0Var.L.getText().toString() + uj0Var.N.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z4 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) uj0Var.f38875x.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) uj0Var.f38876y.get(substring);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (replaceAll.length() - min >= ((String) it.next()).replace(" ", "").length()) {
                            z4 = true;
                            break;
                        }
                    }
                }
            }
            if (z4) {
                break;
            }
        }
        if (!z4) {
            if (!TextUtils.isEmpty(uj0Var.Y)) {
                uj0Var.Y = null;
                uj0Var.y(null);
            }
        } else if (!TextUtils.equals(uj0Var.Y, replaceAll)) {
            uj0Var.Y = replaceAll;
            uj0Var.y(replaceAll);
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
                        return android.support.v4.media.a.o("+", substring, str);
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
        AndroidUtilities.runOnUIThread(new nj0(this, 0), 50L);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 8388608, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f20006k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.f20024l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38869c, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.D7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38869c, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.E7));
        return arrayList;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        if (this.D) {
            this.D = false;
            return;
        }
        this.B = true;
        this.L.setText(((ut) this.f38874w.get(i10)).f38915c);
        this.B = false;
    }

    public final void r() {
        String str;
        this.E = true;
        AndroidUtilities.updateViewVisibilityAnimated(this.U, false, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.V, true, 0.5f, true);
        String str2 = "+" + this.L.getText().toString() + this.N.getText().toString();
        String obj = this.d.getEditText().getText().toString();
        String obj2 = this.e.getEditText().getText().toString();
        if (this.f38872r.getVisibility() == 0) {
            str = this.f38872r.getEditText().getText().toString();
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_importContacts, new da(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.K);
        if (this.P.f26377a.f22938q) {
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
        AndroidUtilities.runOnUIThread(new nj0(this, 1), 50L);
    }

    public final void t(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.T.animate();
            org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f27122f;
            animate.setInterpolator(mrVar).translationY(AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.X.animate().setInterpolator(mrVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.L.animate().setInterpolator(mrVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            return;
        }
        this.T.animate().setInterpolator(AndroidUtilities.overshootInterpolator).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.X.animate();
        org.telegram.ui.Components.mr mrVar2 = org.telegram.ui.Components.mr.f27122f;
        animate2.setInterpolator(mrVar2).translationX(0.0f).setDuration(150L);
        this.L.animate().setInterpolator(mrVar2).translationX(0.0f).setDuration(150L);
        this.T.setText(charSequence);
    }

    public final void u(java.lang.String r12, org.telegram.ui.ut r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uj0.u(java.lang.String, org.telegram.ui.ut):void");
    }

    public final void v(String str, boolean z4) {
        String country;
        this.F = str;
        this.G = z4;
        if (!TextUtils.isEmpty(str)) {
            TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            if (this.F.startsWith("+")) {
                this.L.setText(this.F.substring(1));
            } else if (!this.G && currentUser != null && !TextUtils.isEmpty(currentUser.phone)) {
                String str2 = currentUser.phone;
                int i10 = 4;
                while (true) {
                    if (i10 >= 1) {
                        List list = (List) this.f38875x.get(str2.substring(0, i10));
                        if (list != null && list.size() > 0) {
                            String str3 = ((ut) list.get(0)).f38915c;
                            this.L.setText(str3);
                            if (str3.endsWith("0") && this.F.startsWith("0")) {
                                this.F = this.F.substring(1);
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
                        this.L.setText(country);
                        if (country.endsWith("0") && this.F.startsWith("0")) {
                            this.F = this.F.substring(1);
                        }
                    }
                }
                this.N.setText(this.F);
            } else {
                this.L.setText(this.F);
            }
            this.F = null;
        }
    }

    public final void w(boolean z4) {
        float f10;
        ViewPropertyAnimator animate = this.R.animate();
        float f11 = 0.0f;
        if (z4) {
            f10 = -AndroidUtilities.dp(21.33f);
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator translationY = animate.translationY(f10);
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        b.p(translationY, mrVar, 420L);
        ViewPropertyAnimator animate2 = this.f38870f.animate();
        if (z4) {
            f11 = -AndroidUtilities.dp(10.665f);
        }
        animate2.translationY(f11).setInterpolator(mrVar).setDuration(420L).start();
    }

    public final void x(boolean z4) {
        int i10;
        float f10;
        int i11;
        float f11;
        float f12;
        float f13;
        boolean z10 = this.P.f26377a.f22938q;
        final boolean z11 = !z10;
        float f14 = 0.0f;
        int i12 = 0;
        if (z4) {
            this.f38871n.setVisibility(0);
            ViewPropertyAnimator animate = this.f38871n.animate();
            if (!z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
            alpha.setInterpolator(mrVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final uj0 f37428b;

                {
                    this.f37428b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z12 = z11;
                            uj0 uj0Var = this.f37428b;
                            if (!z12) {
                                uj0Var.f38871n.setVisibility(4);
                                return;
                            } else {
                                uj0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z13 = z11;
                            uj0 uj0Var2 = this.f37428b;
                            if (!z13) {
                                uj0Var2.h.setVisibility(4);
                                return;
                            } else {
                                uj0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z14 = z11;
                            uj0 uj0Var3 = this.f37428b;
                            if (z14) {
                                uj0Var3.f38872r.setVisibility(4);
                                return;
                            } else {
                                uj0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.h.setVisibility(0);
            ViewPropertyAnimator animate2 = this.h.animate();
            if (!z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            animate2.alpha(f13).setInterpolator(mrVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final uj0 f37428b;

                {
                    this.f37428b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z12 = z11;
                            uj0 uj0Var = this.f37428b;
                            if (!z12) {
                                uj0Var.f38871n.setVisibility(4);
                                return;
                            } else {
                                uj0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z13 = z11;
                            uj0 uj0Var2 = this.f37428b;
                            if (!z13) {
                                uj0Var2.h.setVisibility(4);
                                return;
                            } else {
                                uj0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z14 = z11;
                            uj0 uj0Var3 = this.f37428b;
                            if (z14) {
                                uj0Var3.f38872r.setVisibility(4);
                                return;
                            } else {
                                uj0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.f38872r.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f38872r.animate();
            if (z10) {
                f14 = 1.0f;
            }
            animate3.alpha(f14).setInterpolator(mrVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final uj0 f37428b;

                {
                    this.f37428b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z12 = z11;
                            uj0 uj0Var = this.f37428b;
                            if (!z12) {
                                uj0Var.f38871n.setVisibility(4);
                                return;
                            } else {
                                uj0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z13 = z11;
                            uj0 uj0Var2 = this.f37428b;
                            if (!z13) {
                                uj0Var2.h.setVisibility(4);
                                return;
                            } else {
                                uj0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z14 = z11;
                            uj0 uj0Var3 = this.f37428b;
                            if (z14) {
                                uj0Var3.f38872r.setVisibility(4);
                                return;
                            } else {
                                uj0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            return;
        }
        this.f38871n.animate().cancel();
        if (!z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f38871n.setVisibility(i10);
        if (!z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f38871n.setAlpha(f10);
        this.h.animate().cancel();
        if (!z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.h.setVisibility(i11);
        if (!z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        this.h.setAlpha(f11);
        this.f38872r.animate().cancel();
        if (!z10) {
            i12 = 4;
        }
        this.f38872r.setVisibility(i12);
        if (z10) {
            f14 = 1.0f;
        }
        this.f38872r.setAlpha(f14);
    }

    public final void y(String str) {
        if (this.Z >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Z, true);
            this.Z = -1;
        }
        if (TextUtils.isEmpty(str)) {
            b.p(this.O.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.mr.h, 420L);
            this.v.setText("");
            w(true);
            return;
        }
        b.p(this.O.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.mr.h, 420L);
        this.O.setImageDrawable(new org.telegram.ui.Components.qp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), getThemedColor(org.telegram.ui.ActionBar.j6.f20041m5)));
        this.v.setText("");
        w(true);
        org.telegram.ui.Components.vk vkVar = new org.telegram.ui.Components.vk(18, this, str);
        TLRPC.TL_contact tL_contact = ContactsController.getInstance(this.currentAccount).contactsByPhone.get(se.b.d(str, false));
        if (tL_contact != null) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                vkVar.run(user);
                return;
            } else {
                MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new jf0((Object) this, (Object) tL_contact, (Object) vkVar, 6));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = se.b.d(str, false);
        this.Z = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolvePhone, new ub0(6, this, vkVar));
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
