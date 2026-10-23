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
public final class tt extends org.telegram.ui.Components.bb {
    public final FrameLayout X;
    public final ei.d Y;
    public final ei.d Z;
    public final ArrayList f42069a0;
    public final HashSet f42070b0;
    public boolean f42071c0;
    public org.telegram.ui.Components.b71 f42072d0;

    public tt(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new ci.b());
        ArrayList arrayList = new ArrayList();
        this.f42069a0 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.f42070b0 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        fixNavigationBarKey(org.telegram.ui.ActionBar.k6.f21254h5);
        this.drawDoubleNavigationBar = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.X = frameLayout;
        LinearLayout f7 = org.telegram.messenger.v0.f(activity, 1);
        frameLayout.addView(f7, w7.z5.e(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.z5.d(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        w7.b6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final tt f41801b;

            {
                this.f41801b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41801b.dismiss();
                        return;
                    case 1:
                        this.f41801b.S(false);
                        return;
                    default:
                        this.f41801b.S(true);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int dp = AndroidUtilities.dp(80.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.w0(i10, this.resourcesProvider));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, K, O, null, g6Var);
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.filled_calls_users);
        frameLayout2.addView(imageView2, w7.z5.e(56, 56, 17));
        f7.addView(frameLayout2, w7.z5.t(80, 80, 1, 2, 21, 2, 13));
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.Components.y90 a2 = w7.d6.a(activity, 20.0f, i11, true, this.resourcesProvider);
        a2.setText(LocaleController.getString(R.string.GroupCallCreateTitle));
        a2.setGravity(17);
        f7.addView(a2, w7.z5.t(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.y90 a10 = w7.d6.a(activity, 14.0f, i11, false, this.resourcesProvider);
        a10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallCreateText)));
        a10.setGravity(17);
        a10.setMaxWidth(ei.x3.a(a10.getText(), a10.getPaint()));
        f7.addView(a10, w7.z5.t(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.b71 b71Var = this.f42072d0;
        if (b71Var != null) {
            b71Var.N(false);
        }
        s4.k kVar = new s4.k();
        kVar.f46377m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        this.d.setOnItemClickListener(new a1(this, 28));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout f10 = org.telegram.messenger.v0.f(activity, 0);
        f10.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        frameLayout3.addView(f10, w7.z5.e(-1, -2, 87));
        ei.d dVar = new ei.d(activity, this.resourcesProvider, true);
        this.Y = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.xq(R.drawable.profile_phone, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
        dVar.i(spannableStringBuilder, false, true);
        f10.addView(dVar, w7.z5.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final tt f41801b;

            {
                this.f41801b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41801b.dismiss();
                        return;
                    case 1:
                        this.f41801b.S(false);
                        return;
                    default:
                        this.f41801b.S(true);
                        return;
                }
            }
        });
        ei.d dVar2 = new ei.d(activity, this.resourcesProvider, true);
        this.Z = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.xq(R.drawable.profile_video, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
        dVar2.i(spannableStringBuilder2, false, true);
        f10.addView(dVar2, w7.z5.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final tt f41801b;

            {
                this.f41801b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41801b.dismiss();
                        return;
                    case 1:
                        this.f41801b.S(false);
                        return;
                    default:
                        this.f41801b.S(true);
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout3, w7.z5.e(-1, -2, 87));
        org.telegram.ui.Components.mm0 mm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(76.0f));
    }

    public static void Q(tt ttVar, TLObject tLObject, ei.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(ttVar.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(ttVar.currentAccount).putChats(updates.chats, false);
            ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
            int size = findUpdates.size();
            TLRPC.GroupCall groupCall = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj = findUpdates.get(i10);
                i10++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            Utilities.stageQueue.postRunnable(new ot(1, ttVar, updates));
            if (groupCall != null && LaunchActivity.J1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f20360id = groupCall.f20353id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                ttVar.dismiss();
                org.telegram.ui.Components.voip.d2.g(LaunchActivity.J1, ttVar.currentAccount, tL_inputGroupCall, z10, groupCall, hashSet);
                return;
            }
            ttVar.f42071c0 = false;
            dVar.setLoading(false);
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(ttVar.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(ttVar.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.J1 == null) {
                ttVar.f42071c0 = false;
                dVar.setLoading(false);
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall2 = groupcall.call;
            tL_inputGroupCall2.f20360id = groupCall2.f20353id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            ttVar.dismiss();
            org.telegram.ui.Components.voip.d2.g(LaunchActivity.J1, ttVar.currentAccount, tL_inputGroupCall2, z10, groupcall.call, hashSet);
        } else if (tL_error != null) {
            org.telegram.ui.Cells.b1.s(ttVar.topBulletinContainer, ttVar.resourcesProvider, tL_error, false);
        }
    }

    public static void R(tt ttVar, ArrayList arrayList) {
        arrayList.add(org.telegram.ui.Components.m61.k(ttVar.X));
        arrayList.add(org.telegram.ui.Components.m61.B(null));
        ArrayList arrayList2 = ttVar.f42069a0;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            i2.o1.q(R.string.GroupCallCreateAddMembers, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                Long l4 = (Long) arrayList2.get(i10);
                l4.getClass();
                TLRPC.User user = MessagesController.getInstance(ttVar.currentAccount).getUser(l4);
                if (user != null) {
                    int i11 = yg.j.f50608a;
                    org.telegram.ui.Components.m61 J = org.telegram.ui.Components.m61.J(yg.j.class);
                    J.G = user;
                    J.K(ttVar.f42070b0.contains(l4));
                    arrayList.add(J);
                } else {
                    return;
                }
            }
        }
    }

    public final void S(boolean z10) {
        ei.d dVar;
        if (this.f42071c0) {
            return;
        }
        this.f42071c0 = true;
        if (z10) {
            dVar = this.Z;
        } else {
            dVar = this.Y;
        }
        ei.d dVar2 = dVar;
        dVar2.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f42070b0);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new ai.i4(this, dVar2, z10, hashSet, 6));
    }

    @Override
    public final org.telegram.ui.Components.lm0 w(org.telegram.ui.Components.mm0 mm0Var) {
        org.telegram.ui.Components.b71 b71Var = new org.telegram.ui.Components.b71(mm0Var, getContext(), this.currentAccount, 0, true, new f5(this, 10), this.resourcesProvider);
        this.f42072d0 = b71Var;
        return b71Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.GroupCallCreateTitle);
    }
}
