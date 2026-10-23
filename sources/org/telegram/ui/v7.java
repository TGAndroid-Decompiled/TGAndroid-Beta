package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public abstract class v7 extends FrameLayout implements org.telegram.ui.ActionBar.b6, org.telegram.ui.Components.hd0 {
    public final org.telegram.ui.ActionBar.h2 f42622a;
    public final ArrayList f42623b;
    public final org.telegram.ui.Components.k91 f42624c;
    public final View d;
    public final org.telegram.ui.ActionBar.o2 e;
    public final ArrayList f42625f;
    public bi.c h;
    public final org.telegram.ui.Components.l91 f42626n;
    public final u7[] f42627r;
    public k7 f42628s;
    public int v;
    public l7 f42629w;

    public v7(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context);
        this.f42623b = new ArrayList();
        this.f42625f = new ArrayList();
        u7[] u7VarArr = new u7[5];
        this.f42627r = u7VarArr;
        this.e = o2Var;
        u7VarArr[0] = new u7(LocaleController.getString(R.string.FilterChats), 0, new m7(this));
        u7VarArr[1] = new u7(LocaleController.getString(R.string.MediaTab), 1, new r7(this));
        u7VarArr[2] = new u7(LocaleController.getString(R.string.SharedFilesTab2), 2, new o7(this));
        u7VarArr[3] = new u7(LocaleController.getString(R.string.Music), 3, new t7(this));
        int i10 = 0;
        while (true) {
            u7[] u7VarArr2 = this.f42627r;
            if (i10 >= u7VarArr2.length) {
                break;
            }
            u7 u7Var = u7VarArr2[i10];
            if (u7Var != null) {
                this.f42625f.add(i10, u7Var);
            }
            i10++;
        }
        org.telegram.ui.Components.l91 l91Var = new org.telegram.ui.Components.l91(getContext(), null);
        this.f42626n = l91Var;
        l91Var.setAllowDisallowInterceptTouch(false);
        addView(l91Var, w7.z5.d(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k91 n10 = l91Var.n(3, true);
        this.f42624c = n10;
        addView(n10, w7.z5.c(48.0f, -1));
        View view = new View(getContext());
        this.d = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d7, view, null);
        addView(view, w7.z5.d(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
        view.getLayoutParams().height = 1;
        l91Var.setAdapter(new h7(this, context, o2Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, w7.z5.c(48.0f, -1));
        AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(true);
        this.f42622a = h2Var;
        imageView.setImageDrawable(h2Var);
        int i11 = org.telegram.ui.ActionBar.k6.f21573y8;
        h2Var.a(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.k6.f21590z8;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, null);
        imageView.setContentDescription(LocaleController.getString(R.string.Close));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.f42623b.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final v7 f36522b;

            {
                this.f36522b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f36522b.f42629w.W0();
                        return;
                    default:
                        this.f36522b.f42629w.clear();
                        return;
                }
            }
        });
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, true, true);
        q6Var.setTextSize(AndroidUtilities.dp(18.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.r6.a0(q6Var, i11, null);
        linearLayout.addView(q6Var, w7.z5.m(1.0f, 0, -1, 18, 0, 0));
        this.f42623b.add(q6Var);
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, org.telegram.ui.ActionBar.k6.x0(null, i12, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false), false, null);
        u0Var.setIcon(R.drawable.msg_clear);
        if (u0Var.getBackground() != null) {
            Drawable background = u0Var.getBackground();
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i12);
            u0Var.setBackground(background);
            org.telegram.ui.ActionBar.r6.k(u0Var, background, null, O2, null);
        }
        if (u0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.r6.t(u0Var.getIconView(), i11, null, PorterDuff.Mode.SRC_IN);
        }
        u0Var.setContentDescription(LocaleController.getString(R.string.Delete));
        u0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(u0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.f42623b.add(u0Var);
        u0Var.setOnClickListener(new View.OnClickListener(this) {
            public final v7 f36522b;

            {
                this.f36522b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f36522b.f42629w.W0();
                        return;
                    default:
                        this.f36522b.f42629w.clear();
                        return;
                }
            }
        });
    }

    public static void a(v7 v7Var, p7 p7Var, r7 r7Var, org.telegram.ui.Components.mm0 mm0Var) {
        ArrayList arrayList = r7Var.e;
        PhotoViewer.u1().M2(null, v7Var.e, null);
        if (v7Var.f42628s == null) {
            v7Var.f42628s = new k7(v7Var);
        }
        v7Var.f42628s.f38839a = mm0Var;
        if (arrayList.indexOf(p7Var) >= 0) {
            PhotoViewer.u1().i2(r7Var.f41036r, arrayList.indexOf(p7Var), -1, false, v7Var.f42628s, null);
        }
    }

    public static void b(v7 v7Var, bi.b bVar, n7 n7Var) {
        org.telegram.ui.ActionBar.o2 o2Var = v7Var.e;
        org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) v7Var.f42626n.getCurrentView();
        if (n7Var.e == 2) {
            if (mm0Var.getAdapter() instanceof o7) {
                o7 o7Var = (o7) mm0Var.getAdapter();
                PhotoViewer.u1().M2(null, o2Var, null);
                if (v7Var.f42628s == null) {
                    v7Var.f42628s = new k7(v7Var);
                }
                v7Var.f42628s.f38839a = mm0Var;
                File file = bVar.f4428a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, o2Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    boolean z10 = true;
                    if (bVar.d != 1) {
                        z10 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                    PhotoViewer.u1().i2(arrayList, 0, -1, false, v7Var.f42628s, null);
                }
            } else {
                return;
            }
        }
        if (n7Var.e == 3) {
            if (MediaController.getInstance().isPlayingMessage(bVar.f4431f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(bVar.f4431f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(bVar.f4431f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(bVar.f4431f);
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v7.c():void");
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.l91 l91Var = this.f42626n;
            if (i10 < l91Var.getViewPages().length) {
                AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.mm0) l91Var.getViewPages()[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.mm0 getListView() {
        org.telegram.ui.Components.l91 l91Var = this.f42626n;
        if (l91Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.mm0) l91Var.getCurrentView();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setBottomPadding(int i10) {
        this.v = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.l91 l91Var = this.f42626n;
            if (i11 < l91Var.getViewPages().length) {
                org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) l91Var.getViewPages()[i11];
                if (mm0Var != null) {
                    mm0Var.setPadding(0, 0, 0, i10);
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public void setCacheModel(bi.c cVar) {
        this.h = cVar;
        c();
    }

    public void setDelegate(l7 l7Var) {
        this.f42629w = l7Var;
    }

    @Override
    public final void updateColors() {
        try {
            this.f42622a.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21573y8, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
