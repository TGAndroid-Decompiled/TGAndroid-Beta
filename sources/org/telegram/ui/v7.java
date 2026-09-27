package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public abstract class v7 extends FrameLayout implements org.telegram.ui.Components.vc0 {
    public l7 E;
    public final ArrayList f38463a;
    public final FrameLayout f38464b;
    public final org.telegram.ui.Components.x81 f38465c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final ArrayList e;
    public zh.b f38466f;
    public final org.telegram.ui.Components.y81 h;
    public final u7[] f38467n;
    public k7 f38468r;
    public int f38469s;
    public int v;
    public int f38470w;
    public boolean f38471x;
    public final h7 f38472y;

    public v7(Context context, org.telegram.ui.ActionBar.o2 o2Var, li.l lVar) {
        super(context);
        float f7;
        this.f38463a = new ArrayList();
        this.e = new ArrayList();
        u7[] u7VarArr = new u7[5];
        this.f38467n = u7VarArr;
        this.f38472y = new h7(this, 0);
        this.d = o2Var;
        u7VarArr[0] = new u7(LocaleController.getString(R.string.FilterChats), 0, new m7(this));
        u7VarArr[1] = new u7(LocaleController.getString(R.string.MediaTab), 1, new r7(this));
        u7VarArr[2] = new u7(LocaleController.getString(R.string.SharedFilesTab2), 2, new o7(this));
        u7VarArr[3] = new u7(LocaleController.getString(R.string.Music), 3, new t7(this));
        int i10 = 0;
        while (true) {
            u7[] u7VarArr2 = this.f38467n;
            if (i10 >= u7VarArr2.length) {
                break;
            }
            u7 u7Var = u7VarArr2[i10];
            if (u7Var != null) {
                this.e.add(i10, u7Var);
            }
            i10++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38464b = frameLayout;
        org.telegram.ui.Components.y81 y81Var = new org.telegram.ui.Components.y81(getContext(), null);
        this.h = y81Var;
        y81Var.setAllowDisallowInterceptTouch(false);
        if (lVar != null) {
            lVar.c(y81Var);
        }
        if (lVar != null) {
            f7 = 0.0f;
        } else {
            f7 = 48.0f;
        }
        addView(y81Var, w7.y5.d(-1, -1.0f, 48, 0.0f, f7, 0.0f, 0.0f));
        org.telegram.ui.Components.x81 n10 = y81Var.n(lVar != null ? -2 : 3, true);
        this.f38465c = n10;
        frameLayout.addView(n10, w7.y5.c(48.0f, -1));
        if (lVar != null) {
            frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        }
        addView(frameLayout, w7.y5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        y81Var.setAdapter(new g7(this, context, lVar, o2Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, w7.y5.c(48.0f, -1));
        AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(true);
        imageView.setImageDrawable(h2Var);
        int i11 = org.telegram.ui.ActionBar.i6.f19444y8;
        h2Var.a(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.i6.f19463z8;
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, i12, false), 1, -1));
        imageView.setContentDescription(LocaleController.getString(R.string.Close));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.f38463a.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final v7 f32534b;

            {
                this.f32534b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f32534b.E.i1();
                        return;
                    default:
                        this.f32534b.E.clear();
                        return;
                }
            }
        });
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, true, true);
        p6Var.setTextSize(AndroidUtilities.dp(18.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        linearLayout.addView(p6Var, w7.y5.m(1.0f, 0, -1, 18, 0, 0));
        this.f38463a.add(p6Var);
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, org.telegram.ui.ActionBar.i6.w0(null, i12, false), org.telegram.ui.ActionBar.i6.w0(null, i11, false), false, null);
        w0Var.setIcon(R.drawable.msg_clear);
        w0Var.setContentDescription(LocaleController.getString(R.string.Delete));
        w0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(w0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.f38463a.add(w0Var);
        w0Var.setOnClickListener(new View.OnClickListener(this) {
            public final v7 f32534b;

            {
                this.f32534b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f32534b.E.i1();
                        return;
                    default:
                        this.f32534b.E.clear();
                        return;
                }
            }
        });
    }

    public static void a(v7 v7Var, p7 p7Var, r7 r7Var, org.telegram.ui.Components.yl0 yl0Var) {
        ArrayList arrayList = r7Var.e;
        PhotoViewer.t1().J2(null, v7Var.d, null);
        if (v7Var.f38468r == null) {
            v7Var.f38468r = new k7(v7Var);
        }
        v7Var.f38468r.f34918a = yl0Var;
        if (arrayList.indexOf(p7Var) >= 0) {
            PhotoViewer.t1().f2(r7Var.f37017r, arrayList.indexOf(p7Var), -1, false, v7Var.f38468r, null);
        }
    }

    public static void b(v7 v7Var, zh.a aVar, n7 n7Var) {
        boolean z10;
        org.telegram.ui.ActionBar.o2 o2Var = v7Var.d;
        org.telegram.ui.Components.yl0 yl0Var = (org.telegram.ui.Components.yl0) v7Var.h.getCurrentView();
        if (n7Var.e == 2) {
            if (yl0Var.getAdapter() instanceof o7) {
                o7 o7Var = (o7) yl0Var.getAdapter();
                PhotoViewer.t1().J2(null, o2Var, null);
                if (v7Var.f38468r == null) {
                    v7Var.f38468r = new k7(v7Var);
                }
                v7Var.f38468r.f34918a = yl0Var;
                File file = aVar.f49510a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, o2Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    if (aVar.d == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                    PhotoViewer.t1().f2(arrayList, 0, -1, false, v7Var.f38468r, null);
                }
            } else {
                return;
            }
        }
        if (n7Var.e == 3) {
            if (MediaController.getInstance().isPlayingMessage(aVar.f49513f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(aVar.f49513f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(aVar.f49513f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(aVar.f49513f);
        }
    }

    public final void c(int i10, int i11) {
        this.f38469s = i10;
        this.v = i11;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.y81 y81Var = this.h;
            if (i12 < y81Var.getViewPages().length) {
                org.telegram.ui.Components.yl0 yl0Var = (org.telegram.ui.Components.yl0) y81Var.getViewPages()[i12];
                if (yl0Var != null) {
                    yl0Var.setPadding(yl0Var.getPaddingLeft(), i10, yl0Var.getPaddingRight(), i11);
                }
                i12++;
            } else {
                return;
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v7.d():void");
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.y81 y81Var = this.h;
            if (i10 < y81Var.getViewPages().length) {
                AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.yl0) y81Var.getViewPages()[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.yl0 getListView() {
        org.telegram.ui.Components.y81 y81Var = this.h;
        if (y81Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.yl0) y81Var.getCurrentView();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.f38472y);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.f38472y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setCacheModel(zh.b bVar) {
        this.f38466f = bVar;
        d();
    }

    public void setDelegate(l7 l7Var) {
        this.E = l7Var;
    }

    public void setTargetTabsPosition(int i10) {
        this.f38470w = i10;
    }
}
