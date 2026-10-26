package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SegmentTree;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class w91 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A0;
    public j91 B0;
    public di.z6 C0;
    public int D0;
    public i91 E;
    public final y5 E0;
    public i91 F;
    public NotificationCenter.ObserversGroup F0;
    public s91 G;
    public PorterDuffColorFilter G0;
    public i91 H;
    public int H0;
    public i91 I;
    public i91 J;
    public i91 K;
    public i91 L;
    public i91 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.po R;
    public v81 S;
    public s4.c0 T;
    public final LruCache U;
    public org.telegram.ui.Components.ak0 V;
    public b91 W;
    public w81 X;
    public v91 Y;
    public kg.g Z;
    public TLRPC.ChatFull f45020a;
    public LinearLayout f45021a0;
    public final long f45022b;
    public final boolean f45023b0;
    public boolean f45024c;
    public final boolean f45025c0;
    public i91 d;
    public final boolean f45026d0;
    public i91 e;
    public long f45027e0;
    public r91 f45028f;
    public long f45029f0;
    public final org.telegram.ui.ActionBar.e2[] f45030g0;
    public i91 h;
    public t81 f45031h0;
    public dc f45032i0;
    public ke f45033j0;
    public View f45034k0;
    public FrameLayout f45035l0;
    public oe.b m0;
    public i91 f45036n;
    public final boolean f45037n0;
    public rg0 f45038o0;
    public FrameLayout f45039p0;
    public qh.b[] f45040q0;
    public i91 f45041r;
    public int f45042r0;
    public i91 f45043s;
    public final SparseIntArray f45044s0;
    public final SparseIntArray f45045t0;
    public final ArrayList f45046u0;
    public i91 v;
    public final ArrayList f45047v0;
    public i91 f45048w;
    public final ArrayList f45049w0;
    public i91 f45050x;
    public final ArrayList f45051x0;
    public i91 f45052y;
    public final ArrayList f45053y0;
    public boolean f45054z0;

    public w91(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.U = new LruCache(50);
        this.f45030g0 = new org.telegram.ui.ActionBar.e2[1];
        this.f45042r0 = -1;
        this.f45044s0 = new SparseIntArray();
        this.f45045t0 = new SparseIntArray();
        this.f45046u0 = new ArrayList();
        this.f45047v0 = new ArrayList();
        this.f45049w0 = new ArrayList();
        this.f45051x0 = new ArrayList();
        this.f45053y0 = new ArrayList();
        this.A0 = true;
        this.E0 = new y5(this, 14);
        long j10 = bundle.getLong("chat_id");
        this.f45022b = j10;
        this.f45023b0 = bundle.getBoolean("is_megagroup", false);
        this.f45025c0 = bundle.getBoolean("start_from_boosts", false);
        this.f45026d0 = bundle.getBoolean("start_from_monetization", false);
        this.f45037n0 = bundle.getBoolean("only_boosts", false);
        this.f45020a = getMessagesController().getChatFull(j10);
    }

    public static void V(w91 w91Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        ?? r15;
        float abs;
        boolean z10;
        float abs2;
        boolean z11;
        float abs3;
        boolean z12;
        float abs4;
        boolean z13;
        ArrayList arrayList3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        float abs5;
        int i10;
        boolean z14;
        float abs6;
        boolean z15;
        float abs7;
        boolean z16;
        int i11;
        ArrayList arrayList4;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        ArrayList arrayList5 = w91Var.N;
        ArrayList arrayList6 = w91Var.O;
        ArrayList arrayList7 = w91Var.f45046u0;
        String str16 = "%";
        int i12 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final i91[] i91VarArr = {e0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), e0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), e0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), e0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), e0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), e0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), e0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), e0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), e0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), e0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), e0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), e0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            i91 i91Var = i91VarArr[2];
            if (i91Var != null) {
                i91Var.f40196n = true;
            }
            ?? obj = new Object();
            ti.e a2 = r91.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            obj.f43072o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            obj.f43073p = (String) a2.f49184b;
            obj.f43074q = (String) a2.f49185c;
            obj.f43075r = ((Boolean) a2.d).booleanValue();
            obj.f43076s = ((Boolean) a2.e).booleanValue();
            ti.e a10 = r91.a(tL_broadcastStats.reactions_per_story);
            obj.f43077t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            obj.f43078u = (String) a10.f49184b;
            obj.v = (String) a10.f49185c;
            obj.f43079w = ((Boolean) a10.d).booleanValue();
            obj.f43080x = ((Boolean) a10.e).booleanValue();
            ti.e a11 = r91.a(tL_broadcastStats.views_per_story);
            obj.f43081y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            obj.f43082z = (String) a11.f49184b;
            obj.A = (String) a11.f49185c;
            obj.B = ((Boolean) a11.d).booleanValue();
            obj.C = ((Boolean) a11.e).booleanValue();
            ti.e a12 = r91.a(tL_broadcastStats.shares_per_story);
            obj.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            obj.E = (String) a12.f49184b;
            obj.F = (String) a12.f49185c;
            obj.G = ((Boolean) a12.d).booleanValue();
            obj.H = ((Boolean) a12.e).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i13 = (int) (d - d10);
            if (d10 == 0.0d) {
                abs5 = 0.0f;
            } else {
                abs5 = Math.abs((i13 / ((float) d10)) * 100.0f);
            }
            obj.f43061a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            obj.f43062b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i13 == 0 || abs5 == 0.0f) {
                i10 = i13;
                obj.f43063c = "";
            } else {
                int i14 = (int) abs5;
                if (abs5 == i14) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    if (i13 <= 0) {
                        str15 = "";
                    } else {
                        str15 = str3;
                    }
                    sb2.append(str15);
                    sb2.append(AndroidUtilities.formatWholeNumber(i13, 0));
                    obj.f43063c = sb2.toString() + " (" + i14 + "%)";
                    i10 = i13;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    if (i13 <= 0) {
                        str14 = "";
                    } else {
                        str14 = str3;
                    }
                    sb3.append(str14);
                    sb3.append(AndroidUtilities.formatWholeNumber(i13, 0));
                    i10 = i13;
                    obj.f43063c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs5), "%");
                }
            }
            if (i10 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            obj.d = z14;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i15 = (int) (d11 - d12);
            if (d12 == 0.0d) {
                abs6 = 0.0f;
            } else {
                abs6 = Math.abs((i15 / ((float) d12)) * 100.0f);
            }
            obj.f43066i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            obj.f43067j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i15 != 0 && abs6 != 0.0f) {
                int i16 = (int) abs6;
                if (abs6 == i16) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    if (i15 <= 0) {
                        str13 = "";
                    } else {
                        str13 = str3;
                    }
                    sb4.append(str13);
                    sb4.append(AndroidUtilities.formatWholeNumber(i15, 0));
                    obj.f43068k = sb4.toString() + " (" + i16 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    if (i15 <= 0) {
                        str12 = "";
                    } else {
                        str12 = str3;
                    }
                    sb5.append(str12);
                    sb5.append(AndroidUtilities.formatWholeNumber(i15, 0));
                    obj.f43068k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f43068k = "";
            }
            if (i15 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.f43069l = z15;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i17 = (int) (d13 - d14);
            if (d14 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i17 / ((float) d14)) * 100.0f);
            }
            obj.e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            obj.f43064f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i17 != 0 && abs7 != 0.0f) {
                int i18 = (int) abs7;
                if (abs7 == i18) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    if (i17 <= 0) {
                        str11 = "";
                    } else {
                        str11 = str3;
                    }
                    sb6.append(str11);
                    sb6.append(AndroidUtilities.formatWholeNumber(i17, 0));
                    obj.f43065g = sb6.toString() + " (" + i18 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    if (i17 <= 0) {
                        str10 = "";
                    } else {
                        str10 = str3;
                    }
                    sb7.append(str10);
                    sb7.append(AndroidUtilities.formatWholeNumber(i17, 0));
                    obj.f43065g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f43065g = "";
            }
            if (i17 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            obj.h = z16;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f43070m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i19 = (int) f7;
            if (f7 == i19) {
                Locale locale7 = Locale.ENGLISH;
                obj.f43071n = a1.g.m(i19, "%");
            } else {
                obj.f43071n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            w91Var.f45028f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            w91Var.f45027e0 = tL_statsDateRangeDays.max_date * 1000;
            w91Var.f45029f0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i22 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i22);
                int i23 = i22 + 1;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                ?? obj2 = new Object();
                obj2.f43705a = postInteractionCounters2;
                int i24 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str9 = str16;
                    i11 = i23;
                    w91Var.f45044s0.put(obj2.b(), i20);
                    i20++;
                } else {
                    i11 = i23;
                    arrayList4 = arrayList8;
                    str9 = str16;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    w91Var.f45049w0.add(obj2);
                    w91Var.f45045t0.put(obj2.b(), i21);
                    i21++;
                }
                arrayList10 = arrayList11;
                str16 = str9;
                i22 = i11;
                arrayList8 = arrayList4;
                size = i24;
            }
            ArrayList arrayList12 = arrayList8;
            str = str16;
            AndroidUtilities.runOnUIThread(new p81(w91Var, arrayList9, 0));
            if (arrayList12.size() > 0) {
                w91Var.getMessagesStorage().getMessages(-w91Var.f45022b, 0L, false, arrayList12.size(), ((t91) arrayList12.get(0)).b(), 0, 0, w91Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            r15 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(w91Var) {
                public final w91 f42767b;

                {
                    this.f42767b = w91Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            w91 w91Var2 = this.f42767b;
                            w91Var2.getClass();
                            i91[] i91VarArr2 = i91VarArr;
                            w91Var2.f45041r = i91VarArr2[0];
                            w91Var2.h = i91VarArr2[1];
                            w91Var2.e = i91VarArr2[2];
                            w91Var2.f45036n = i91VarArr2[3];
                            w91Var2.d = i91VarArr2[4];
                            w91Var2.f45043s = i91VarArr2[5];
                            w91Var2.v = i91VarArr2[6];
                            w91Var2.f45048w = i91VarArr2[7];
                            w91Var2.f45050x = i91VarArr2[8];
                            w91Var2.f45052y = i91VarArr2[9];
                            w91Var2.E = i91VarArr2[10];
                            w91Var2.F = i91VarArr2[11];
                            w91Var2.f0(i91VarArr2);
                            return;
                        default:
                            w91 w91Var3 = this.f42767b;
                            w91Var3.getClass();
                            i91[] i91VarArr3 = i91VarArr;
                            w91Var3.d = i91VarArr3[0];
                            w91Var3.H = i91VarArr3[1];
                            w91Var3.I = i91VarArr3[2];
                            w91Var3.J = i91VarArr3[3];
                            w91Var3.K = i91VarArr3[4];
                            w91Var3.L = i91VarArr3[5];
                            w91Var3.e = i91VarArr3[6];
                            w91Var3.M = i91VarArr3[7];
                            w91Var3.f0(i91VarArr3);
                            return;
                    }
                }
            });
        } else {
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            str = "%";
            str2 = "TopHoursChartTitle";
            str3 = "+";
            r15 = 0;
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            i91 e02 = e0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), r15, r15);
            i91 e03 = e0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), r15, r15);
            i91 e04 = e0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, r15);
            i91 e05 = e0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true);
            i91 e06 = e0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, r15);
            i91 e07 = e0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, r15);
            i91 e08 = e0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), r15, r15);
            i91 e09 = e0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, r15);
            final i91[] i91VarArr2 = new i91[8];
            i91VarArr2[r15] = e02;
            i91VarArr2[1] = e03;
            i91VarArr2[2] = e04;
            i91VarArr2[3] = e05;
            i91VarArr2[4] = e06;
            i91VarArr2[5] = e07;
            i91VarArr2[6] = e08;
            i91VarArr2[7] = e09;
            i91 i91Var2 = i91VarArr2[6];
            if (i91Var2 != null) {
                i91Var2.f40196n = true;
            }
            i91 i91Var3 = i91VarArr2[7];
            if (i91Var3 != null) {
                i91Var3.f40197o = true;
            }
            ?? obj3 = new Object();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i25 = (int) (d15 - d16);
            if (d16 == 0.0d) {
                abs = 0.0f;
            } else {
                abs = Math.abs((i25 / ((float) d16)) * 100.0f);
            }
            obj3.f43420a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            obj3.f43421b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i25 != 0 && abs != 0.0f) {
                int i26 = (int) abs;
                if (abs == i26) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    if (i25 <= 0) {
                        str8 = "";
                    } else {
                        str8 = str3;
                    }
                    sb8.append(str8);
                    sb8.append(AndroidUtilities.formatWholeNumber(i25, 0));
                    obj3.f43422c = sb8.toString() + " (" + i26 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    if (i25 <= 0) {
                        str7 = "";
                    } else {
                        str7 = str3;
                    }
                    sb9.append(str7);
                    sb9.append(AndroidUtilities.formatWholeNumber(i25, 0));
                    obj3.f43422c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs), str);
                }
            } else {
                obj3.f43422c = "";
            }
            if (i25 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj3.d = z10;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i27 = (int) (d17 - d18);
            if (d18 == 0.0d) {
                abs2 = 0.0f;
            } else {
                abs2 = Math.abs((i27 / ((float) d18)) * 100.0f);
            }
            obj3.f43425i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            obj3.f43426j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i27 != 0 && abs2 != 0.0f) {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                if (i27 <= 0) {
                    str6 = "";
                } else {
                    str6 = str3;
                }
                sb10.append(str6);
                sb10.append(AndroidUtilities.formatWholeNumber(i27, 0));
                obj3.f43427k = sb10.toString();
            } else {
                obj3.f43427k = "";
            }
            if (i27 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f43428l = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i28 = (int) (d19 - d20);
            if (d20 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i28 / ((float) d20)) * 100.0f);
            }
            obj3.f43429m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            obj3.f43430n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i28 != 0 && abs3 != 0.0f) {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                if (i28 <= 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                sb11.append(str5);
                sb11.append(AndroidUtilities.formatWholeNumber(i28, 0));
                obj3.f43431o = sb11.toString();
            } else {
                obj3.f43431o = "";
            }
            if (i28 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.f43432p = z12;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i29 = (int) (d21 - d22);
            if (d22 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i29 / ((float) d22)) * 100.0f);
            }
            obj3.e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            obj3.f43423f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i29 != 0 && abs4 != 0.0f) {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                if (i29 <= 0) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                sb12.append(str4);
                sb12.append(AndroidUtilities.formatWholeNumber(i29, 0));
                obj3.f43424g = sb12.toString();
            } else {
                obj3.f43424g = "";
            }
            if (i29 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj3.h = z13;
            w91Var.G = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            w91Var.f45027e0 = tL_statsDateRangeDays2.max_date * 1000;
            w91Var.f45029f0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i30 = 0;
                while (i30 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i30);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f42411a = p91.a(tL_statsGroupTopPoster.user_id, arrayList14);
                    StringBuilder sb13 = new StringBuilder();
                    int i31 = tL_statsGroupTopPoster.messages;
                    if (i31 > 0) {
                        sb13.append(LocaleController.formatPluralString("messages", i31, new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster.avg_chars, new Object[0])));
                    }
                    obj4.f42412b = sb13.toString();
                    int i32 = i12;
                    if (arrayList2.size() < i32) {
                        arrayList3 = arrayList2;
                        arrayList3.add(obj4);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(obj4);
                    i30++;
                    arrayList2 = arrayList3;
                    i12 = i32;
                    arrayList = arrayList15;
                }
                ArrayList arrayList16 = arrayList;
                ArrayList arrayList17 = arrayList2;
                if (arrayList16.size() - arrayList17.size() < 2) {
                    arrayList17.clear();
                    arrayList17.addAll(arrayList16);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopAdmin> arrayList18 = tL_megagroupStats.top_admins;
            if (arrayList18 != null && !arrayList18.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_admins.size(); i33++) {
                    ArrayList arrayList19 = w91Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i33);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f42411a = p91.a(tL_statsGroupTopAdmin.user_id, arrayList20);
                    StringBuilder sb14 = new StringBuilder();
                    int i34 = tL_statsGroupTopAdmin.deleted;
                    if (i34 > 0) {
                        sb14.append(LocaleController.formatPluralString("Deletions", i34, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(LocaleController.formatPluralString("Bans", tL_statsGroupTopAdmin.banned, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(LocaleController.formatPluralString("Restrictions", tL_statsGroupTopAdmin.kicked, new Object[0]));
                    }
                    obj5.f42412b = sb14.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i35 = 0; i35 < tL_megagroupStats.top_inviters.size(); i35++) {
                    ArrayList arrayList22 = w91Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i35);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f42411a = p91.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i36 = tL_statsGroupTopInviter.invitations;
                    if (i36 > 0) {
                        obj6.f42412b = LocaleController.formatPluralString("Invitations", i36, new Object[0]);
                    } else {
                        obj6.f42412b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable(w91Var) {
                public final w91 f42767b;

                {
                    this.f42767b = w91Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            w91 w91Var2 = this.f42767b;
                            w91Var2.getClass();
                            i91[] i91VarArr22 = i91VarArr2;
                            w91Var2.f45041r = i91VarArr22[0];
                            w91Var2.h = i91VarArr22[1];
                            w91Var2.e = i91VarArr22[2];
                            w91Var2.f45036n = i91VarArr22[3];
                            w91Var2.d = i91VarArr22[4];
                            w91Var2.f45043s = i91VarArr22[5];
                            w91Var2.v = i91VarArr22[6];
                            w91Var2.f45048w = i91VarArr22[7];
                            w91Var2.f45050x = i91VarArr22[8];
                            w91Var2.f45052y = i91VarArr22[9];
                            w91Var2.E = i91VarArr22[10];
                            w91Var2.F = i91VarArr22[11];
                            w91Var2.f0(i91VarArr22);
                            return;
                        default:
                            w91 w91Var3 = this.f42767b;
                            w91Var3.getClass();
                            i91[] i91VarArr3 = i91VarArr2;
                            w91Var3.d = i91VarArr3[0];
                            w91Var3.H = i91VarArr3[1];
                            w91Var3.I = i91VarArr3[2];
                            w91Var3.J = i91VarArr3[3];
                            w91Var3.K = i91VarArr3[4];
                            w91Var3.L = i91VarArr3[5];
                            w91Var3.e = i91VarArr3[6];
                            w91Var3.M = i91VarArr3[7];
                            w91Var3.f0(i91VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void W(w91 w91Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(w91Var.currentAccount, arrayList2.get(i10), false, true));
            }
            w91Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new p81(w91Var, arrayList, 1));
    }

    public static void Y(w91 w91Var) {
        v91 v91Var = w91Var.Y;
        if (v91Var != null) {
            v91Var.f44750b = true;
        }
        int childCount = w91Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = w91Var.S.getChildAt(i10);
            if (childAt instanceof h91) {
                ((h91) childAt).f39572b.f16618t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.r2 c0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f22027id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f22027id);
        if (chatFull != null && (chatFull.can_view_stats || chatFull.can_view_stars_revenue)) {
            return new w91(bundle);
        }
        return new x5(-chat.f22027id);
    }

    public static lg.b d0(JSONObject jSONObject, int i10, boolean z10) {
        if (i10 == 0) {
            return new lg.b(jSONObject);
        }
        if (i10 == 1) {
            return new lg.b(jSONObject);
        }
        if (i10 == 2) {
            ?? bVar = new lg.b(jSONObject);
            int length = ((lg.a) bVar.d.get(0)).f17005a.length;
            int size = bVar.d.size();
            bVar.f17020l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                bVar.f17020l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = bVar.f17020l;
                    jArr[i11] = jArr[i11] + ((lg.a) bVar.d.get(i12)).f17005a[i11];
                }
            }
            bVar.f17021m = new SegmentTree(bVar.f17020l);
            return bVar;
        } else if (i10 == 4) {
            ?? bVar2 = new lg.b(jSONObject);
            if (z10) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j10 = 0;
                for (int i13 = 0; i13 < bVar2.d.size(); i13++) {
                    int length2 = bVar2.f17011a.length;
                    for (int i14 = 0; i14 < length2; i14++) {
                        long j11 = ((lg.a) bVar2.d.get(i13)).f17005a[i14];
                        jArr2[i13] = jArr2[i13] + j11;
                        if (j11 == 0) {
                            iArr[i13] = iArr[i13] + 1;
                        }
                    }
                    j10 += jArr2[i13];
                }
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < bVar2.d.size(); i15++) {
                    if (jArr2[i15] / j10 < 0.01d && iArr[i15] > bVar2.f17011a.length / 2.0f) {
                        arrayList.add((lg.a) bVar2.d.get(i15));
                    }
                }
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    bVar2.d.remove((lg.a) obj);
                }
            }
            int length3 = ((lg.a) bVar2.d.get(0)).f17005a.length;
            int size3 = bVar2.d.size();
            bVar2.f17022l = new long[length3];
            for (int i17 = 0; i17 < length3; i17++) {
                bVar2.f17022l[i17] = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    long[] jArr3 = bVar2.f17022l;
                    jArr3[i17] = jArr3[i17] + ((lg.a) bVar2.d.get(i18)).f17005a[i17];
                }
            }
            new SegmentTree(bVar2.f17022l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static i91 e0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        i91 i91Var = new i91(str, i10);
        i91Var.f40195m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                lg.b d02 = d0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                i91Var.d = d02;
                if (d02 != null) {
                    d02.h = statsGraph.rate;
                }
                i91Var.f40190g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (d02 == null || (jArr2 = d02.f17011a) == null || jArr2.length < 2) {
                    i91Var.f40194l = true;
                }
                if (i10 == 4 && d02 != null && (jArr = d02.f17011a) != null && jArr.length > 0) {
                    long j10 = jArr[jArr.length - 1];
                    i91Var.e = new lg.e(d02, j10);
                    i91Var.f40188c = j10;
                    return i91Var;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            i91Var.f40189f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return i91Var;
    }

    public static void j0(i91 i91Var, ArrayList arrayList, org.telegram.ui.ActionBar.g7 g7Var) {
        lg.b bVar;
        int i10;
        if (i91Var != null && (bVar = i91Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                lg.a aVar = (lg.a) obj;
                int i12 = aVar.f17009g;
                if (i12 >= 0) {
                    if (!org.telegram.ui.ActionBar.y6.e1(i12)) {
                        int i13 = aVar.f17009g;
                        if (org.telegram.ui.ActionBar.y6.I == org.telegram.ui.ActionBar.y6.J) {
                            i10 = aVar.f17010i;
                        } else {
                            i10 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.y6.x1(i13, i10, false);
                        org.telegram.ui.ActionBar.y6.ql[aVar.f17009g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, aVar.f17009g));
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23581p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23673u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23520m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.rj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23731x6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23318b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23767z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23427h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.dj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.cj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.bj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.aj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23464j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
    }

    public final void b0() {
        int i10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.f45034k0 != null) {
            int dp = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f13451b;
            ViewGroup.LayoutParams layoutParams = this.f45034k0.getLayoutParams();
            if (layoutParams.height != dp) {
                layoutParams.height = dp;
                this.f45034k0.setLayoutParams(layoutParams);
            }
            p0();
        }
        if (this.f45024c) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        AndroidUtilities.setViewLayoutMargins(this.R.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(42.0f)) / 2) + this.mSystemInsets.f13451b, AndroidUtilities.dp(6.0f), 0);
        this.f45039p0.setPadding(0, 0, 0, this.mSystemInsets.d);
        v81 v81Var = this.S;
        if (v81Var != null) {
            i0.b bVar = this.mSystemInsets;
            oi.a.d(v81Var, bVar.f13451b, bVar.d, currentActionBarHeight, i10);
        }
        dc dcVar = this.f45032i0;
        if (dcVar != null) {
            org.telegram.ui.Components.mm0 mm0Var = dcVar.F;
            i0.b bVar2 = this.mSystemInsets;
            oi.a.d(mm0Var, bVar2.f13451b, bVar2.d, currentActionBarHeight, i10);
        }
        ke keVar = this.f45033j0;
        if (keVar != null) {
            i0.b bVar3 = this.mSystemInsets;
            int i11 = bVar3.f13451b;
            int i12 = bVar3.d;
            keVar.U0 = i11;
            keVar.V0 = i12;
            keVar.W0 = i10;
            int g7 = d3.g(48.0f, i11, -AndroidUtilities.dp(8.0f));
            int g10 = d3.g(48.0f, i12, -AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.r71 r71Var = keVar.X0;
            AndroidUtilities.setViewLayoutMargins(r71Var, 0, g7, 0, g10);
            r71Var.setPadding(r71Var.getPaddingLeft(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) - g7, r71Var.getPaddingRight(), (i12 + i10) - g10);
            keVar.z(-g7, -g10);
            keVar.B();
            keVar.requestLayout();
            keVar.invalidate();
        }
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        boolean z11;
        FrameLayout frameLayout;
        int i10;
        boolean z12;
        int i11;
        String str;
        boolean z13;
        w91 w91Var = this;
        w91Var.setHasOwnBackground(true);
        w91Var.Z = new kg.g(null);
        MessagesController messagesController = MessagesController.getInstance(w91Var.currentAccount);
        long j10 = w91Var.f45022b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(w91Var.currentAccount).getChatFull(j10);
        if (chatFull != null && chatFull.can_view_stats) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isBoostSupported = ChatObject.isBoostSupported(chat);
        if (chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue)) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(qh.b.c(context, w91Var.resourceProvider, qh.a.I, R.string.Statistics));
        }
        arrayList.add(qh.b.c(context, w91Var.resourceProvider, qh.a.BOOSTS, R.string.Boosts));
        if (z11) {
            arrayList.add(qh.b.c(context, w91Var.resourceProvider, qh.a.MONETIZATION, R.string.Monetization));
        }
        w91Var.f45040q0 = (qh.b[]) arrayList.toArray(new qh.b[0]);
        rg0 rg0Var = new rg0(context, w91Var.resourceProvider);
        w91Var.f45038o0 = rg0Var;
        rg0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        w91Var.f45038o0.setMaxWidth(AndroidUtilities.dp(344.0f));
        w91Var.f45038o0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        w91Var.f45039p0 = frameLayout2;
        frameLayout2.setOnClickListener(new bh.f(22));
        w91Var.f45039p0.addView(w91Var.f45038o0, org.telegram.ui.Components.gb1.i(-1, 72, 81));
        w91Var.f45039p0.setClipToPadding(false);
        int i12 = 0;
        while (true) {
            qh.b[] bVarArr = w91Var.f45040q0;
            if (i12 >= bVarArr.length) {
                break;
            }
            qh.b bVar = bVarArr[i12];
            bVar.setOnClickListener(new zv0(w91Var, i12, 2));
            w91Var.f45038o0.addView(w91Var.f45040q0[i12]);
            w91Var.f45038o0.i(bVar, true, false);
            i12++;
        }
        w91Var.f45031h0 = new t81(w91Var, w91Var.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (isBoostSupported) {
            dc dcVar = new dc(w91Var, -j10, w91Var.getResourceProvider());
            w91Var.f45032i0 = dcVar;
            dcVar.F.setCaptureSectionsDecoratorAllowed(true);
            w91Var.glassEngine.b(w91Var.f45032i0.F);
        }
        if (z11) {
            Activity parentActivity = w91Var.getParentActivity();
            int i13 = w91Var.currentAccount;
            long j11 = -j10;
            frameLayout = frameLayout3;
            org.telegram.ui.ActionBar.u6 resourceProvider = w91Var.getResourceProvider();
            oi.q qVar = w91Var.glassEngine;
            if (ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue) {
                z13 = true;
            } else {
                z13 = false;
            }
            i10 = -1;
            ke keVar = new ke(parentActivity, w91Var, i13, j11, resourceProvider, qVar, z13, chatFull.can_view_stars_revenue);
            w91Var = w91Var;
            w91Var.f45033j0 = keVar;
            keVar.X0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i10 = -1;
        }
        boolean z14 = z10;
        FrameLayout frameLayout4 = frameLayout;
        w91Var.f45031h0.setAdapter(new u81(w91Var, z14, isBoostSupported, z11, frameLayout4));
        boolean z15 = w91Var.f45037n0;
        if (isBoostSupported && !z15) {
            z12 = true;
        } else {
            z12 = false;
        }
        w91Var.f45024c = z12;
        if (z12 && w91Var.f45025c0) {
            w91Var.f45031h0.setPosition(z14 ? 1 : 0);
        } else if (z12 && w91Var.f45026d0) {
            t81 t81Var = w91Var.f45031h0;
            if (!z15 && isBoostSupported) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            t81Var.setPosition(i11 + (z14 ? 1 : 0));
        }
        w91Var.l0(w91Var.f45031h0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(w91Var.getParentActivity());
        frameLayout5.addView(w91Var.f45031h0, org.telegram.ui.Components.gb1.k());
        View view = new View(context);
        w91Var.f45034k0 = view;
        frameLayout5.addView(view, org.telegram.ui.Components.gb1.i(i10, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        w91Var.f45035l0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(w91Var.f45035l0, org.telegram.ui.Components.gb1.k());
        frameLayout5.addView(w91Var.simpleActionBar);
        if (w91Var.f45024c) {
            w91Var.setBulletinDelegate(new fi.k8(11));
            w91Var.f45039p0.setBackground(w91Var.getBaseSimpleGlass().b(w91Var.f45039p0));
            frameLayout5.addView(w91Var.f45039p0, org.telegram.ui.Components.gb1.i(i10, -2, 80));
        }
        w91Var.fragmentView = frameLayout5;
        v81 v81Var = new v81(w91Var, context);
        w91Var.S = v81Var;
        v81Var.setCaptureSectionsDecoratorAllowed(true);
        w91Var.S.setSections(true);
        w91Var.S.setClipToPadding(false);
        w91Var.glassEngine.b(w91Var.S);
        w91Var.S.u1();
        LinearLayout linearLayout = new LinearLayout(context);
        w91Var.f45021a0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        w91Var.V = imageView;
        imageView.setAutoRepeat(true);
        w91Var.V.f(R.raw.statistic_preload, 120, 120, null);
        w91Var.V.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i14 = org.telegram.ui.ActionBar.y6.Oi;
        org.telegram.ui.ActionBar.f7.V(textView, i14, null);
        textView.setTag(Integer.valueOf(i14));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i15 = org.telegram.ui.ActionBar.y6.Pi;
        org.telegram.ui.ActionBar.f7.V(textView2, i15, null);
        textView2.setTag(Integer.valueOf(i15));
        org.telegram.messenger.vh.k(R.string.LoadingStatsDescription, textView2, 1);
        w91Var.f45021a0.addView(w91Var.V, org.telegram.ui.Components.gb1.x(120, 120, 1, 0, 0, 0, 20));
        w91Var.f45021a0.addView(textView, org.telegram.ui.Components.gb1.x(-2, -2, 1, 0, 0, 0, 10));
        w91Var.f45021a0.addView(textView2, org.telegram.ui.Components.gb1.u(-2, -2, 1));
        frameLayout4.addView(w91Var.f45021a0, org.telegram.ui.Components.gb1.h(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (w91Var.W == null) {
            w91Var.W = new b91(w91Var);
        }
        w91Var.S.setAdapter(w91Var.W);
        s4.c0 c0Var = new s4.c0();
        w91Var.T = c0Var;
        w91Var.S.setLayoutManager(c0Var);
        w91Var.X = new s4.l();
        w91Var.S.setItemAnimator(null);
        w91Var.S.j(new x81(w91Var, 0));
        w91Var.S.setOnItemClickListener(new m11(w91Var, 7));
        w91Var.S.setOnItemLongClickListener(new s81(w91Var));
        frameLayout4.addView(w91Var.S);
        w91Var.R = new org.telegram.ui.Components.po(context, null, false, null);
        TLRPC.Chat chat2 = w91Var.getMessagesController().getChat(Long.valueOf(j10));
        w91Var.R.setChatAvatar(chat2);
        w91Var.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        org.telegram.ui.ActionBar.r5 r5Var = w91Var.simpleActionBar;
        if (chat2 == null) {
            str = "";
        } else {
            str = chat2.title;
        }
        r5Var.setTitle(str);
        w91Var.simpleActionBar.setActionBarMenuOnItemClick(new p11(w91Var, 8));
        w91Var.R.i(org.telegram.ui.ActionBar.y6.x0(null, i14, false), org.telegram.ui.ActionBar.y6.x0(null, i15, false));
        boolean z16 = w91Var.A0;
        y5 y5Var = w91Var.E0;
        if (z16) {
            w91Var.f45021a0.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(y5Var, 500L);
            w91Var.f45021a0.setVisibility(0);
            w91Var.S.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(y5Var);
            w91Var.f45021a0.setVisibility(8);
            w91Var.S.setVisibility(0);
        }
        eh.d c10 = w91Var.getBaseSimpleGlass().f19421c.c(w91Var.f45038o0, gh.c.f(w91Var.resourceProvider), false);
        org.telegram.messenger.vh.s(c10, AndroidUtilities.dp(28.0f), 7.666f);
        w91Var.f45038o0.setBackground(c10);
        w91Var.glassEngine.c(w91Var.f45031h0);
        oi.a baseSimpleGlass = w91Var.getBaseSimpleGlass();
        t81 t81Var2 = w91Var.f45031h0;
        org.telegram.ui.ActionBar.r5 r5Var2 = w91Var.simpleActionBar;
        org.telegram.ui.ActionBar.u6 u6Var = w91Var.resourceProvider;
        baseSimpleGlass.f19423g = frameLayout5;
        baseSimpleGlass.h = t81Var2;
        baseSimpleGlass.f19419a.c(t81Var2);
        baseSimpleGlass.f(frameLayout5, r5Var2, u6Var);
        w91Var.m0 = new oe.b(0, new s81(w91Var), org.telegram.ui.Components.ds.h, 380L, false);
        ke keVar2 = w91Var.f45033j0;
        if (keVar2 != null) {
            oi.a baseSimpleGlass2 = w91Var.getBaseSimpleGlass();
            View view2 = keVar2.f40893a1.d;
            eh.d c11 = baseSimpleGlass2.f19421c.c(view2, null, false);
            c11.v(gh.c.m(keVar2.f40905n0));
            c11.w(AndroidUtilities.dp(9.66f));
            c11.x(AndroidUtilities.dp(18.0f));
            view2.setBackground(c11);
            View transactionTabs = w91Var.f45033j0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            AndroidUtilities.removeFromParent(transactionTabs);
            w91Var.f45035l0.addView(transactionTabs, layoutParams);
            w91Var.f45033j0.setTabsPinnedChangedListener(new my0(w91Var, 21));
            w91Var.m0.a(w91Var.f45033j0.f30310e0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new vk(w91Var, 1));
        w91Var.getBaseSimpleGlass().f19424i = new tv(w91Var, frameLayout5, new e6(1, frameLayout5), 1);
        w91Var.getBaseSimpleGlass().h = null;
        w91Var.simpleActionBar.setBackground(null);
        w91Var.f45034k0.setBackground(w91Var.getBaseSimpleGlass().a(w91Var.f45034k0));
        AndroidUtilities.removeFromParent(w91Var.R.e);
        frameLayout5.addView(w91Var.R.e, org.telegram.ui.Components.gb1.i(42, 42, 53));
        w91Var.b0();
        w91Var.fragmentView.setBackgroundColor(w91Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23299a7));
        w91Var.B0 = new j91(w91Var.W, w91Var.T);
        return w91Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.r2 r2Var;
        org.telegram.ui.ActionBar.r2 r2Var2;
        org.telegram.ui.ActionBar.r2 r2Var3 = null;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((di.z6) objArr[0]) == this.C0) {
                i0();
                n0();
                if (this.W != null) {
                    this.S.setItemAnimator(null);
                    this.B0.f();
                }
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    r2Var = (org.telegram.ui.ActionBar.r2) org.telegram.ui.Components.b10.h(2, fragmentStack);
                } else {
                    r2Var = null;
                }
                if (r2Var instanceof mo) {
                    ((ActionBarLayout) getParentLayout()).c0(r2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    r2Var2 = (org.telegram.ui.ActionBar.r2) org.telegram.ui.Components.b10.h(2, fragmentStack2);
                } else {
                    r2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        r2Var3 = (org.telegram.ui.ActionBar.r2) org.telegram.ui.Components.b10.h(3, fragmentStack2);
                    }
                    if (r2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).c0(r2Var2, false);
                    }
                    finishFragment();
                    if (r2Var3 instanceof un) {
                        vg.j.f(r2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (r2Var2 instanceof ProfileActivity) {
                    vg.j.f(r2Var2, chat, false);
                }
            }
        } else if (i10 == NotificationCenter.messagesDidLoad) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i13 = 0;
                while (true) {
                    arrayList = this.f45046u0;
                    if (i13 >= size) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                    int i14 = this.f45044s0.get(messageObject.getId(), -1);
                    if (i14 >= 0 && ((t91) arrayList.get(i14)).b() == messageObject.getId()) {
                        if (messageObject.deleted) {
                            arrayList3.add((t91) arrayList.get(i14));
                        } else {
                            ((t91) arrayList.get(i14)).f43706b = messageObject;
                        }
                    }
                    i13++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f45047v0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    t91 t91Var = (t91) arrayList.get(i12);
                    if (t91Var.f43706b == null) {
                        this.f45042r0 = t91Var.b();
                        break;
                    } else {
                        arrayList4.add(t91Var);
                        i12++;
                    }
                }
                if (arrayList4.size() < 20) {
                    g0();
                }
                n0();
                if (this.W != null) {
                    this.S.setItemAnimator(null);
                    this.B0.f();
                }
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22028id == this.f45022b && this.f45020a == null) {
                this.f45020a = chatFull;
                h0();
            }
        }
    }

    public final void f0(i91[] i91VarArr) {
        b91 b91Var = this.W;
        if (b91Var != null) {
            b91Var.E();
            this.S.setItemAnimator(null);
            this.W.l();
        }
        this.A0 = false;
        LinearLayout linearLayout = this.f45021a0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            AndroidUtilities.cancelRunOnUIThread(this.E0);
            this.f45021a0.animate().alpha(0.0f).setDuration(230L).setListener(new i50(this, 29));
            this.S.setVisibility(0);
            this.S.setAlpha(0.0f);
            this.S.animate().alpha(1.0f).setDuration(230L).start();
            for (i91 i91Var : i91VarArr) {
                if (i91Var != null && i91Var.d == null && i91Var.f40189f != null) {
                    i91Var.a(this.currentAccount, this.classGuid, this.f45020a.stats_dc, new qh(2, this, i91Var));
                }
            }
        }
    }

    public final void g0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f22065id = new ArrayList<>();
        ArrayList arrayList = this.f45046u0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.f45044s0.get(this.f45042r0); i11 < size; i11++) {
            if (((t91) arrayList.get(i11)).f43706b == null) {
                tL_channels_getMessages.f22065id.add(Integer.valueOf(((t91) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.f45022b);
        this.f45054z0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new o81(this, 0));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        i91 i91Var;
        i91 i91Var2;
        j6 j6Var = new j6(22, this);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.S, 0, new Class[]{mg.c.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23464j5));
        if (this.f45023b0) {
            while (i10 < 6) {
                if (i10 == 0) {
                    i91Var2 = this.d;
                } else if (i10 == 1) {
                    i91Var2 = this.H;
                } else if (i10 == 2) {
                    i91Var2 = this.I;
                } else if (i10 == 3) {
                    i91Var2 = this.J;
                } else if (i10 == 4) {
                    i91Var2 = this.K;
                } else {
                    i91Var2 = this.L;
                }
                j0(i91Var2, arrayList, j6Var);
                i10++;
            }
        } else {
            while (i10 < 12) {
                if (i10 == 0) {
                    i91Var = this.d;
                } else if (i10 == 1) {
                    i91Var = this.h;
                } else if (i10 == 2) {
                    i91Var = this.f45036n;
                } else if (i10 == 3) {
                    i91Var = this.f45041r;
                } else if (i10 == 4) {
                    i91Var = this.f45043s;
                } else if (i10 == 5) {
                    i91Var = this.v;
                } else if (i10 == 6) {
                    i91Var = this.f45050x;
                } else if (i10 == 7) {
                    i91Var = this.e;
                } else if (i10 == 8) {
                    i91Var = this.f45048w;
                } else if (i10 == 9) {
                    i91Var = this.f45052y;
                } else if (i10 == 10) {
                    i91Var = this.E;
                } else {
                    i91Var = this.F;
                }
                j0(i91Var, arrayList, j6Var);
                i10++;
            }
        }
        return arrayList;
    }

    public final void h0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f45037n0) {
            return;
        }
        boolean z10 = this.f45023b0;
        long j10 = this.f45022b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new o81(this, 1), null, null, 0, this.f45020a.stats_dc, 1, true), this.classGuid);
    }

    public final void i0() {
        ArrayList arrayList = this.f45051x0;
        arrayList.clear();
        ArrayList arrayList2 = this.f45049w0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            t91 t91Var = (t91) obj;
            MessageObject f7 = this.C0.f(t91Var.b());
            if (f7 != null) {
                t91Var.f43706b = f7;
                arrayList.add(t91Var);
            }
        }
        this.f45045t0.clear();
        arrayList2.clear();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23356d6, false)) <= 0.699999988079071d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        t81 t81Var;
        if (motionEvent != null && this.f45033j0 != null && (t81Var = this.f45031h0) != null) {
            View currentView = t81Var.getCurrentView();
            ke keVar = this.f45033j0;
            if (currentView == keVar && keVar.G((motionEvent.getX() - this.f45031h0.getX()) - this.f45033j0.getX(), (motionEvent.getY() - this.f45031h0.getY()) - this.f45033j0.getY())) {
                return false;
            }
        }
        t81 t81Var2 = this.f45031h0;
        if (t81Var2 != null && (t81Var2.f33317b != 0 || t81Var2.f33318c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void k0(View view) {
        if (view instanceof h91) {
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.f7) && !this.S.b1()) {
            Drawable background = view.getBackground();
            if (background instanceof org.telegram.ui.Components.ar) {
                org.telegram.ui.Components.ar arVar = (org.telegram.ui.Components.ar) background;
                if ((arVar.f26592a instanceof ColorDrawable) && arVar.f26593b != null) {
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23318b7, false);
                    if (this.G0 == null || this.H0 != x02) {
                        this.H0 = x02;
                        this.G0 = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
                    }
                    ((ColorDrawable) arVar.f26592a).setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23299a7, false));
                    arVar.f26593b.setColorFilter(this.G0);
                    view.invalidate();
                    return;
                }
            }
            org.telegram.ui.Components.ar arVar2 = new org.telegram.ui.Components.ar(new ColorDrawable(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23299a7, false)), org.telegram.ui.ActionBar.y6.X0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.y6.f23318b7), 0, 0);
            arVar2.f26599w = true;
            view.setBackground(arVar2);
        } else if (view instanceof mg.c) {
            ((mg.c) view).a();
        }
    }

    public final void l0(int i10, boolean z10) {
        boolean z11;
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr = this.f45040q0;
            if (i11 < bVarArr.length) {
                qh.b bVar = bVarArr[i11];
                if (i11 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.f(z11, z10);
                i11++;
            } else {
                return;
            }
        }
    }

    public final void m0(float f7, boolean z10) {
        for (int i10 = 0; i10 < this.f45040q0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            qh.b bVar = this.f45040q0[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.f45038o0.invalidate();
    }

    public final void n0() {
        ArrayList arrayList = this.f45053y0;
        arrayList.clear();
        arrayList.addAll(this.f45047v0);
        arrayList.addAll(this.f45051x0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.ui.Components.v0(1))));
    }

    public final void o0() {
        v81 v81Var = this.S;
        if (v81Var != null) {
            int childCount = v81Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                k0(this.S.getChildAt(i10));
            }
            int hiddenChildCount = this.S.getHiddenChildCount();
            for (int i11 = 0; i11 < hiddenChildCount; i11++) {
                k0(this.S.V(i11));
            }
            int cachedChildCount = this.S.getCachedChildCount();
            for (int i12 = 0; i12 < cachedChildCount; i12++) {
                k0(this.S.P(i12));
            }
            int attachedScrapChildCount = this.S.getAttachedScrapChildCount();
            for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
                k0(this.S.O(i13));
            }
            this.S.getRecycledViewPool().a();
        }
        kg.g gVar = this.Z;
        if (gVar != null) {
            gVar.f16567g = true;
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.ObserversGroup observersGroup = this.F0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.F0 = null;
        }
        this.F0 = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.messagesDidLoad).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.boostByChannelCreated).add(NotificationCenter.storiesListUpdated);
        di.h7 storiesController = getMessagesController().getStoriesController();
        long j10 = this.f45022b;
        di.z6 A = storiesController.A(-j10, 2, -1, true);
        this.C0 = A;
        if (A != null) {
            this.D0 = A.o();
        }
        if (this.f45020a != null) {
            h0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(j10, this.classGuid, true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.F0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.F0 = null;
        }
        org.telegram.ui.ActionBar.e2[] e2VarArr = this.f45030g0;
        org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
        if (e2Var != null) {
            e2Var.dismiss();
            e2VarArr[0] = null;
        }
        di.z6 z6Var = this.C0;
        if (z6Var != null) {
            z6Var.z(this.D0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        b0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.po poVar = this.R;
            if (poVar != null) {
                poVar.i(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oi, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pi, false));
            }
            o0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w91.p0():void");
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
