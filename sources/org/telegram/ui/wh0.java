package org.telegram.ui;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class wh0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.ui.Components.bk, org.telegram.messenger.fs {
    public int E;
    public int F;
    public int G;
    public uh0 H;
    public boolean I;
    public final SparseArray J;
    public org.telegram.ui.Components.zn K;
    public long L;
    public int M;
    public uh0 N;
    public org.telegram.ui.Components.ti O;
    public Ringtone P;
    public long Q;
    public int R;
    public int S;
    public final ArrayList f53682a;
    public final ArrayList f53683b;
    public final ArrayList f53684c;
    public org.telegram.ui.Components.ek0 d;
    public di.l4 f53685e;
    public final org.telegram.ui.ActionBar.i6 f53686f;
    public int h;
    public int f53687n;
    public int f53688r;
    public int f53689s;
    public int f53690w;
    public int f53691x;
    public int f53692y;

    public wh0(Bundle bundle, org.telegram.ui.ActionBar.i6 i6Var) {
        super(bundle);
        this.f53682a = new ArrayList();
        this.f53683b = new ArrayList();
        this.f53684c = new ArrayList();
        this.G = 100;
        this.J = new SparseArray();
        this.M = -1;
        this.Q = 0L;
        this.f53686f = i6Var;
    }

    public static void Z(org.telegram.ui.wh0 r10, android.content.Context r11, android.view.View r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wh0.Z(org.telegram.ui.wh0, android.content.Context, android.view.View, int):void");
    }

    public static void b0(wh0 wh0Var) {
        wh0Var.J.clear();
        di.l4 l4Var = wh0Var.f53685e;
        l4Var.k(0, ((wh0) l4Var.d).h);
        wh0Var.h0();
    }

    public static void f0(View view, int i7, int i10) {
        if (view instanceof org.telegram.ui.Cells.j2) {
            org.telegram.ui.Cells.j2 j2Var = (org.telegram.ui.Cells.j2) view;
            for (int i11 = 0; i11 < j2Var.getChildCount(); i11++) {
                View childAt = j2Var.getChildAt(i11);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof org.telegram.ui.Components.lq) {
                        org.telegram.ui.Components.lq lqVar = (org.telegram.ui.Components.lq) imageView.getDrawable();
                        Drawable drawable = lqVar.f37195a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = lqVar.f37196b;
                        if (drawable2 != null) {
                            drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                        childAt.invalidate();
                    }
                }
            }
        }
    }

    public static String g0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        if (TextUtils.isEmpty(str) && document != null) {
            return org.telegram.messenger.gd.a0("SoundNameEmpty", null, 2131745082, org.telegram.messenger.gd.u(document.date, true));
        }
        return str;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new th0(this, context));
        if (this.L == 0) {
            int i7 = this.M;
            if (i7 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747674, null));
            } else if (i7 == 0) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747675, null));
            } else if (i7 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747676, null));
            } else if (i7 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747672, null));
            } else if (i7 == 5 || i7 == 4) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747673, null));
            }
        } else {
            this.K = new org.telegram.ui.Components.zn(context, null, false, this.f53686f);
            if (this.L < 0) {
                if (this.Q != 0) {
                    TLRPC.TL_forumTopic f10 = getMessagesController().f25864t7.f(-this.L, this.Q);
                    qg.c.q(this.K.getAvatarImageView(), f10, false, true, this.f53686f);
                    this.simpleActionBar.setTitle(f10.title);
                } else {
                    TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-this.L));
                    this.K.setChatAvatar(O0);
                    this.simpleActionBar.setTitle(O0.title);
                }
            } else {
                TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.L));
                if (c22 != null) {
                    this.K.setUserAvatar(c22);
                    this.simpleActionBar.setTitle(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
                }
            }
            this.simpleActionBar.setSubtitle(org.telegram.messenger.gd.N0(2131747677, null));
            org.telegram.messenger.g0.E2(this.K.f42934e);
            this.simpleActionBar.addView(this.K.f42934e, c8.na.d(42, 42.0f, 5, 0.0f, 0.0f, 8.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.f5 q10 = this.simpleActionBar.q();
        q10.d(2, 2131232170, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.N0(2131745263, null));
        q10.d(1, 2131232113, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.N0(2131751586, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.d = ek0Var;
        ek0Var.r1();
        this.d.setSectionsDrawBackground(true);
        frameLayout.addView(this.d, c8.na.c(-1.0f, -1));
        di.l4 l4Var = new di.l4(this, 8);
        this.f53685e = l4Var;
        l4Var.C(true);
        this.d.setAdapter(this.f53685e);
        ((v4.l) this.d.getItemAnimator()).f59274m = false;
        ((v4.l) this.d.getItemAnimator()).C = false;
        this.d.setLayoutManager(new v4.c0());
        this.d.setOnItemClickListener(new fi.g4(20, this, context));
        this.d.setOnItemLongClickListener(new zr(this, 27));
        getMediaDataController().A0.g(false);
        this.f53682a.clear();
        this.f53683b.clear();
        for (int i10 = 0; i10 < getMediaDataController().A0.f61322e.size(); i10++) {
            yf.b bVar = (yf.b) getMediaDataController().A0.f61322e.get(i10);
            ?? obj = new Object();
            int i11 = this.G;
            this.G = i11 + 1;
            obj.f52663c = i11;
            obj.f52661a = true;
            obj.d = bVar.f61316c;
            TLRPC.Document document3 = bVar.f61314a;
            String str = document3.file_name_fixed;
            obj.f52665f = str;
            obj.f52664e = document3;
            obj.f52665f = g0(document3, str);
            obj.f52666g = bVar.f61315b;
            uh0 uh0Var = this.N;
            if (uh0Var != null && (document = uh0Var.f52664e) != null && (document2 = bVar.f61314a) != null && document.f28498id == document2.f28498id) {
                this.N = null;
                this.H = obj;
            }
            this.f53682a.add(obj);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(org.telegram.messenger.t0.f27013b);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ?? obj2 = new Object();
        int i12 = this.G;
        this.G = i12 + 1;
        obj2.f52663c = i12;
        obj2.f52665f = org.telegram.messenger.gd.N0(2131747958, null);
        this.f53683b.add(obj2);
        ?? obj3 = new Object();
        int i13 = this.G;
        this.G = i13 + 1;
        obj3.f52663c = i13;
        obj3.f52665f = org.telegram.messenger.gd.N0(2131751587, null);
        obj3.f52662b = true;
        this.f53683b.add(obj3);
        uh0 uh0Var2 = this.N;
        if (uh0Var2 != null && uh0Var2.f52664e == null && uh0Var2.f52666g.equals("NoSound")) {
            this.N = null;
            this.H = obj2;
        }
        uh0 uh0Var3 = this.N;
        if (uh0Var3 != null && uh0Var3.f52664e == null && uh0Var3.f52666g.equals("Default")) {
            this.N = null;
            this.H = obj3;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ?? obj4 = new Object();
            int i14 = this.G;
            this.G = i14 + 1;
            obj4.f52663c = i14;
            obj4.f52665f = string;
            obj4.f52666g = str2;
            uh0 uh0Var4 = this.N;
            if (uh0Var4 != null && uh0Var4.f52664e == null && uh0Var4.f52666g.equals(str2)) {
                this.N = null;
                this.H = obj4;
            }
            this.f53683b.add(obj4);
        }
        if (getMediaDataController().A0.f61323f && this.H == null) {
            this.H = obj3;
            this.I = true;
        }
        i0();
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i7 == org.telegram.messenger.ks.f25226h5) {
            HashMap hashMap = new HashMap();
            int i11 = 0;
            while (true) {
                arrayList = this.f53682a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((uh0) arrayList.get(i11)).d), (uh0) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            for (int i12 = 0; i12 < getMediaDataController().A0.f61322e.size(); i12++) {
                yf.b bVar = (yf.b) getMediaDataController().A0.f61322e.get(i12);
                ?? obj = new Object();
                uh0 uh0Var = (uh0) hashMap.get(Integer.valueOf(bVar.f61316c));
                if (uh0Var != null) {
                    if (uh0Var == this.H) {
                        this.H = obj;
                    }
                    obj.f52663c = uh0Var.f52663c;
                } else {
                    int i13 = this.G;
                    this.G = i13 + 1;
                    obj.f52663c = i13;
                }
                obj.f52661a = true;
                obj.d = bVar.f61316c;
                TLRPC.Document document3 = bVar.f61314a;
                if (document3 != null) {
                    obj.f52665f = document3.file_name_fixed;
                } else {
                    obj.f52665f = new File(bVar.f61315b).getName();
                }
                TLRPC.Document document4 = bVar.f61314a;
                obj.f52664e = document4;
                obj.f52665f = g0(document4, obj.f52665f);
                obj.f52666g = bVar.f61315b;
                uh0 uh0Var2 = this.N;
                if (uh0Var2 != null && (document = uh0Var2.f52664e) != null && (document2 = bVar.f61314a) != null && document.f28498id == document2.f28498id) {
                    this.N = null;
                    this.H = obj;
                }
                arrayList.add(obj);
            }
            i0();
            this.f53685e.f();
            if (getMediaDataController().A0.f61323f && this.H == null) {
                ArrayList arrayList2 = this.f53683b;
                if (arrayList2.size() > 0) {
                    this.N = null;
                    this.H = (uh0) arrayList2.get(0);
                }
            }
        }
    }

    public final void e0(uh0 uh0Var) {
        int i7 = uh0Var.f52663c;
        SparseArray sparseArray = this.J;
        if (sparseArray.get(i7) != null) {
            sparseArray.remove(uh0Var.f52663c);
        } else if (uh0Var.f52661a) {
            sparseArray.put(uh0Var.f52663c, uh0Var);
        } else {
            return;
        }
        h0();
        di.l4 l4Var = this.f53685e;
        l4Var.k(0, ((wh0) l4Var.d).h);
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return this.f53686f;
    }

    public final void h0() {
        SparseArray sparseArray = this.J;
        if (sparseArray.size() > 0) {
            this.simpleActionBar.D(sparseArray.size(), this.simpleActionBar.x());
            this.simpleActionBar.I();
            return;
        }
        this.simpleActionBar.w();
    }

    public final void i0() {
        this.f53687n = -1;
        this.f53688r = -1;
        this.f53689s = -1;
        this.f53690w = -1;
        this.f53692y = -1;
        this.E = -1;
        this.F = -1;
        this.h = 1;
        ArrayList arrayList = this.f53682a;
        if (!arrayList.isEmpty()) {
            int i7 = this.h;
            this.f53687n = i7;
            int size = arrayList.size() + i7;
            this.h = size;
            this.f53688r = size;
        }
        int i10 = this.h;
        this.f53689s = i10;
        this.h = i10 + 2;
        this.f53690w = i10 + 1;
        ArrayList arrayList2 = this.f53683b;
        if (!arrayList2.isEmpty()) {
            int i11 = this.h;
            int i12 = i11 + 1;
            this.h = i12;
            this.f53692y = i11;
            this.E = i12;
            int size2 = arrayList2.size() + i12;
            this.h = size2;
            this.F = size2;
        }
        int i13 = this.h;
        this.h = i13 + 1;
        this.f53691x = i13;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            getMediaDataController().q2((String) arrayList.get(i10));
        }
        getNotificationCenter().k(org.telegram.messenger.ks.f25226h5, new Object[0]);
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        if (i7 == 21 && intent != null && this.O != null) {
            Uri data = intent.getData();
            int i11 = org.telegram.messenger.ks.f25226h5;
            boolean z10 = true;
            boolean z11 = false;
            if (data != null) {
                String T0 = org.telegram.messenger.g0.T0(intent.getData());
                if (T0 != null) {
                    if (T0.startsWith("content://")) {
                        T0 = MediaController.t(-1L, intent.getData(), "mp3");
                    }
                    if (this.O.f39984k2.R(new File(T0))) {
                        getMediaDataController().q2(T0);
                        getNotificationCenter().k(i11, new Object[0]);
                        z11 = z10;
                    }
                }
                z10 = false;
                z11 = z10;
            } else if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                boolean z12 = false;
                for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                    Uri uri = clipData.getItemAt(i12).getUri();
                    String uri2 = uri.toString();
                    if (uri2.startsWith("content://")) {
                        uri2 = MediaController.t(-1L, uri, "mp3");
                    }
                    if (this.O.f39984k2.R(new File(uri2))) {
                        getMediaDataController().q2(uri2);
                        getNotificationCenter().k(i11, new Object[0]);
                        z12 = true;
                    }
                }
                z11 = z12;
            }
            if (z11) {
                this.O.dismiss();
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.L = getArguments().getLong("dialog_id", 0L);
            this.Q = getArguments().getLong("topic_id", 0L);
            this.M = getArguments().getInt("type", -1);
        }
        long j3 = this.L;
        if (j3 != 0) {
            String v = org.telegram.messenger.xs.v(j3, this.Q, false);
            str2 = p5.c.k("sound_document_id_", v);
            str = p5.c.k("sound_path_", v);
        } else {
            int i7 = this.M;
            if (i7 == 1) {
                str = "GlobalSoundPath";
                str2 = "GlobalSoundDocId";
            } else if (i7 == 0) {
                str = "GroupSoundPath";
                str2 = "GroupSoundDocId";
            } else if (i7 == 2) {
                str = "ChannelSoundPath";
                str2 = "ChannelSoundDocId";
            } else if (i7 == 3) {
                str = "StoriesSoundPath";
                str2 = "StoriesSoundDocId";
            } else if (i7 != 4 && i7 != 5) {
                throw new RuntimeException("Unsupported type");
            } else {
                str = "ReactionSoundPath";
                str2 = "ReactionSoundDocId";
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j10 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        ?? obj = new Object();
        this.N = obj;
        if (j10 != 0) {
            obj.f52664e = new TLRPC.TL_document();
            this.N.f52664e.f28498id = j10;
        } else {
            obj.f52666g = string;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        String str;
        String str2;
        String str3;
        TLRPC.Document document;
        super.onFragmentDestroy();
        if (this.H != null && this.I) {
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            if (this.L != 0) {
                str = "sound_" + org.telegram.messenger.xs.v(this.L, this.Q, false);
                str2 = "sound_path_" + org.telegram.messenger.xs.v(this.L, this.Q, false);
                str3 = "sound_document_id_" + org.telegram.messenger.xs.v(this.L, this.Q, false);
                edit.putBoolean("sound_enabled_" + org.telegram.messenger.xs.v(this.L, this.Q, false), true);
            } else {
                int i7 = this.M;
                if (i7 == 1) {
                    str = "GlobalSound";
                    str2 = "GlobalSoundPath";
                    str3 = "GlobalSoundDocId";
                } else if (i7 == 0) {
                    str = "GroupSound";
                    str2 = "GroupSoundPath";
                    str3 = "GroupSoundDocId";
                } else if (i7 == 2) {
                    str = "ChannelSound";
                    str2 = "ChannelSoundPath";
                    str3 = "ChannelSoundDocId";
                } else if (i7 == 3) {
                    str = "StoriesSound";
                    str2 = "StoriesSoundPath";
                    str3 = "StoriesSoundDocId";
                } else if (i7 != 5 && i7 != 4) {
                    throw new RuntimeException("Unsupported type");
                } else {
                    str = "ReactionSound";
                    str2 = "ReactionSoundPath";
                    str3 = "ReactionSoundDocId";
                }
            }
            uh0 uh0Var = this.H;
            if (uh0Var.f52661a && (document = uh0Var.f52664e) != null) {
                edit.putLong(str3, document.f28498id);
                edit.putString(str, this.H.f52665f);
                edit.putString(str2, "NoSound");
            } else if (uh0Var.f52666g != null) {
                edit.putString(str, uh0Var.f52665f);
                edit.putString(str2, this.H.f52666g);
                edit.remove(str3);
            } else if (uh0Var.f52662b) {
                edit.putString(str, "Default");
                edit.putString(str2, "Default");
                edit.remove(str3);
            } else {
                edit.putString(str, "NoSound");
                edit.putString(str2, "NoSound");
                edit.remove(str3);
            }
            edit.apply();
            if (this.L != 0) {
                getNotificationsController().c0(this.L, this.Q, true);
                return;
            }
            getNotificationsController().b0(this.M);
            getNotificationCenter().k(org.telegram.messenger.ks.f25209f0, new Object[0]);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25226h5);
    }

    @Override
    public final void onResume() {
        super.onResume();
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25226h5);
    }

    @Override
    public final void onThemeColorsChanged() {
        org.telegram.ui.ActionBar.i6 i6Var = this.f53686f;
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.N6, i6Var);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29581k7, i6Var);
            if (this.d != null) {
                if (w02 == this.R && w03 == this.S) {
                    return;
                }
                this.R = w02;
                this.S = w03;
                for (int i7 = 0; i7 < this.d.getChildCount(); i7++) {
                    f0(this.d.getChildAt(i7), w02, w03);
                }
                for (int i10 = 0; i10 < this.d.getCachedChildCount(); i10++) {
                    f0(this.d.P(i10), w02, w03);
                }
                for (int i11 = 0; i11 < this.d.getHiddenChildCount(); i11++) {
                    f0(this.d.V(i11), w02, w03);
                }
                for (int i12 = 0; i12 < this.d.getAttachedScrapChildCount(); i12++) {
                    f0(this.d.O(i12), w02, w03);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void T() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
    }
}
