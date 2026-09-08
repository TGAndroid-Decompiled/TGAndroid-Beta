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
public abstract class s7 extends FrameLayout implements org.telegram.ui.Components.mc0 {
    public final ArrayList f40353a;
    public final org.telegram.ui.Components.h81 f40354b;
    public final View f40355c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final ArrayList f40356e;
    public ai.c f40357f;
    public final org.telegram.ui.Components.i81 h;
    public final r7[] f40358n;
    public h7 f40359r;
    public int f40360s;
    public i7 v;

    public s7(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        this.f40353a = new ArrayList();
        this.f40356e = new ArrayList();
        r7[] r7VarArr = new r7[5];
        this.f40358n = r7VarArr;
        this.d = n2Var;
        r7VarArr[0] = new r7(LocaleController.getString(R.string.FilterChats), 0, new j7(this));
        r7VarArr[1] = new r7(LocaleController.getString(R.string.MediaTab), 1, new o7(this));
        r7VarArr[2] = new r7(LocaleController.getString(R.string.SharedFilesTab2), 2, new l7(this));
        r7VarArr[3] = new r7(LocaleController.getString(R.string.Music), 3, new q7(this));
        int i10 = 0;
        while (true) {
            r7[] r7VarArr2 = this.f40358n;
            if (i10 < r7VarArr2.length) {
                r7 r7Var = r7VarArr2[i10];
                if (r7Var != null) {
                    this.f40356e.add(i10, r7Var);
                }
                i10++;
            } else {
                org.telegram.ui.Components.i81 i81Var = new org.telegram.ui.Components.i81(getContext(), null);
                this.h = i81Var;
                i81Var.setAllowDisallowInterceptTouch(false);
                addView(i81Var, w7.x5.d(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                org.telegram.ui.Components.h81 n10 = i81Var.n(3, true);
                this.f40354b = n10;
                addView(n10, w7.x5.c(48.0f, -1));
                View view = new View(getContext());
                this.f40355c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20691d7, false));
                addView(view, w7.x5.d(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                view.getLayoutParams().height = 1;
                i81Var.setAdapter(new e7(this, context, n2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, w7.x5.c(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(true);
                imageView.setImageDrawable(g2Var);
                int i11 = org.telegram.ui.ActionBar.j6.f21071y8;
                g2Var.a(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                int i12 = org.telegram.ui.ActionBar.j6.f21090z8;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f40353a.add(imageView);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final s7 f34371b;

                    {
                        this.f34371b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f34371b.v.i1();
                                return;
                            default:
                                this.f34371b.v.clear();
                                return;
                        }
                    }
                });
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, true, true);
                q6Var.setTextSize(AndroidUtilities.dp(18.0f));
                q6Var.setTypeface(AndroidUtilities.bold());
                q6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                linearLayout.addView(q6Var, w7.x5.m(1.0f, 0, -1, 18, 0, 0));
                this.f40353a.add(q6Var);
                org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), false, null);
                v0Var.setIcon(R.drawable.msg_clear);
                v0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                v0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(v0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f40353a.add(v0Var);
                v0Var.setOnClickListener(new View.OnClickListener(this) {
                    public final s7 f34371b;

                    {
                        this.f34371b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f34371b.v.i1();
                                return;
                            default:
                                this.f34371b.v.clear();
                                return;
                        }
                    }
                });
                return;
            }
        }
    }

    public static void a(s7 s7Var, m7 m7Var, o7 o7Var, org.telegram.ui.Components.ll0 ll0Var) {
        ArrayList arrayList = o7Var.f36304e;
        PhotoViewer.t1().K2(null, s7Var.d, null);
        if (s7Var.f40359r == null) {
            s7Var.f40359r = new h7(s7Var);
        }
        s7Var.f40359r.f36920a = ll0Var;
        if (arrayList.indexOf(m7Var) >= 0) {
            PhotoViewer.t1().f2(o7Var.f39151r, arrayList.indexOf(m7Var), -1, false, s7Var.f40359r, null);
        }
    }

    public static void b(s7 s7Var, ai.b bVar, k7 k7Var) {
        boolean z10;
        org.telegram.ui.ActionBar.n2 n2Var = s7Var.d;
        org.telegram.ui.Components.ll0 ll0Var = (org.telegram.ui.Components.ll0) s7Var.h.getCurrentView();
        if (k7Var.f37975e == 2) {
            if (ll0Var.getAdapter() instanceof l7) {
                l7 l7Var = (l7) ll0Var.getAdapter();
                PhotoViewer.t1().K2(null, n2Var, null);
                if (s7Var.f40359r == null) {
                    s7Var.f40359r = new h7(s7Var);
                }
                s7Var.f40359r.f36920a = ll0Var;
                File file = bVar.f750a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, n2Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    if (bVar.d == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                    PhotoViewer.t1().f2(arrayList, 0, -1, false, s7Var.f40359r, null);
                }
            } else {
                return;
            }
        }
        if (k7Var.f37975e == 3) {
            if (MediaController.getInstance().isPlayingMessage(bVar.f754f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(bVar.f754f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(bVar.f754f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(bVar.f754f);
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s7.c():void");
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.i81 i81Var = this.h;
            if (i10 < i81Var.getViewPages().length) {
                AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.ll0) i81Var.getViewPages()[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.ll0 getListView() {
        org.telegram.ui.Components.i81 i81Var = this.h;
        if (i81Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.ll0) i81Var.getCurrentView();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setBottomPadding(int i10) {
        this.f40360s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.i81 i81Var = this.h;
            if (i11 < i81Var.getViewPages().length) {
                org.telegram.ui.Components.ll0 ll0Var = (org.telegram.ui.Components.ll0) i81Var.getViewPages()[i11];
                if (ll0Var != null) {
                    ll0Var.setPadding(0, 0, 0, i10);
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public void setCacheModel(ai.c cVar) {
        this.f40357f = cVar;
        c();
    }

    public void setDelegate(i7 i7Var) {
        this.v = i7Var;
    }
}
