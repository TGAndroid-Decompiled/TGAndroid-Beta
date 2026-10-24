package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class zc extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final int f44061a;
    public final org.telegram.ui.ActionBar.g6 f44062b;
    public final ArrayList f44063c;
    public final wa1 d;
    public final org.telegram.ui.Components.z00 e;
    public boolean f44064f;
    public final xc h;
    public boolean f44065n;
    public Utilities.Callback f44066r;
    public String f44067s;
    public TLRPC.WallPaper v;
    public final HashMap f44068w;
    public final HashMap f44069x;

    public zc(int i10, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.f44063c = new ArrayList();
        this.f44068w = new HashMap();
        this.f44069x = new HashMap();
        this.f44061a = i10;
        this.f44062b = g6Var;
        org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(getContext(), g6Var);
        this.e = z00Var;
        z00Var.setViewType(14);
        z00Var.setVisibility(0);
        addView(z00Var, w7.z5.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        wa1 wa1Var = new wa1(activity, 4, g6Var);
        this.d = wa1Var;
        wa1Var.setClipToPadding(false);
        wa1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        wa1Var.setLayoutManager(b0Var);
        wa1Var.setAlpha(0.0f);
        xc xcVar = new xc(this, i10, g6Var);
        this.h = xcVar;
        wa1Var.setAdapter(xcVar);
        addView(wa1Var, w7.z5.c(130.0f, -1));
        wa1Var.setOnItemClickListener(new h(this, 3));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new yc(this, i10), true);
        if (!this.f44065n) {
            AndroidUtilities.updateViewVisibilityAnimated(z00Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(z00Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f44067s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f44063c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.tp tpVar = (org.telegram.ui.Components.tp) arrayList.get(i11);
            if (!TextUtils.equals(this.f44067s, tpVar.a()) && (!TextUtils.isEmpty(str) || !tpVar.f30871a.f20885a)) {
                z11 = false;
            }
            tpVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        wa1 wa1Var = this.d;
        if (i10 >= 0 && !z10 && (wa1Var.getLayoutManager() instanceof s4.b0)) {
            ((s4.b0) wa1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < wa1Var.getChildCount(); i12++) {
            View childAt = wa1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.u21) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.u21) childAt).g(((org.telegram.ui.Components.tp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (Utilities.Callback<View>) new uc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f44063c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.tp) arrayList.get(0)).f30871a.f20885a) && this.f44064f) {
                arrayList.add(0, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.f4.a(this.f44061a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f44066r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f44064f = z10;
    }

    @Override
    public final void updateColors() {
        ?? r02;
        xc xcVar;
        org.telegram.ui.ActionBar.g6 g6Var = this.f44062b;
        if (g6Var != null) {
            r02 = g6Var.a();
        } else {
            r02 = org.telegram.ui.ActionBar.k6.I.q();
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f44063c;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.tp tpVar = (org.telegram.ui.Components.tp) arrayList.get(i10);
            if (tpVar.f30873c != r02) {
                tpVar.f30873c = r02;
                z10 = true;
            }
            i10++;
        }
        wa1 wa1Var = this.d;
        if (wa1Var != null) {
            AndroidUtilities.forEachViews((RecyclerView) wa1Var, (Utilities.Callback<View>) new uc(this, 0));
            if (z10 && (xcVar = this.h) != null) {
                xcVar.l();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
