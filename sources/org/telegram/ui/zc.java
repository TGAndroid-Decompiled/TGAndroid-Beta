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
public final class zc extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final int f46218a;
    public final org.telegram.ui.ActionBar.u6 f46219b;
    public final ArrayList f46220c;
    public final bb1 d;
    public final org.telegram.ui.Components.c10 e;
    public boolean f46221f;
    public final xc h;
    public boolean f46222n;
    public Utilities.Callback f46223r;
    public String f46224s;
    public TLRPC.WallPaper v;
    public final HashMap f46225w;
    public final HashMap f46226x;

    public zc(int i10, Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity);
        this.f46220c = new ArrayList();
        this.f46225w = new HashMap();
        this.f46226x = new HashMap();
        this.f46218a = i10;
        this.f46219b = u6Var;
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(getContext(), u6Var);
        this.e = c10Var;
        c10Var.setViewType(14);
        c10Var.setVisibility(0);
        addView(c10Var, org.telegram.ui.Components.kb1.h(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        bb1 bb1Var = new bb1(activity, 4, u6Var);
        this.d = bb1Var;
        bb1Var.setClipToPadding(false);
        bb1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.c0 c0Var = new s4.c0();
        c0Var.k1(0);
        bb1Var.setLayoutManager(c0Var);
        bb1Var.setAlpha(0.0f);
        xc xcVar = new xc(this, i10, u6Var);
        this.h = xcVar;
        bb1Var.setAdapter(xcVar);
        addView(bb1Var, org.telegram.ui.Components.kb1.g(130.0f, -1));
        bb1Var.setOnItemClickListener(new h(this, 3));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new yc(this, i10), true);
        if (!this.f46222n) {
            AndroidUtilities.updateViewVisibilityAnimated(c10Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(c10Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f46224s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f46220c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) arrayList.get(i11);
            if (!TextUtils.equals(this.f46224s, ypVar.a()) && (!TextUtils.isEmpty(str) || !ypVar.f35124a.f22683a)) {
                z11 = false;
            }
            ypVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        bb1 bb1Var = this.d;
        if (i10 >= 0 && !z10 && (bb1Var.getLayoutManager() instanceof s4.c0)) {
            ((s4.c0) bb1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < bb1Var.getChildCount(); i12++) {
            View childAt = bb1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.e31) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.e31) childAt).g(((org.telegram.ui.Components.yp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (Utilities.Callback<View>) new vc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f46220c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.yp) arrayList.get(0)).f35124a.f22683a) && this.f46221f) {
                arrayList.add(0, new org.telegram.ui.Components.yp(org.telegram.ui.ActionBar.h4.a(this.f46218a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f46223r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f46221f = z10;
    }

    @Override
    public final void updateColors() {
        ?? r02;
        xc xcVar;
        org.telegram.ui.ActionBar.u6 u6Var = this.f46219b;
        if (u6Var != null) {
            r02 = u6Var.a();
        } else {
            r02 = org.telegram.ui.ActionBar.y6.I.q();
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f46220c;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) arrayList.get(i10);
            if (ypVar.f35126c != r02) {
                ypVar.f35126c = r02;
                z10 = true;
            }
            i10++;
        }
        bb1 bb1Var = this.d;
        if (bb1Var != null) {
            AndroidUtilities.forEachViews((RecyclerView) bb1Var, (Utilities.Callback<View>) new vc(this, 0));
            if (z10 && (xcVar = this.h) != null) {
                xcVar.l();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
