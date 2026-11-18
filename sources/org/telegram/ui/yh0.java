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
public final class yh0 extends org.telegram.ui.ActionBar.h2 implements org.telegram.ui.Components.ak, org.telegram.messenger.fs {
    public int E;
    public int F;
    public int G;
    public wh0 H;
    public boolean I;
    public final SparseArray J;
    public org.telegram.ui.Components.ao K;
    public long L;
    public int M;
    public wh0 N;
    public org.telegram.ui.Components.si O;
    public Ringtone P;
    public long Q;
    public int R;
    public int S;
    public final ArrayList f54161a;
    public final ArrayList f54162b;
    public final ArrayList f54163c;
    public org.telegram.ui.Components.ck0 d;
    public di.l4 f54164e;
    public final org.telegram.ui.ActionBar.i6 f54165f;
    public int h;
    public int f54166n;
    public int f54167r;
    public int f54168s;
    public int f54169w;
    public int f54170x;
    public int f54171y;

    public yh0(Bundle bundle, org.telegram.ui.ActionBar.i6 i6Var) {
        super(bundle);
        this.f54161a = new ArrayList();
        this.f54162b = new ArrayList();
        this.f54163c = new ArrayList();
        this.G = 100;
        this.J = new SparseArray();
        this.M = -1;
        this.Q = 0L;
        this.f54165f = i6Var;
    }

    public static void Z(org.telegram.ui.yh0 r10, android.content.Context r11, android.view.View r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yh0.Z(org.telegram.ui.yh0, android.content.Context, android.view.View, int):void");
    }

    public static void b0(yh0 yh0Var) {
        yh0Var.J.clear();
        di.l4 l4Var = yh0Var.f54164e;
        l4Var.k(0, ((yh0) l4Var.d).h);
        yh0Var.h0();
    }

    public static void f0(View view, int i7, int i10) {
        if (view instanceof org.telegram.ui.Cells.j2) {
            org.telegram.ui.Cells.j2 j2Var = (org.telegram.ui.Cells.j2) view;
            for (int i11 = 0; i11 < j2Var.getChildCount(); i11++) {
                View childAt = j2Var.getChildAt(i11);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof org.telegram.ui.Components.mq) {
                        org.telegram.ui.Components.mq mqVar = (org.telegram.ui.Components.mq) imageView.getDrawable();
                        Drawable drawable = mqVar.f37607a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = mqVar.f37608b;
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
            return org.telegram.messenger.gd.a0("SoundNameEmpty", null, 2131745083, org.telegram.messenger.gd.u(document.date, true));
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
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vh0(this, context));
        if (this.L == 0) {
            int i7 = this.M;
            if (i7 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747675, null));
            } else if (i7 == 0) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747676, null));
            } else if (i7 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747677, null));
            } else if (i7 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747673, null));
            } else if (i7 == 5 || i7 == 4) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747674, null));
            }
        } else {
            this.K = new org.telegram.ui.Components.ao(context, null, false, this.f54165f);
            if (this.L < 0) {
                if (this.Q != 0) {
                    TLRPC.TL_forumTopic f10 = getMessagesController().f25769t7.f(-this.L, this.Q);
                    qg.c.q(this.K.getAvatarImageView(), f10, false, true, this.f54165f);
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
            this.simpleActionBar.setSubtitle(org.telegram.messenger.gd.M0(2131747678, null));
            org.telegram.messenger.g0.E2(this.K.f33381e);
            this.simpleActionBar.addView(this.K.f33381e, c8.ma.d(42, 42.0f, 5, 0.0f, 0.0f, 8.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.g5 q10 = this.simpleActionBar.q();
        q10.d(2, 2131232167, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.M0(2131745264, null));
        q10.d(1, 2131232110, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.M0(2131751587, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.d = ck0Var;
        ck0Var.r1();
        this.d.setSectionsDrawBackground(true);
        frameLayout.addView(this.d, c8.ma.c(-1.0f, -1));
        di.l4 l4Var = new di.l4(this, 8);
        this.f54164e = l4Var;
        l4Var.C(true);
        this.d.setAdapter(this.f54164e);
        ((v4.k) this.d.getItemAnimator()).f59152m = false;
        ((v4.k) this.d.getItemAnimator()).C = false;
        this.d.setLayoutManager(new v4.c0());
        this.d.setOnItemClickListener(new fi.g4(20, this, context));
        this.d.setOnItemLongClickListener(new zr(this, 27));
        getMediaDataController().A0.g(false);
        this.f54161a.clear();
        this.f54162b.clear();
        for (int i10 = 0; i10 < getMediaDataController().A0.f61193e.size(); i10++) {
            yf.b bVar = (yf.b) getMediaDataController().A0.f61193e.get(i10);
            ?? obj = new Object();
            int i11 = this.G;
            this.G = i11 + 1;
            obj.f53392c = i11;
            obj.f53390a = true;
            obj.d = bVar.f61187c;
            TLRPC.Document document3 = bVar.f61185a;
            String str = document3.file_name_fixed;
            obj.f53394f = str;
            obj.f53393e = document3;
            obj.f53394f = g0(document3, str);
            obj.f53395g = bVar.f61186b;
            wh0 wh0Var = this.N;
            if (wh0Var != null && (document = wh0Var.f53393e) != null && (document2 = bVar.f61185a) != null && document.f28409id == document2.f28409id) {
                this.N = null;
                this.H = obj;
            }
            this.f54161a.add(obj);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(org.telegram.messenger.t0.f26913b);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ?? obj2 = new Object();
        int i12 = this.G;
        this.G = i12 + 1;
        obj2.f53392c = i12;
        obj2.f53394f = org.telegram.messenger.gd.M0(2131747959, null);
        this.f54162b.add(obj2);
        ?? obj3 = new Object();
        int i13 = this.G;
        this.G = i13 + 1;
        obj3.f53392c = i13;
        obj3.f53394f = org.telegram.messenger.gd.M0(2131751588, null);
        obj3.f53391b = true;
        this.f54162b.add(obj3);
        wh0 wh0Var2 = this.N;
        if (wh0Var2 != null && wh0Var2.f53393e == null && wh0Var2.f53395g.equals("NoSound")) {
            this.N = null;
            this.H = obj2;
        }
        wh0 wh0Var3 = this.N;
        if (wh0Var3 != null && wh0Var3.f53393e == null && wh0Var3.f53395g.equals("Default")) {
            this.N = null;
            this.H = obj3;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ?? obj4 = new Object();
            int i14 = this.G;
            this.G = i14 + 1;
            obj4.f53392c = i14;
            obj4.f53394f = string;
            obj4.f53395g = str2;
            wh0 wh0Var4 = this.N;
            if (wh0Var4 != null && wh0Var4.f53393e == null && wh0Var4.f53395g.equals(str2)) {
                this.N = null;
                this.H = obj4;
            }
            this.f54162b.add(obj4);
        }
        if (getMediaDataController().A0.f61194f && this.H == null) {
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
        if (i7 == org.telegram.messenger.ks.f25127h5) {
            HashMap hashMap = new HashMap();
            int i11 = 0;
            while (true) {
                arrayList = this.f54161a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((wh0) arrayList.get(i11)).d), (wh0) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            for (int i12 = 0; i12 < getMediaDataController().A0.f61193e.size(); i12++) {
                yf.b bVar = (yf.b) getMediaDataController().A0.f61193e.get(i12);
                ?? obj = new Object();
                wh0 wh0Var = (wh0) hashMap.get(Integer.valueOf(bVar.f61187c));
                if (wh0Var != null) {
                    if (wh0Var == this.H) {
                        this.H = obj;
                    }
                    obj.f53392c = wh0Var.f53392c;
                } else {
                    int i13 = this.G;
                    this.G = i13 + 1;
                    obj.f53392c = i13;
                }
                obj.f53390a = true;
                obj.d = bVar.f61187c;
                TLRPC.Document document3 = bVar.f61185a;
                if (document3 != null) {
                    obj.f53394f = document3.file_name_fixed;
                } else {
                    obj.f53394f = new File(bVar.f61186b).getName();
                }
                TLRPC.Document document4 = bVar.f61185a;
                obj.f53393e = document4;
                obj.f53394f = g0(document4, obj.f53394f);
                obj.f53395g = bVar.f61186b;
                wh0 wh0Var2 = this.N;
                if (wh0Var2 != null && (document = wh0Var2.f53393e) != null && (document2 = bVar.f61185a) != null && document.f28409id == document2.f28409id) {
                    this.N = null;
                    this.H = obj;
                }
                arrayList.add(obj);
            }
            i0();
            this.f54164e.f();
            if (getMediaDataController().A0.f61194f && this.H == null) {
                ArrayList arrayList2 = this.f54162b;
                if (arrayList2.size() > 0) {
                    this.N = null;
                    this.H = (wh0) arrayList2.get(0);
                }
            }
        }
    }

    public final void e0(wh0 wh0Var) {
        int i7 = wh0Var.f53392c;
        SparseArray sparseArray = this.J;
        if (sparseArray.get(i7) != null) {
            sparseArray.remove(wh0Var.f53392c);
        } else if (wh0Var.f53390a) {
            sparseArray.put(wh0Var.f53392c, wh0Var);
        } else {
            return;
        }
        h0();
        di.l4 l4Var = this.f54164e;
        l4Var.k(0, ((yh0) l4Var.d).h);
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return this.f54165f;
    }

    public final void h0() {
        SparseArray sparseArray = this.J;
        if (sparseArray.size() > 0) {
            this.simpleActionBar.E(sparseArray.size(), this.simpleActionBar.x());
            this.simpleActionBar.J();
            return;
        }
        this.simpleActionBar.w();
    }

    public final void i0() {
        this.f54166n = -1;
        this.f54167r = -1;
        this.f54168s = -1;
        this.f54169w = -1;
        this.f54171y = -1;
        this.E = -1;
        this.F = -1;
        this.h = 1;
        ArrayList arrayList = this.f54161a;
        if (!arrayList.isEmpty()) {
            int i7 = this.h;
            this.f54166n = i7;
            int size = arrayList.size() + i7;
            this.h = size;
            this.f54167r = size;
        }
        int i10 = this.h;
        this.f54168s = i10;
        this.h = i10 + 2;
        this.f54169w = i10 + 1;
        ArrayList arrayList2 = this.f54162b;
        if (!arrayList2.isEmpty()) {
            int i11 = this.h;
            int i12 = i11 + 1;
            this.h = i12;
            this.f54171y = i11;
            this.E = i12;
            int size2 = arrayList2.size() + i12;
            this.h = size2;
            this.F = size2;
        }
        int i13 = this.h;
        this.h = i13 + 1;
        this.f54170x = i13;
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
        getNotificationCenter().k(org.telegram.messenger.ks.f25127h5, new Object[0]);
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        if (i7 == 21 && intent != null && this.O != null) {
            Uri data = intent.getData();
            int i11 = org.telegram.messenger.ks.f25127h5;
            boolean z10 = true;
            boolean z11 = false;
            if (data != null) {
                String T0 = org.telegram.messenger.g0.T0(intent.getData());
                if (T0 != null) {
                    if (T0.startsWith("content://")) {
                        T0 = MediaController.t(-1L, intent.getData(), "mp3");
                    }
                    if (this.O.f39687k2.R(new File(T0))) {
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
                    if (this.O.f39687k2.R(new File(uri2))) {
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
            obj.f53393e = new TLRPC.TL_document();
            this.N.f53393e.f28409id = j10;
        } else {
            obj.f53395g = string;
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
            wh0 wh0Var = this.H;
            if (wh0Var.f53390a && (document = wh0Var.f53393e) != null) {
                edit.putLong(str3, document.f28409id);
                edit.putString(str, this.H.f53394f);
                edit.putString(str2, "NoSound");
            } else if (wh0Var.f53395g != null) {
                edit.putString(str, wh0Var.f53394f);
                edit.putString(str2, this.H.f53395g);
                edit.remove(str3);
            } else if (wh0Var.f53391b) {
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
            getNotificationCenter().k(org.telegram.messenger.ks.f25110f0, new Object[0]);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25127h5);
    }

    @Override
    public final void onResume() {
        super.onResume();
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25127h5);
    }

    @Override
    public final void onThemeColorsChanged() {
        org.telegram.ui.ActionBar.i6 i6Var = this.f54165f;
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.N6, i6Var);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524k7, i6Var);
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
