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
public abstract class v7 extends FrameLayout implements org.telegram.ui.Components.xc0 {
    public k7 E;
    public final ArrayList f41577a;
    public final FrameLayout f41578b;
    public final org.telegram.ui.Components.f91 f41579c;
    public final a7 d;
    public final ArrayList f41580e;
    public zh.b f41581f;
    public final org.telegram.ui.Components.g91 h;
    public final t7[] f41582n;
    public j7 f41583r;
    public int f41584s;
    public final org.telegram.ui.Components.aw0 v;
    public int f41585w;
    public boolean f41586x;
    public final g7 f41587y;

    public v7(Context context, a7 a7Var, li.n nVar, org.telegram.ui.Components.aw0 aw0Var) {
        super(context);
        org.telegram.ui.Components.g91 bm0Var;
        float f7;
        this.f41577a = new ArrayList();
        this.f41580e = new ArrayList();
        t7[] t7VarArr = new t7[5];
        this.f41582n = t7VarArr;
        this.f41587y = new g7(this, 0);
        this.d = a7Var;
        this.v = aw0Var;
        if (aw0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        t7VarArr[0] = new t7(LocaleController.getString(R.string.FilterChats), 0, new l7(this));
        t7VarArr[1] = new t7(LocaleController.getString(R.string.MediaTab), 1, new q7(this));
        t7VarArr[2] = new t7(LocaleController.getString(R.string.SharedFilesTab2), 2, new n7(this));
        t7VarArr[3] = new t7(LocaleController.getString(R.string.Music), 3, new s7(this));
        int i10 = 0;
        while (true) {
            t7[] t7VarArr2 = this.f41582n;
            if (i10 >= t7VarArr2.length) {
                break;
            }
            t7 t7Var = t7VarArr2[i10];
            if (t7Var != null) {
                this.f41580e.add(i10, t7Var);
            }
            i10++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41578b = frameLayout;
        if (aw0Var == null) {
            bm0Var = new org.telegram.ui.Components.g91(getContext(), null);
        } else {
            bm0Var = new org.telegram.ui.Components.bm0(context, a7Var.getResourceProvider(), aw0Var);
        }
        this.h = bm0Var;
        bm0Var.setAllowDisallowInterceptTouch(false);
        if (nVar != null) {
            nVar.c(bm0Var);
        }
        if (nVar == null && aw0Var == null) {
            f7 = 48.0f;
        } else {
            f7 = 0.0f;
        }
        addView(bm0Var, w7.z5.d(-1, -1.0f, 48, 0.0f, f7, 0.0f, 0.0f));
        org.telegram.ui.Components.f91 n10 = bm0Var.n(nVar != null ? -2 : 3, true);
        this.f41579c = n10;
        frameLayout.addView(n10, w7.z5.c(48.0f, -1));
        if (nVar != null) {
            frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        }
        addView(frameLayout, w7.z5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        bm0Var.setAdapter(new f7(this, context, nVar, a7Var, aw0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20822d6, false));
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, w7.z5.c(48.0f, -1));
        AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(true);
        imageView.setImageDrawable(g2Var);
        int i11 = org.telegram.ui.ActionBar.i6.f21211y8;
        g2Var.a(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.i6.f21230z8;
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, i12, false), 1, -1));
        imageView.setContentDescription(LocaleController.getString(R.string.Close));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.f41577a.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final v7 f35017b;

            {
                this.f35017b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35017b.E.i();
                        return;
                    default:
                        this.f35017b.E.clear();
                        return;
                }
            }
        });
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, true, true);
        p6Var.setTextSize(AndroidUtilities.dp(18.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        linearLayout.addView(p6Var, w7.z5.m(1.0f, 0, -1, 18, 0, 0));
        this.f41577a.add(p6Var);
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, org.telegram.ui.ActionBar.i6.w0(null, i12, false), org.telegram.ui.ActionBar.i6.w0(null, i11, false), false, null);
        v0Var.setIcon(R.drawable.msg_clear);
        v0Var.setContentDescription(LocaleController.getString(R.string.Delete));
        v0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(v0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.f41577a.add(v0Var);
        v0Var.setOnClickListener(new View.OnClickListener(this) {
            public final v7 f35017b;

            {
                this.f35017b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35017b.E.i();
                        return;
                    default:
                        this.f35017b.E.clear();
                        return;
                }
            }
        });
    }

    public static void a(v7 v7Var, o7 o7Var, q7 q7Var, org.telegram.ui.Components.zl0 zl0Var) {
        ArrayList arrayList = q7Var.f36992e;
        PhotoViewer.t1().K2(null, v7Var.d, null);
        if (v7Var.f41583r == null) {
            v7Var.f41583r = new j7(v7Var);
        }
        v7Var.f41583r.f37595a = zl0Var;
        if (arrayList.indexOf(o7Var) >= 0) {
            PhotoViewer.t1().g2(q7Var.f39637r, arrayList.indexOf(o7Var), -1, false, v7Var.f41583r, null);
        }
    }

    public static void b(v7 v7Var, zh.a aVar, m7 m7Var) {
        boolean z10;
        a7 a7Var = v7Var.d;
        org.telegram.ui.Components.zl0 listView = v7Var.getListView();
        if (m7Var.f38448e == 2) {
            if (listView.getAdapter() instanceof n7) {
                n7 n7Var = (n7) listView.getAdapter();
                PhotoViewer.t1().K2(null, a7Var, null);
                if (v7Var.f41583r == null) {
                    v7Var.f41583r = new j7(v7Var);
                }
                v7Var.f41583r.f37595a = listView;
                File file = aVar.f53556a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, a7Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    if (aVar.d == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                    PhotoViewer.t1().g2(arrayList, 0, -1, false, v7Var.f41583r, null);
                }
            } else {
                return;
            }
        }
        if (m7Var.f38448e == 3) {
            if (MediaController.getInstance().isPlayingMessage(aVar.f53560f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(aVar.f53560f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(aVar.f53560f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(aVar.f53560f);
        }
    }

    public static org.telegram.ui.Components.zl0 c(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof u7) {
            return ((u7) view).f41080a;
        }
        return (org.telegram.ui.Components.zl0) view;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v7.d():void");
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.g91 g91Var = this.h;
            if (i10 < g91Var.getViewPages().length) {
                org.telegram.ui.Components.zl0 c10 = c(g91Var.getViewPages()[i10]);
                if (c10 != null) {
                    AndroidUtilities.updateVisibleRows(c10);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.zl0 getListView() {
        return c(this.h.getCurrentView());
    }

    public org.telegram.ui.Components.g91 getViewPager() {
        return this.h;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.f41587y);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.f41587y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setCacheModel(zh.b bVar) {
        this.f41581f = bVar;
        d();
    }

    public void setDelegate(k7 k7Var) {
        this.E = k7Var;
    }

    public void setTargetTabsPosition(int i10) {
        this.f41585w = i10;
    }
}
