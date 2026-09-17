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
    public final int f43396a;
    public final org.telegram.ui.ActionBar.f6 f43397b;
    public final ArrayList f43398c;
    public final ec1 d;
    public final org.telegram.ui.Components.t00 f43399e;
    public boolean f43400f;
    public final xc h;
    public boolean f43401n;
    public Utilities.Callback f43402r;
    public String f43403s;
    public TLRPC.WallPaper v;
    public final HashMap f43404w;
    public final HashMap f43405x;

    public zc(int i10, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f43398c = new ArrayList();
        this.f43404w = new HashMap();
        this.f43405x = new HashMap();
        this.f43396a = i10;
        this.f43397b = f6Var;
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(getContext(), f6Var);
        this.f43399e = t00Var;
        t00Var.setViewType(14);
        t00Var.setVisibility(0);
        addView(t00Var, w7.x5.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        ec1 ec1Var = new ec1(activity, 4, f6Var);
        this.d = ec1Var;
        ec1Var.setClipToPadding(false);
        ec1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        ec1Var.setLayoutManager(c0Var);
        ec1Var.setAlpha(0.0f);
        xc xcVar = new xc(this, i10, f6Var);
        this.h = xcVar;
        ec1Var.setAdapter(xcVar);
        addView(ec1Var, w7.x5.c(130.0f, -1));
        ec1Var.setOnItemClickListener(new i(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new yc(this, i10), true);
        if (!this.f43401n) {
            AndroidUtilities.updateViewVisibilityAnimated(t00Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(t00Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f43403s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f43398c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.kp kpVar = (org.telegram.ui.Components.kp) arrayList.get(i11);
            if (!TextUtils.equals(this.f43403s, kpVar.a()) && (!TextUtils.isEmpty(str) || !kpVar.f27910a.f20389a)) {
                z11 = false;
            }
            kpVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        ec1 ec1Var = this.d;
        if (i10 >= 0 && !z10 && (ec1Var.getLayoutManager() instanceof s4.c0)) {
            ((s4.c0) ec1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < ec1Var.getChildCount(); i12++) {
            View childAt = ec1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.t11) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.t11) childAt).g(((org.telegram.ui.Components.kp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (e2.h) new vc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f43398c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.kp) arrayList.get(0)).f27910a.f20389a) && this.f43400f) {
                arrayList.add(0, new org.telegram.ui.Components.kp(org.telegram.ui.ActionBar.d4.a(this.f43396a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f43402r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f43400f = z10;
    }
}
