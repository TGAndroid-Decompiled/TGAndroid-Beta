package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class zc extends FrameLayout {
    public final int f43892a;
    public final org.telegram.ui.ActionBar.g6 f43893b;
    public final ArrayList f43894c;
    public final kb1 d;
    public final org.telegram.ui.Components.u00 f43895e;
    public boolean f43896f;
    public final xc h;
    public boolean f43897n;
    public Utilities.Callback f43898r;
    public String f43899s;
    public TLRPC.WallPaper v;
    public final HashMap f43900w;
    public final HashMap f43901x;

    public zc(int i10, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.f43894c = new ArrayList();
        this.f43900w = new HashMap();
        this.f43901x = new HashMap();
        this.f43892a = i10;
        this.f43893b = g6Var;
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(getContext(), g6Var);
        this.f43895e = u00Var;
        u00Var.setViewType(14);
        u00Var.setVisibility(0);
        addView(u00Var, k7.c6.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        kb1 kb1Var = new kb1(activity, 3, g6Var);
        this.d = kb1Var;
        kb1Var.setClipToPadding(false);
        kb1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        f2.j0 j0Var = new f2.j0();
        j0Var.j1(0);
        kb1Var.setLayoutManager(j0Var);
        kb1Var.setAlpha(0.0f);
        xc xcVar = new xc(this, i10, g6Var);
        this.h = xcVar;
        kb1Var.setAdapter(xcVar);
        addView(kb1Var, k7.c6.c(130.0f, -1));
        kb1Var.setOnItemClickListener(new j(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new yc(this, i10), true);
        if (!this.f43897n) {
            AndroidUtilities.updateViewVisibilityAnimated(u00Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(u00Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z4) {
        ArrayList arrayList;
        int R;
        this.f43899s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f43894c;
            boolean z10 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList.get(i11);
            if (!TextUtils.equals(this.f43899s, lpVar.a()) && (!TextUtils.isEmpty(str) || !lpVar.f28796a.f21358a)) {
                z10 = false;
            }
            lpVar.d = z10;
            if (z10) {
                i10 = i11;
            }
            i11++;
        }
        kb1 kb1Var = this.d;
        if (i10 >= 0 && !z4 && (kb1Var.getLayoutManager() instanceof f2.j0)) {
            ((f2.j0) kb1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < kb1Var.getChildCount(); i12++) {
            View childAt = kb1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.x11) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.x11) childAt).g(((org.telegram.ui.Components.lp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (h5.d) new vc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f43894c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.lp) arrayList.get(0)).f28796a.f21358a) && this.f43896f) {
                arrayList.add(0, new org.telegram.ui.Components.lp(org.telegram.ui.ActionBar.f4.a(this.f43892a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f43898r = callback;
    }

    public void setWithRemovedStub(boolean z4) {
        this.f43896f = z4;
    }
}
