package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;
public final class rp0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean B;
    public final xn C;
    public int D;
    public boolean E;
    public org.telegram.ui.ActionBar.p1 F;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout G;
    public org.telegram.ui.ActionBar.g1[] H;
    public FrameLayout I;
    public org.telegram.ui.Components.fu J;
    public l0 K;
    public ImageView L;
    public mp0 M;
    public fg.h0 N;
    public View O;
    public final TextPaint P;
    public final RectF Q;
    public final Paint R;
    public qp0 S;
    public CharSequence f41024a;
    public final HashMap f41025b;
    public final ArrayList f41026c;
    public ArrayList d;
    public boolean f41027e;
    public int f41028f;
    public org.telegram.ui.Components.tl0 h;
    public pp0 f41029n;
    public FrameLayout f41030r;
    public TextView f41031s;
    public boolean v;
    public final int f41032w;
    public boolean f41033x;
    public final boolean f41034y;

    public rp0(int i10, boolean z4, boolean z10, xn xnVar) {
        super(null);
        this.f41025b = new HashMap();
        this.f41026c = new ArrayList();
        this.d = null;
        this.f41027e = false;
        this.f41028f = 2;
        this.f41033x = true;
        this.E = true;
        this.P = new TextPaint(1);
        this.Q = new RectF();
        this.R = new Paint(1);
        this.C = xnVar;
        this.f41032w = i10;
        this.f41034y = z4;
        this.B = z10;
    }

    public static void U(rp0 rp0Var, MediaController.AlbumEntry albumEntry) {
        if (albumEntry != null) {
            hq0 hq0Var = new hq0(0, albumEntry, rp0Var.f41025b, rp0Var.f41026c, rp0Var.f41032w, rp0Var.B, rp0Var.C, false);
            Editable text = rp0Var.J.getText();
            rp0Var.f41024a = text;
            hq0Var.d = text;
            org.telegram.ui.Components.fu fuVar = hq0Var.f37572a0;
            if (fuVar != null) {
                fuVar.setText(text);
            }
            hq0Var.f37591p0 = new np0(rp0Var);
            hq0Var.f0(rp0Var.D, rp0Var.E);
            rp0Var.presentFragment(hq0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (rp0Var.f41034y) {
            mq0 mq0Var = new mq0(hashMap, arrayList, rp0Var.f41032w, rp0Var.B, rp0Var.C);
            Editable text2 = rp0Var.J.getText();
            rp0Var.f41024a = text2;
            hq0 hq0Var2 = mq0Var.f39199a;
            if (hq0Var2 != null) {
                hq0Var2.d = text2;
                org.telegram.ui.Components.fu fuVar2 = hq0Var2.f37572a0;
                if (fuVar2 != null) {
                    fuVar2.setText(text2);
                }
            }
            op0 op0Var = new op0(rp0Var, hashMap, arrayList);
            hq0 hq0Var3 = mq0Var.f39199a;
            hq0Var3.f37591p0 = op0Var;
            hq0 hq0Var4 = mq0Var.f39200b;
            hq0Var4.f37591p0 = op0Var;
            hq0Var3.f37592q0 = new lq0(mq0Var, 0);
            hq0Var4.f37592q0 = new lq0(mq0Var, 1);
            int i10 = rp0Var.D;
            boolean z4 = rp0Var.E;
            hq0Var3.f0(i10, z4);
            mq0Var.f39200b.f0(i10, z4);
            rp0Var.presentFragment(mq0Var);
            return;
        }
        hq0 hq0Var5 = new hq0(0, albumEntry, hashMap, arrayList, rp0Var.f41032w, rp0Var.B, rp0Var.C, false);
        Editable text3 = rp0Var.J.getText();
        rp0Var.f41024a = text3;
        hq0Var5.d = text3;
        org.telegram.ui.Components.fu fuVar3 = hq0Var5.f37572a0;
        if (fuVar3 != null) {
            fuVar3.setText(text3);
        }
        hq0Var5.f37591p0 = new kp0(rp0Var, hashMap, arrayList);
        hq0Var5.f0(rp0Var.D, rp0Var.E);
        rp0Var.presentFragment(hq0Var5);
    }

    public final void V(HashMap hashMap, ArrayList arrayList, boolean z4, int i10) {
        if (!hashMap.isEmpty() && this.S != null && !this.v) {
            this.v = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Object obj = hashMap.get(arrayList.get(i11));
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                arrayList2.add(sendingMediaInfo);
                String str = null;
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    String str2 = photoEntry.imagePath;
                    if (str2 != null) {
                        sendingMediaInfo.path = str2;
                    } else {
                        sendingMediaInfo.path = photoEntry.path;
                    }
                    sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                    sendingMediaInfo.coverPath = photoEntry.coverPath;
                    sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                    sendingMediaInfo.isVideo = photoEntry.isVideo;
                    CharSequence charSequence = photoEntry.caption;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    sendingMediaInfo.caption = str;
                    sendingMediaInfo.entities = photoEntry.entities;
                    sendingMediaInfo.masks = photoEntry.stickers;
                    sendingMediaInfo.ttl = photoEntry.ttl;
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    String str3 = searchImage.imagePath;
                    if (str3 != null) {
                        sendingMediaInfo.path = str3;
                    } else {
                        sendingMediaInfo.searchImage = searchImage;
                    }
                    sendingMediaInfo.thumbPath = searchImage.thumbPath;
                    sendingMediaInfo.coverPath = searchImage.coverPath;
                    sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                    CharSequence charSequence2 = searchImage.caption;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    sendingMediaInfo.caption = str;
                    sendingMediaInfo.entities = searchImage.entities;
                    sendingMediaInfo.masks = searchImage.stickers;
                    sendingMediaInfo.ttl = searchImage.ttl;
                    TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                    if (botInlineResult != null && searchImage.type == 1) {
                        sendingMediaInfo.inlineResult = botInlineResult;
                        sendingMediaInfo.params = searchImage.params;
                    }
                    searchImage.date = (int) (System.currentTimeMillis() / 1000);
                }
            }
            this.S.a(arrayList2);
        }
    }

    public final void W(boolean z4) {
        boolean z10;
        Integer num;
        float f10;
        float f11;
        float f12;
        float f13;
        float dp;
        if (this.I.getTag() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z4 == z10) {
            return;
        }
        FrameLayout frameLayout = this.I;
        if (z4) {
            num = 1;
        } else {
            num = null;
        }
        frameLayout.setTag(num);
        if (this.J.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.J.getEditText());
        }
        this.J.k(true);
        if (z4) {
            this.I.setVisibility(0);
            this.K.setVisibility(0);
        } else {
            this.I.setVisibility(4);
            this.K.setVisibility(4);
        }
        l0 l0Var = this.K;
        float f14 = 0.2f;
        float f15 = 1.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        l0Var.setScaleX(f10);
        l0 l0Var2 = this.K;
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.2f;
        }
        l0Var2.setScaleY(f11);
        l0 l0Var3 = this.K;
        float f16 = 0.0f;
        if (z4) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        l0Var3.setAlpha(f12);
        fg.h0 h0Var = this.N;
        if (z4) {
            f13 = 1.0f;
        } else {
            f13 = 0.2f;
        }
        h0Var.setScaleX(f13);
        fg.h0 h0Var2 = this.N;
        if (z4) {
            f14 = 1.0f;
        }
        h0Var2.setScaleY(f14);
        fg.h0 h0Var3 = this.N;
        if (!z4) {
            f15 = 0.0f;
        }
        h0Var3.setAlpha(f15);
        FrameLayout frameLayout2 = this.I;
        if (z4) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(48.0f);
        }
        frameLayout2.setTranslationY(dp);
        View view = this.O;
        if (!z4) {
            f16 = AndroidUtilities.dp(48.0f);
        }
        view.setTranslationY(f16);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21731h5;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.f21766j5;
        kVar2.setTitleColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.actionBar.C(org.telegram.ui.ActionBar.k6.w0(null, i11, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new lp0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (this.f41033x) {
            n10.a(2, R.drawable.outline_header_search).setContentDescription(LocaleController.getString(R.string.Search));
        }
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        mp0 mp0Var = new mp0(this, context);
        this.M = mp0Var;
        mp0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.fragmentView = this.M;
        this.actionBar.setTitle(LocaleController.getString(R.string.Gallery));
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, null);
        this.h = tl0Var;
        tl0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new f2.j0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.M.addView(this.h, k7.c6.e(-1, -1, 51));
        org.telegram.ui.Components.tl0 tl0Var2 = this.h;
        pp0 pp0Var = new pp0(this, context);
        this.f41029n = pp0Var;
        tl0Var2.setAdapter(pp0Var);
        this.h.setGlowColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        TextView textView = new TextView(context);
        this.f41031s = textView;
        textView.setTextColor(-8355712);
        this.f41031s.setTextSize(1, 20.0f);
        this.f41031s.setGravity(17);
        this.f41031s.setVisibility(8);
        this.f41031s.setText(LocaleController.getString(R.string.NoPhotos));
        this.M.addView(this.f41031s, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f41031s.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41030r = frameLayout;
        frameLayout.setVisibility(8);
        this.M.addView(this.f41030r, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f41030r.addView(radialProgressView, k7.c6.e(-2, -2, 17));
        View view = new View(context);
        this.O = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.O.setTranslationY(AndroidUtilities.dp(48.0f));
        this.M.addView(this.O, k7.c6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.I = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.I.setVisibility(4);
        this.I.setTranslationY(AndroidUtilities.dp(48.0f));
        this.M.addView(this.I, k7.c6.e(-1, 48, 83));
        this.I.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        org.telegram.ui.Components.fu fuVar = this.J;
        if (fuVar != null) {
            fuVar.o();
        }
        this.J = new org.telegram.ui.Components.fu(context, this.M, null, 1, false, null);
        this.J.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
        this.J.setHint(LocaleController.getString(R.string.AddCaption));
        org.telegram.ui.Components.xt editText = this.J.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.I.addView(this.J, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.f41024a;
        if (charSequence != null) {
            this.J.setText(charSequence);
        }
        l0 l0Var = new l0(this, context, 16);
        this.K = l0Var;
        l0Var.setFocusable(true);
        this.K.setFocusableInTouchMode(true);
        this.K.setVisibility(4);
        this.K.setScaleX(0.2f);
        this.K.setScaleY(0.2f);
        this.K.setAlpha(0.0f);
        this.M.addView(this.K, k7.c6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.L = new ImageView(context);
        this.L.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.S5, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.T5, false)));
        this.L.setImageResource(R.drawable.attach_send);
        this.L.setImportantForAccessibility(2);
        this.L.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.U5, false), PorterDuff.Mode.MULTIPLY));
        this.L.setScaleType(ImageView.ScaleType.CENTER);
        this.L.setOutlineProvider(new hg.j1(15));
        this.K.addView(this.L, k7.c6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.L.setOnClickListener(new f60(this, 18));
        this.L.setOnLongClickListener(new w(this, 3));
        TextPaint textPaint = this.P;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        fg.h0 h0Var = new fg.h0(this, context, 27);
        this.N = h0Var;
        h0Var.setAlpha(0.0f);
        this.N.setScaleX(0.2f);
        this.N.setScaleY(0.2f);
        this.M.addView(this.N, k7.c6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.f41032w != 0) {
            this.J.setVisibility(8);
        }
        if (this.f41027e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f41030r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f41030r.setVisibility(8);
            this.h.setEmptyView(this.f41031s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.albumsDidLoad) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i12 = this.f41032w;
                if (i12 != 1 && i12 != 2 && i12 != 10 && this.f41033x) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f41030r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.tl0 tl0Var = this.h;
                if (tl0Var != null && tl0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f41031s);
                }
                pp0 pp0Var = this.f41029n;
                if (pp0Var != null) {
                    pp0Var.l();
                }
                this.f41027e = false;
            }
        } else if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.f21731h5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.f21766j5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.R4}, null, org.telegram.ui.ActionBar.k6.f21663da));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.k6.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.Components.fu fuVar = this.J;
        if (fuVar != null && fuVar.f27004e) {
            if (z4) {
                fuVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.tl0 tl0Var = this.h;
        if (tl0Var != null) {
            tl0Var.getViewTreeObserver().addOnPreDrawListener(new ai(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.f41032w;
        boolean z4 = true;
        if (i10 != 1 && i10 != 2 && i10 != 10 && this.f41033x) {
            this.d = MediaController.allMediaAlbums;
        } else {
            this.d = MediaController.allPhotoAlbums;
        }
        if (this.d != null) {
            z4 = false;
        }
        this.f41027e = z4;
        MediaController.loadGalleryPhotosAlbums(this.classGuid);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.fu fuVar = this.J;
        if (fuVar != null) {
            fuVar.o();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        pp0 pp0Var = this.f41029n;
        if (pp0Var != null) {
            pp0Var.l();
        }
        org.telegram.ui.Components.fu fuVar = this.J;
        if (fuVar != null) {
            fuVar.s();
        }
        org.telegram.ui.Components.tl0 tl0Var = this.h;
        if (tl0Var != null) {
            tl0Var.getViewTreeObserver().addOnPreDrawListener(new ai(this, 3));
        }
    }
}
