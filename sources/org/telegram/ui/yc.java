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
public final class yc extends FrameLayout {
    public final int f44309a;
    public final org.telegram.ui.ActionBar.d6 f44310b;
    public final ArrayList f44311c;
    public final ec1 d;
    public final org.telegram.ui.Components.k10 f44312e;
    public boolean f44313f;
    public final wc h;
    public boolean f44314n;
    public Utilities.Callback f44315r;
    public String f44316s;
    public TLRPC.WallPaper v;
    public final HashMap f44317w;
    public final HashMap f44318x;

    public yc(int i10, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f44311c = new ArrayList();
        this.f44317w = new HashMap();
        this.f44318x = new HashMap();
        this.f44309a = i10;
        this.f44310b = d6Var;
        org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(getContext(), d6Var);
        this.f44312e = k10Var;
        k10Var.setViewType(14);
        k10Var.setVisibility(0);
        addView(k10Var, w7.x5.a(104.0f, 16.0f, 13.0f, 16.0f, 6.0f, -1, 8388611));
        ec1 ec1Var = new ec1(activity, 4, d6Var);
        this.d = ec1Var;
        ec1Var.setClipToPadding(false);
        ec1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.d0 d0Var = new s4.d0();
        d0Var.j1(0);
        ec1Var.setLayoutManager(d0Var);
        ec1Var.setAlpha(0.0f);
        wc wcVar = new wc(this, i10, d6Var);
        this.h = wcVar;
        ec1Var.setAdapter(wcVar);
        addView(ec1Var, w7.x5.d(130.0f, -1));
        ec1Var.setOnItemClickListener(new i(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new xc(this, i10), true);
        if (!this.f44314n) {
            AndroidUtilities.updateViewVisibilityAnimated(k10Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(k10Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f44316s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f44311c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.bq bqVar = (org.telegram.ui.Components.bq) arrayList.get(i11);
            if (!TextUtils.equals(this.f44316s, bqVar.a()) && (!TextUtils.isEmpty(str) || !bqVar.f25002a.f20467a)) {
                z11 = false;
            }
            bqVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        ec1 ec1Var = this.d;
        if (i10 >= 0 && !z10 && (ec1Var.getLayoutManager() instanceof s4.d0)) {
            ((s4.d0) ec1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < ec1Var.getChildCount(); i12++) {
            View childAt = ec1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.b31) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.b31) childAt).g(((org.telegram.ui.Components.bq) arrayList.get(R)).d, true);
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
            ArrayList arrayList = this.f44311c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.bq) arrayList.get(0)).f25002a.f20467a) && this.f44313f) {
                arrayList.add(0, new org.telegram.ui.Components.bq(org.telegram.ui.ActionBar.b4.a(this.f44309a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f44315r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f44313f = z10;
    }
}
