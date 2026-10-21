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
    public final int f43712a;
    public final org.telegram.ui.ActionBar.d6 f43713b;
    public final ArrayList f43714c;
    public final sa1 d;
    public final org.telegram.ui.Components.b10 e;
    public boolean f43715f;
    public final xc h;
    public boolean f43716n;
    public Utilities.Callback f43717r;
    public String f43718s;
    public TLRPC.WallPaper v;
    public final HashMap f43719w;
    public final HashMap f43720x;

    public zc(int i10, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f43714c = new ArrayList();
        this.f43719w = new HashMap();
        this.f43720x = new HashMap();
        this.f43712a = i10;
        this.f43713b = d6Var;
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(getContext(), d6Var);
        this.e = b10Var;
        b10Var.setViewType(14);
        b10Var.setVisibility(0);
        addView(b10Var, w7.z5.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        sa1 sa1Var = new sa1(activity, 4, d6Var);
        this.d = sa1Var;
        sa1Var.setClipToPadding(false);
        sa1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        sa1Var.setLayoutManager(b0Var);
        sa1Var.setAlpha(0.0f);
        xc xcVar = new xc(this, i10, d6Var);
        this.h = xcVar;
        sa1Var.setAdapter(xcVar);
        addView(sa1Var, w7.z5.c(130.0f, -1));
        sa1Var.setOnItemClickListener(new i(this, 3));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new yc(this, i10), true);
        if (!this.f43716n) {
            AndroidUtilities.updateViewVisibilityAnimated(b10Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(b10Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f43718s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f43714c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.vp vpVar = (org.telegram.ui.Components.vp) arrayList.get(i11);
            if (!TextUtils.equals(this.f43718s, vpVar.a()) && (!TextUtils.isEmpty(str) || !vpVar.f31850a.f20723a)) {
                z11 = false;
            }
            vpVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        sa1 sa1Var = this.d;
        if (i10 >= 0 && !z10 && (sa1Var.getLayoutManager() instanceof s4.b0)) {
            ((s4.b0) sa1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < sa1Var.getChildCount(); i12++) {
            View childAt = sa1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.r21) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.r21) childAt).g(((org.telegram.ui.Components.vp) arrayList.get(R)).d, true);
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
            ArrayList arrayList = this.f43714c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.vp) arrayList.get(0)).f31850a.f20723a) && this.f43715f) {
                arrayList.add(0, new org.telegram.ui.Components.vp(org.telegram.ui.ActionBar.c4.a(this.f43712a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f43717r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f43715f = z10;
    }
}
