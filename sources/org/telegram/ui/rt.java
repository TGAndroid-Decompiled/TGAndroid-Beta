package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
public final class rt extends org.telegram.ui.Components.bb {
    public final FrameLayout X;
    public final fi.d Y;
    public final fi.d Z;
    public final ArrayList f43281a0;
    public final HashSet f43282b0;
    public boolean f43283c0;
    public org.telegram.ui.Components.j71 f43284d0;

    public rt(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new di.b());
        ArrayList arrayList = new ArrayList();
        this.f43281a0 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.f43282b0 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        fixNavigationBarKey(org.telegram.ui.ActionBar.y6.f23427h5);
        this.drawDoubleNavigationBar = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.X = frameLayout;
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 1);
        frameLayout.addView(f7, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, org.telegram.ui.Components.gb1.h(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.gb1.b(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final rt f42655b;

            {
                this.f42655b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42655b.dismiss();
                        return;
                    case 1:
                        this.f42655b.S(false);
                        return;
                    default:
                        this.f42655b.S(true);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int dp = AndroidUtilities.dp(80.0f);
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.w0(i10, this.resourcesProvider));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(frameLayout2, K, N, null, u6Var);
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.filled_calls_users);
        frameLayout2.addView(imageView2, org.telegram.ui.Components.gb1.i(56, 56, 17));
        f7.addView(frameLayout2, org.telegram.ui.Components.gb1.x(80, 80, 1, 2, 21, 2, 13));
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.Components.z90 K2 = org.telegram.ui.Components.gb1.K(activity, 20.0f, i11, true, this.resourcesProvider);
        K2.setText(LocaleController.getString(R.string.GroupCallCreateTitle));
        K2.setGravity(17);
        f7.addView(K2, org.telegram.ui.Components.gb1.x(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.z90 K3 = org.telegram.ui.Components.gb1.K(activity, 14.0f, i11, false, this.resourcesProvider);
        K3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallCreateText)));
        K3.setGravity(17);
        K3.setMaxWidth(fi.v3.a(K3.getText(), K3.getPaint()));
        f7.addView(K3, org.telegram.ui.Components.gb1.x(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.j71 j71Var = this.f43284d0;
        if (j71Var != null) {
            j71Var.O(false);
        }
        s4.l lVar = new s4.l();
        lVar.f47763m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setOnItemClickListener(new qt(this, 0));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout f10 = org.telegram.messenger.t.f(activity, 0);
        f10.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        frameLayout3.addView(f10, org.telegram.ui.Components.gb1.i(-1, -2, 87));
        fi.d dVar = new fi.d(activity, this.resourcesProvider, true);
        this.Y = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.zq(R.drawable.profile_phone, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
        dVar.i(spannableStringBuilder, false, true);
        f10.addView(dVar, org.telegram.ui.Components.gb1.t(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final rt f42655b;

            {
                this.f42655b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42655b.dismiss();
                        return;
                    case 1:
                        this.f42655b.S(false);
                        return;
                    default:
                        this.f42655b.S(true);
                        return;
                }
            }
        });
        fi.d dVar2 = new fi.d(activity, this.resourcesProvider, true);
        this.Z = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.zq(R.drawable.profile_video, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
        dVar2.i(spannableStringBuilder2, false, true);
        f10.addView(dVar2, org.telegram.ui.Components.gb1.t(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final rt f42655b;

            {
                this.f42655b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42655b.dismiss();
                        return;
                    case 1:
                        this.f42655b.S(false);
                        return;
                    default:
                        this.f42655b.S(true);
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout3, org.telegram.ui.Components.gb1.i(-1, -2, 87));
        org.telegram.ui.Components.mm0 mm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(76.0f));
    }

    public static void Q(rt rtVar, TLObject tLObject, fi.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(rtVar.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(rtVar.currentAccount).putChats(updates.chats, false);
            ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
            int size = findUpdates.size();
            TLRPC.GroupCall groupCall = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj = findUpdates.get(i10);
                i10++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            Utilities.stageQueue.postRunnable(new org.telegram.ui.Components.c71(19, rtVar, updates));
            if (groupCall != null && LaunchActivity.I1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f22044id = groupCall.f22037id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                rtVar.dismiss();
                org.telegram.ui.Components.voip.g2.g(LaunchActivity.I1, rtVar.currentAccount, tL_inputGroupCall, z10, groupCall, hashSet);
                return;
            }
            rtVar.f43283c0 = false;
            dVar.setLoading(false);
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(rtVar.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(rtVar.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.I1 == null) {
                rtVar.f43283c0 = false;
                dVar.setLoading(false);
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall2 = groupcall.call;
            tL_inputGroupCall2.f22044id = groupCall2.f22037id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            rtVar.dismiss();
            org.telegram.ui.Components.voip.g2.g(LaunchActivity.I1, rtVar.currentAccount, tL_inputGroupCall2, z10, groupcall.call, hashSet);
        } else if (tL_error != null) {
            d3.t(rtVar.topBulletinContainer, rtVar.resourcesProvider, tL_error, false);
        }
    }

    public static void R(rt rtVar, ArrayList arrayList) {
        arrayList.add(org.telegram.ui.Components.t61.k(rtVar.X));
        arrayList.add(org.telegram.ui.Components.t61.C(null));
        ArrayList arrayList2 = rtVar.f43281a0;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ic.a.p(R.string.GroupCallCreateAddMembers, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                Long l4 = (Long) arrayList2.get(i10);
                l4.getClass();
                TLRPC.User user = MessagesController.getInstance(rtVar.currentAccount).getUser(l4);
                if (user != null) {
                    int i11 = zg.k.f52888a;
                    org.telegram.ui.Components.t61 K = org.telegram.ui.Components.t61.K(zg.k.class);
                    K.G = user;
                    K.L(rtVar.f43282b0.contains(l4));
                    arrayList.add(K);
                } else {
                    return;
                }
            }
        }
    }

    public final void S(boolean z10) {
        fi.d dVar;
        if (this.f43283c0) {
            return;
        }
        this.f43283c0 = true;
        if (z10) {
            dVar = this.Z;
        } else {
            dVar = this.Y;
        }
        fi.d dVar2 = dVar;
        dVar2.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f43282b0);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new bi.d4(this, dVar2, z10, hashSet, 6));
    }

    @Override
    public final org.telegram.ui.Components.lm0 v(org.telegram.ui.Components.mm0 mm0Var) {
        org.telegram.ui.Components.j71 j71Var = new org.telegram.ui.Components.j71(mm0Var, getContext(), this.currentAccount, 0, true, new e5(this, 10), this.resourcesProvider);
        this.f43284d0 = j71Var;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.GroupCallCreateTitle);
    }
}
