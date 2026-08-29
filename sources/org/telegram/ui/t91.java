package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
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
public final class t91 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public f91 A;
    public final qg.d A0;
    public f91 B;
    public final lg.a B0;
    public p91 C;
    public q81 C0;
    public f91 D;
    public final ArrayList D0;
    public f91 E;
    public final RectF E0;
    public f91 F;
    public final RectF F0;
    public f91 G;
    public f91 H;
    public f91 I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public org.telegram.ui.Components.xn N;
    public u81 O;
    public lg.k P;
    public f2.j0 Q;
    public final LruCache R;
    public org.telegram.ui.Components.aj0 S;
    public y81 T;
    public r81 U;
    public s91 V;
    public tf.f W;
    public LinearLayout X;
    public final boolean Y;
    public final boolean Z;
    public TLRPC.ChatFull f42588a;
    public final boolean f42589a0;
    public final long f42590b;
    public long f42591b0;
    public boolean f42592c;
    public long f42593c0;
    public f91 d;
    public final org.telegram.ui.ActionBar.c2[] f42594d0;
    public f91 f42595e;
    public nh.g1 f42596e0;
    public o91 f42597f;
    public wb f42598f0;
    public de f42599g0;
    public f91 h;
    public final boolean f42600h0;
    public pg0 f42601i0;
    public zg.b[] f42602j0;
    public int f42603k0;
    public final SparseIntArray f42604l0;
    public final SparseIntArray m0;
    public f91 f42605n;
    public final ArrayList f42606n0;
    public final ArrayList f42607o0;
    public final ArrayList f42608p0;
    public final ArrayList f42609q0;
    public f91 f42610r;
    public final ArrayList f42611r0;
    public f91 f42612s;
    public boolean f42613s0;
    public boolean f42614t0;
    public g91 f42615u0;
    public f91 v;
    public lh.k6 f42616v0;
    public f91 f42617w;
    public int f42618w0;
    public f91 f42619x;
    public final w5 f42620x0;
    public f91 f42621y;
    public final lg.e f42622y0;
    public final qg.d f42623z0;

    public t91(Bundle bundle) {
        super(bundle);
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.R = new LruCache(50);
        this.f42594d0 = new org.telegram.ui.ActionBar.c2[1];
        this.f42603k0 = -1;
        this.f42604l0 = new SparseIntArray();
        this.m0 = new SparseIntArray();
        this.f42606n0 = new ArrayList();
        this.f42607o0 = new ArrayList();
        this.f42608p0 = new ArrayList();
        this.f42609q0 = new ArrayList();
        this.f42611r0 = new ArrayList();
        this.f42614t0 = true;
        this.f42620x0 = new w5(this, 13);
        ArrayList arrayList = new ArrayList();
        this.D0 = arrayList;
        RectF rectF = new RectF();
        this.E0 = rectF;
        RectF rectF2 = new RectF();
        this.F0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = bundle.getLong("chat_id");
        this.f42590b = j10;
        this.Y = bundle.getBoolean("is_megagroup", false);
        this.Z = bundle.getBoolean("start_from_boosts", false);
        this.f42589a0 = bundle.getBoolean("start_from_monetization", false);
        this.f42600h0 = bundle.getBoolean("only_boosts", false);
        this.f42588a = getMessagesController().getChatFull(j10);
        qg.c cVar = new qg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f42622y0 = new lg.e(false);
            this.f42623z0 = new qg.d(null);
            qg.d dVar = new qg.d(null);
            this.A0 = dVar;
            lg.a aVar = new lg.a(dVar);
            this.B0 = aVar;
            aVar.f15225f = LiteMode.isEnabled(262144);
            return;
        }
        this.f42622y0 = null;
        this.f42623z0 = null;
        this.A0 = null;
        this.B0 = new lg.a(cVar);
    }

    public static void U(t91 t91Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(t91Var.currentAccount, arrayList2.get(i10), false, true));
            }
            t91Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new n81(t91Var, arrayList, 0));
    }

    public static void V(t91 t91Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
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
        ArrayList arrayList5 = t91Var.J;
        ArrayList arrayList6 = t91Var.K;
        ArrayList arrayList7 = t91Var.f42606n0;
        String str16 = "%";
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final f91[] f91VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            f91 f91Var = f91VarArr[2];
            if (f91Var != null) {
                f91Var.f38080n = true;
            }
            ?? obj = new Object();
            com.google.firebase.messaging.s a2 = o91.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            obj.f41025o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            obj.f41026p = (String) a2.f5185b;
            obj.f41027q = (String) a2.f5187e;
            obj.f41028r = ((Boolean) a2.f5186c).booleanValue();
            obj.f41029s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.s a10 = o91.a(tL_broadcastStats.reactions_per_story);
            obj.f41030t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            obj.f41031u = (String) a10.f5185b;
            obj.v = (String) a10.f5187e;
            obj.f41032w = ((Boolean) a10.f5186c).booleanValue();
            obj.f41033x = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.s a11 = o91.a(tL_broadcastStats.views_per_story);
            obj.f41034y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            obj.f41035z = (String) a11.f5185b;
            obj.A = (String) a11.f5187e;
            obj.B = ((Boolean) a11.f5186c).booleanValue();
            obj.C = ((Boolean) a11.d).booleanValue();
            com.google.firebase.messaging.s a12 = o91.a(tL_broadcastStats.shares_per_story);
            obj.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            obj.E = (String) a12.f5185b;
            obj.F = (String) a12.f5187e;
            obj.G = ((Boolean) a12.f5186c).booleanValue();
            obj.H = ((Boolean) a12.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i12 = (int) (d - d10);
            if (d10 == 0.0d) {
                abs5 = 0.0f;
            } else {
                abs5 = Math.abs((i12 / ((float) d10)) * 100.0f);
            }
            obj.f41013a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            obj.f41014b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i12 == 0 || abs5 == 0.0f) {
                i10 = i12;
                obj.f41015c = "";
            } else {
                int i13 = (int) abs5;
                if (abs5 == i13) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    if (i12 <= 0) {
                        str15 = "";
                    } else {
                        str15 = str3;
                    }
                    sb2.append(str15);
                    sb2.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    String sb3 = sb2.toString();
                    obj.f41015c = sb3 + " (" + i13 + "%)";
                    i10 = i12;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    if (i12 <= 0) {
                        str14 = "";
                    } else {
                        str14 = str3;
                    }
                    sb4.append(str14);
                    sb4.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    i10 = i12;
                    obj.f41015c = String.format(locale2, "%s (%.1f%s)", sb4.toString(), Float.valueOf(abs5), "%");
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
            int i14 = (int) (d11 - d12);
            if (d12 == 0.0d) {
                abs6 = 0.0f;
            } else {
                abs6 = Math.abs((i14 / ((float) d12)) * 100.0f);
            }
            obj.f41019i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            obj.f41020j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i14 != 0 && abs6 != 0.0f) {
                int i15 = (int) abs6;
                if (abs6 == i15) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    if (i14 <= 0) {
                        str13 = "";
                    } else {
                        str13 = str3;
                    }
                    sb5.append(str13);
                    sb5.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    String sb6 = sb5.toString();
                    obj.f41021k = sb6 + " (" + i15 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    if (i14 <= 0) {
                        str12 = "";
                    } else {
                        str12 = str3;
                    }
                    sb7.append(str12);
                    sb7.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    obj.f41021k = String.format(locale4, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f41021k = "";
            }
            if (i14 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.f41022l = z15;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i16 = (int) (d13 - d14);
            if (d14 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i16 / ((float) d14)) * 100.0f);
            }
            obj.f41016e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            obj.f41017f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i16 != 0 && abs7 != 0.0f) {
                int i17 = (int) abs7;
                if (abs7 == i17) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    if (i16 <= 0) {
                        str11 = "";
                    } else {
                        str11 = str3;
                    }
                    sb8.append(str11);
                    sb8.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    String sb9 = sb8.toString();
                    obj.f41018g = sb9 + " (" + i17 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb10 = new StringBuilder();
                    if (i16 <= 0) {
                        str10 = "";
                    } else {
                        str10 = str3;
                    }
                    sb10.append(str10);
                    sb10.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    obj.f41018g = String.format(locale6, "%s (%.1f%s)", sb10.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f41018g = "";
            }
            if (i16 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            obj.h = z16;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f9 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f41023m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i18 = (int) f9;
            if (f9 == i18) {
                Locale locale7 = Locale.ENGLISH;
                obj.f41024n = u3.c.d(i18, "%");
            } else {
                obj.f41024n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f9), "%");
            }
            t91Var.f42597f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            t91Var.f42591b0 = tL_statsDateRangeDays.max_date * 1000;
            t91Var.f42593c0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i21);
                int i22 = i21 + 1;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                ?? obj2 = new Object();
                obj2.f41601a = postInteractionCounters2;
                int i23 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str9 = str16;
                    i11 = i22;
                    t91Var.f42604l0.put(obj2.b(), i19);
                    i19++;
                } else {
                    i11 = i22;
                    arrayList4 = arrayList8;
                    str9 = str16;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    t91Var.f42608p0.add(obj2);
                    t91Var.m0.put(obj2.b(), i20);
                    i20++;
                }
                arrayList10 = arrayList11;
                str16 = str9;
                i21 = i11;
                arrayList8 = arrayList4;
                size = i23;
            }
            ArrayList arrayList12 = arrayList8;
            str = str16;
            AndroidUtilities.runOnUIThread(new n81(t91Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                t91Var.getMessagesStorage().getMessages(-t91Var.f42590b, 0L, false, arrayList12.size(), ((q91) arrayList12.get(0)).b(), 0, 0, t91Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            AndroidUtilities.runOnUIThread(new Runnable(t91Var) {
                public final t91 f40493b;

                {
                    this.f40493b = t91Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            t91 t91Var2 = this.f40493b;
                            t91Var2.getClass();
                            f91[] f91VarArr2 = f91VarArr;
                            t91Var2.d = f91VarArr2[0];
                            t91Var2.D = f91VarArr2[1];
                            t91Var2.E = f91VarArr2[2];
                            t91Var2.F = f91VarArr2[3];
                            t91Var2.G = f91VarArr2[4];
                            t91Var2.H = f91VarArr2[5];
                            t91Var2.f42595e = f91VarArr2[6];
                            t91Var2.I = f91VarArr2[7];
                            t91Var2.g0(f91VarArr2);
                            return;
                        default:
                            t91 t91Var3 = this.f40493b;
                            t91Var3.getClass();
                            f91[] f91VarArr3 = f91VarArr;
                            t91Var3.f42610r = f91VarArr3[0];
                            t91Var3.h = f91VarArr3[1];
                            t91Var3.f42595e = f91VarArr3[2];
                            t91Var3.f42605n = f91VarArr3[3];
                            t91Var3.d = f91VarArr3[4];
                            t91Var3.f42612s = f91VarArr3[5];
                            t91Var3.v = f91VarArr3[6];
                            t91Var3.f42617w = f91VarArr3[7];
                            t91Var3.f42619x = f91VarArr3[8];
                            t91Var3.f42621y = f91VarArr3[9];
                            t91Var3.A = f91VarArr3[10];
                            t91Var3.B = f91VarArr3[11];
                            t91Var3.g0(f91VarArr3);
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
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            final f91[] f91VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            f91 f91Var2 = f91VarArr2[6];
            if (f91Var2 != null) {
                f91Var2.f38080n = true;
            }
            f91 f91Var3 = f91VarArr2[7];
            if (f91Var3 != null) {
                f91Var3.f38081o = true;
            }
            ?? obj3 = new Object();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i24 = (int) (d15 - d16);
            if (d16 == 0.0d) {
                abs = 0.0f;
            } else {
                abs = Math.abs((i24 / ((float) d16)) * 100.0f);
            }
            obj3.f41329a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            obj3.f41330b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i24 != 0 && abs != 0.0f) {
                int i25 = (int) abs;
                if (abs == i25) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb11 = new StringBuilder();
                    if (i24 <= 0) {
                        str8 = "";
                    } else {
                        str8 = str3;
                    }
                    sb11.append(str8);
                    sb11.append(AndroidUtilities.formatWholeNumber(i24, 0));
                    String sb12 = sb11.toString();
                    obj3.f41331c = sb12 + " (" + i25 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb13 = new StringBuilder();
                    if (i24 <= 0) {
                        str7 = "";
                    } else {
                        str7 = str3;
                    }
                    sb13.append(str7);
                    sb13.append(AndroidUtilities.formatWholeNumber(i24, 0));
                    obj3.f41331c = String.format(locale9, "%s (%.1f%s)", sb13.toString(), Float.valueOf(abs), str);
                }
            } else {
                obj3.f41331c = "";
            }
            if (i24 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj3.d = z10;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i26 = (int) (d17 - d18);
            if (d18 == 0.0d) {
                abs2 = 0.0f;
            } else {
                abs2 = Math.abs((i26 / ((float) d18)) * 100.0f);
            }
            obj3.f41335i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            obj3.f41336j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i26 != 0 && abs2 != 0.0f) {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb14 = new StringBuilder();
                if (i26 <= 0) {
                    str6 = "";
                } else {
                    str6 = str3;
                }
                sb14.append(str6);
                sb14.append(AndroidUtilities.formatWholeNumber(i26, 0));
                String sb15 = sb14.toString();
                obj3.f41337k = sb15;
            } else {
                obj3.f41337k = "";
            }
            if (i26 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f41338l = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i27 = (int) (d19 - d20);
            if (d20 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i27 / ((float) d20)) * 100.0f);
            }
            obj3.f41339m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            obj3.f41340n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i27 != 0 && abs3 != 0.0f) {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb16 = new StringBuilder();
                if (i27 <= 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                sb16.append(str5);
                sb16.append(AndroidUtilities.formatWholeNumber(i27, 0));
                String sb17 = sb16.toString();
                obj3.f41341o = sb17;
            } else {
                obj3.f41341o = "";
            }
            if (i27 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.f41342p = z12;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i28 = (int) (d21 - d22);
            if (d22 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i28 / ((float) d22)) * 100.0f);
            }
            obj3.f41332e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            obj3.f41333f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i28 != 0 && abs4 != 0.0f) {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb18 = new StringBuilder();
                if (i28 <= 0) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                sb18.append(str4);
                sb18.append(AndroidUtilities.formatWholeNumber(i28, 0));
                String sb19 = sb18.toString();
                obj3.f41334g = sb19;
            } else {
                obj3.f41334g = "";
            }
            if (i28 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj3.h = z13;
            t91Var.C = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            t91Var.f42591b0 = tL_statsDateRangeDays2.max_date * 1000;
            t91Var.f42593c0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i29 = 0;
                while (i29 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i29);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f40500a = m91.a(tL_statsGroupTopPoster.user_id, arrayList14);
                    StringBuilder sb20 = new StringBuilder();
                    int i30 = tL_statsGroupTopPoster.messages;
                    if (i30 > 0) {
                        sb20.append(LocaleController.formatPluralString("messages", i30, new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb20.length() > 0) {
                            sb20.append(", ");
                        }
                        sb20.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster.avg_chars, new Object[0])));
                    }
                    obj4.f40501b = sb20.toString();
                    if (arrayList2.size() < 10) {
                        arrayList3 = arrayList2;
                        arrayList3.add(obj4);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(obj4);
                    i29++;
                    arrayList2 = arrayList3;
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
                for (int i31 = 0; i31 < tL_megagroupStats.top_admins.size(); i31++) {
                    ArrayList arrayList19 = t91Var.M;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f40500a = m91.a(tL_statsGroupTopAdmin.user_id, arrayList20);
                    StringBuilder sb21 = new StringBuilder();
                    int i32 = tL_statsGroupTopAdmin.deleted;
                    if (i32 > 0) {
                        sb21.append(LocaleController.formatPluralString("Deletions", i32, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb21.length() > 0) {
                            sb21.append(", ");
                        }
                        sb21.append(LocaleController.formatPluralString("Bans", tL_statsGroupTopAdmin.banned, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb21.length() > 0) {
                            sb21.append(", ");
                        }
                        sb21.append(LocaleController.formatPluralString("Restrictions", tL_statsGroupTopAdmin.kicked, new Object[0]));
                    }
                    obj5.f40501b = sb21.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = t91Var.L;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f40500a = m91.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        obj6.f40501b = LocaleController.formatPluralString("Invitations", i34, new Object[0]);
                    } else {
                        obj6.f40501b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable(t91Var) {
                public final t91 f40493b;

                {
                    this.f40493b = t91Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            t91 t91Var2 = this.f40493b;
                            t91Var2.getClass();
                            f91[] f91VarArr22 = f91VarArr2;
                            t91Var2.d = f91VarArr22[0];
                            t91Var2.D = f91VarArr22[1];
                            t91Var2.E = f91VarArr22[2];
                            t91Var2.F = f91VarArr22[3];
                            t91Var2.G = f91VarArr22[4];
                            t91Var2.H = f91VarArr22[5];
                            t91Var2.f42595e = f91VarArr22[6];
                            t91Var2.I = f91VarArr22[7];
                            t91Var2.g0(f91VarArr22);
                            return;
                        default:
                            t91 t91Var3 = this.f40493b;
                            t91Var3.getClass();
                            f91[] f91VarArr3 = f91VarArr2;
                            t91Var3.f42610r = f91VarArr3[0];
                            t91Var3.h = f91VarArr3[1];
                            t91Var3.f42595e = f91VarArr3[2];
                            t91Var3.f42605n = f91VarArr3[3];
                            t91Var3.d = f91VarArr3[4];
                            t91Var3.f42612s = f91VarArr3[5];
                            t91Var3.v = f91VarArr3[6];
                            t91Var3.f42617w = f91VarArr3[7];
                            t91Var3.f42619x = f91VarArr3[8];
                            t91Var3.f42621y = f91VarArr3[9];
                            t91Var3.A = f91VarArr3[10];
                            t91Var3.B = f91VarArr3[11];
                            t91Var3.g0(f91VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void W(t91 t91Var) {
        float f9;
        RectF rectF = t91Var.F0;
        lg.e eVar = t91Var.f42622y0;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null && t91Var.fragmentView != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (t91Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
            t91Var.E0.set(0.0f, -dp, t91Var.fragmentView.getMeasuredWidth(), t91Var.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), t91Var.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f9 = 0.0f;
            } else {
                f9 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f9);
            eVar.g(2, t91Var.D0);
            eVar.e(t91Var.C0, t91Var.fragmentView.getMeasuredWidth(), t91Var.fragmentView.getMeasuredHeight());
        }
    }

    public static void Y(t91 t91Var) {
        View currentView = t91Var.f42596e0.getCurrentView();
        wb wbVar = t91Var.f42598f0;
        if (currentView == wbVar) {
            t91Var.actionBar.setAdaptiveBackground(wbVar.B);
            return;
        }
        de deVar = t91Var.f42599g0;
        if (currentView == deVar) {
            t91Var.actionBar.setAdaptiveBackground(deVar.W0);
        } else {
            t91Var.actionBar.setAdaptiveBackground(t91Var.O);
        }
    }

    public static void Z(t91 t91Var) {
        s91 s91Var = t91Var.V;
        if (s91Var != null) {
            s91Var.f42328b = true;
        }
        int childCount = t91Var.O.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = t91Var.O.getChildAt(i10);
            if (childAt instanceof e91) {
                ((e91) childAt).f37425b.f48278p0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.o2 d0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f22392id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f22392id);
        if (chatFull != null && (chatFull.can_view_stats || chatFull.can_view_stars_revenue)) {
            return new t91(bundle);
        }
        return new v5(-chat.f22392id);
    }

    public static uf.b e0(JSONObject jSONObject, int i10, boolean z10) {
        if (i10 == 0) {
            return new uf.b(jSONObject);
        }
        if (i10 == 1) {
            return new uf.b(jSONObject);
        }
        if (i10 == 2) {
            ?? bVar = new uf.b(jSONObject);
            int length = ((uf.a) bVar.d.get(0)).f49190a.length;
            int size = bVar.d.size();
            bVar.f49207l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                bVar.f49207l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = bVar.f49207l;
                    jArr[i11] = jArr[i11] + ((uf.a) bVar.d.get(i12)).f49190a[i11];
                }
            }
            bVar.f49208m = new SegmentTree(bVar.f49207l);
            return bVar;
        } else if (i10 == 4) {
            ?? bVar2 = new uf.b(jSONObject);
            if (z10) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j10 = 0;
                for (int i13 = 0; i13 < bVar2.d.size(); i13++) {
                    int length2 = bVar2.f49197a.length;
                    for (int i14 = 0; i14 < length2; i14++) {
                        long j11 = ((uf.a) bVar2.d.get(i13)).f49190a[i14];
                        jArr2[i13] = jArr2[i13] + j11;
                        if (j11 == 0) {
                            iArr[i13] = iArr[i13] + 1;
                        }
                    }
                    j10 += jArr2[i13];
                }
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < bVar2.d.size(); i15++) {
                    if (jArr2[i15] / j10 < 0.01d && iArr[i15] > bVar2.f49197a.length / 2.0f) {
                        arrayList.add((uf.a) bVar2.d.get(i15));
                    }
                }
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    bVar2.d.remove((uf.a) obj);
                }
            }
            int length3 = ((uf.a) bVar2.d.get(0)).f49190a.length;
            int size3 = bVar2.d.size();
            bVar2.f49209l = new long[length3];
            for (int i17 = 0; i17 < length3; i17++) {
                bVar2.f49209l[i17] = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    long[] jArr3 = bVar2.f49209l;
                    jArr3[i17] = jArr3[i17] + ((uf.a) bVar2.d.get(i18)).f49190a[i17];
                }
            }
            new SegmentTree(bVar2.f49209l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static f91 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        f91 f91Var = new f91(str, i10);
        f91Var.f38079m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                uf.b e02 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                f91Var.d = e02;
                if (e02 != null) {
                    e02.h = statsGraph.rate;
                }
                f91Var.f38074g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e02 == null || (jArr2 = e02.f49197a) == null || jArr2.length < 2) {
                    f91Var.f38078l = true;
                }
                if (i10 == 4 && e02 != null && (jArr = e02.f49197a) != null && jArr.length > 0) {
                    long j10 = jArr[jArr.length - 1];
                    f91Var.f38072e = new uf.e(e02, j10);
                    f91Var.f38071c = j10;
                    return f91Var;
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            f91Var.f38073f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return f91Var;
    }

    public static void k0(f91 f91Var, ArrayList arrayList, org.telegram.ui.ActionBar.h6 h6Var) {
        uf.b bVar;
        int i10;
        if (f91Var != null && (bVar = f91Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                uf.a aVar = (uf.a) obj;
                int i12 = aVar.f49195g;
                if (i12 >= 0) {
                    if (!org.telegram.ui.ActionBar.g6.c1(i12)) {
                        int i13 = aVar.f49195g;
                        if (org.telegram.ui.ActionBar.g6.I == org.telegram.ui.ActionBar.g6.J) {
                            i10 = aVar.f49196i;
                        } else {
                            i10 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.g6.u1(i13, i10, false);
                        org.telegram.ui.ActionBar.g6.nl[aVar.f49195g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, aVar.f49195g));
                }
            }
        }
    }

    public static void l0(View view) {
        if (view instanceof e91) {
            ((e91) view).d();
        } else if (view instanceof org.telegram.ui.Cells.x6) {
            org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false)), org.telegram.ui.ActionBar.g6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23028b7), 0, 0);
            jqVar.f29792w = true;
            view.setBackground(jqVar);
        } else if (view instanceof vf.c) {
            ((vf.c) view).a();
        } else if (view instanceof n91) {
            int i10 = n91.d;
            ((n91) view).b();
        }
    }

    public final void c0() {
        int i10;
        int i11 = AndroidUtilities.navigationBarHeight;
        int i12 = AndroidUtilities.statusBarHeight;
        pg0 pg0Var = this.f42601i0;
        if (pg0Var != null) {
            pg0Var.setTranslationY(-i11);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i12;
        if (this.f42592c) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        int i13 = i10 + i11;
        u81 u81Var = this.O;
        if (u81Var != null) {
            u81Var.setPadding(0, currentActionBarHeight, 0, i13);
        }
        wb wbVar = this.f42598f0;
        if (wbVar != null) {
            wbVar.B.setPadding(0, currentActionBarHeight, 0, i13);
        }
        de deVar = this.f42599g0;
        if (deVar != null) {
            deVar.W0.setPadding(0, currentActionBarHeight, 0, i13);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.ActionBar.l createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        boolean z11;
        FrameLayout frameLayout;
        boolean z12;
        int i10;
        float f9;
        String str;
        boolean z13;
        t91 t91Var = this;
        t91Var.W = new tf.f(null);
        MessagesController messagesController = MessagesController.getInstance(t91Var.currentAccount);
        long j10 = t91Var.f42590b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(t91Var.currentAccount).getChatFull(j10);
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
            arrayList.add(zg.b.b(context, t91Var.resourceProvider, zg.a.E, R.string.Statistics));
        }
        arrayList.add(zg.b.b(context, t91Var.resourceProvider, zg.a.BOOSTS, R.string.Boosts));
        if (z11) {
            arrayList.add(zg.b.b(context, t91Var.resourceProvider, zg.a.MONETIZATION, R.string.Monetization));
        }
        t91Var.f42602j0 = (zg.b[]) arrayList.toArray(new zg.b[0]);
        pg0 pg0Var = new pg0(context, t91Var.resourceProvider);
        t91Var.f42601i0 = pg0Var;
        pg0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i11 = 0;
        while (true) {
            zg.b[] bVarArr = t91Var.f42602j0;
            if (i11 >= bVarArr.length) {
                break;
            }
            zg.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new jh.y0(t91Var, i11, 24));
            t91Var.f42601i0.addView(t91Var.f42602j0[i11]);
            t91Var.f42601i0.i(bVar, true, false);
            i11++;
        }
        t91Var.f42596e0 = new nh.g1(t91Var, t91Var.getParentActivity(), 6);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (isBoostSupported) {
            t91Var.f42598f0 = new wb(t91Var, -j10, t91Var.getResourceProvider());
        }
        if (z11) {
            Activity parentActivity = t91Var.getParentActivity();
            int i12 = t91Var.currentAccount;
            long j11 = -j10;
            org.telegram.ui.ActionBar.c6 resourceProvider = getResourceProvider();
            if (ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue) {
                z13 = true;
            } else {
                z13 = false;
            }
            frameLayout = frameLayout2;
            de deVar = new de(parentActivity, this, i12, j11, resourceProvider, z13, chatFull.can_view_stars_revenue);
            t91Var = this;
            t91Var.f42599g0 = deVar;
            deVar.setActionBar(t91Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z14 = z10;
        FrameLayout frameLayout3 = frameLayout;
        t91Var.f42596e0.setAdapter(new t81(t91Var, z14, isBoostSupported, z11, frameLayout3));
        boolean z15 = t91Var.f42600h0;
        if (isBoostSupported && !z15) {
            z12 = true;
        } else {
            z12 = false;
        }
        t91Var.f42592c = z12;
        if (z12 && t91Var.Z) {
            t91Var.f42596e0.setPosition(z14 ? 1 : 0);
        } else if (z12 && t91Var.f42589a0) {
            nh.g1 g1Var = t91Var.f42596e0;
            if (!z15 && isBoostSupported) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            g1Var.setPosition((z14 ? 1 : 0) + i10);
        }
        t91Var.m0(t91Var.f42596e0.getCurrentPosition(), false);
        ih.j4 j4Var = new ih.j4(t91Var, t91Var.getParentActivity(), 9);
        t91Var.actionBar.setDrawBlurBackground(j4Var);
        j4Var.setBackgroundColor(t91Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7));
        sg.i iVar = new sg.i(j4Var);
        lg.a aVar = t91Var.B0;
        aVar.d = iVar;
        aVar.f15224e = j4Var;
        j4Var.addView(t91Var.f42596e0, i7.f6.g());
        j4Var.addView(t91Var.actionBar);
        if (t91Var.f42592c) {
            j4Var.addView(t91Var.f42601i0, i7.f6.e(344, 72, 81));
            t91Var.setBulletinDelegate(new eg.x(14));
        }
        t91Var.fragmentView = j4Var;
        u81 u81Var = new u81(t91Var, context);
        t91Var.O = u81Var;
        u81Var.setSections(true);
        t91Var.O.setClipToPadding(false);
        u81 u81Var2 = t91Var.O;
        Objects.requireNonNull(u81Var2);
        t91Var.P = new lg.k(u81Var2, j4Var, new ms(u81Var2, 1));
        wb wbVar = t91Var.f42598f0;
        if (wbVar != null) {
            org.telegram.ui.Components.jl0 jl0Var = wbVar.B;
            Objects.requireNonNull(jl0Var);
            wbVar.C = new lg.k(jl0Var, j4Var, new ms(jl0Var, 0));
            t91Var.f42598f0.B.j(new s81(t91Var, 1));
        }
        de deVar2 = t91Var.f42599g0;
        if (deVar2 != null) {
            org.telegram.ui.Components.u51 u51Var = deVar2.W0;
            Objects.requireNonNull(u51Var);
            deVar2.X0 = new lg.k(u51Var, j4Var, new t8(u51Var, 0));
            t91Var.f42599g0.W0.j(new s81(t91Var, 2));
        }
        t91Var.C0 = new q81(t91Var, j4Var);
        t91Var.O.p1();
        LinearLayout linearLayout = new LinearLayout(context);
        t91Var.X = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        t91Var.S = imageView;
        imageView.setAutoRepeat(true);
        t91Var.S.f(R.raw.statistic_preload, 120, 120, null);
        t91Var.S.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.g6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        textView.setTag(Integer.valueOf(i13));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.g6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        textView2.setTag(Integer.valueOf(i14));
        b.i(R.string.LoadingStatsDescription, textView2, 1);
        t91Var.X.addView(t91Var.S, i7.f6.t(120, 120, 1, 0, 0, 0, 20));
        t91Var.X.addView(textView, i7.f6.t(-2, -2, 1, 0, 0, 0, 10));
        t91Var.X.addView(textView2, i7.f6.q(-2, -2, 1));
        frameLayout3.addView(t91Var.X, i7.f6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (t91Var.T == null) {
            t91Var.T = new y81(t91Var);
        }
        t91Var.O.setAdapter(t91Var.T);
        f2.j0 j0Var = new f2.j0();
        t91Var.Q = j0Var;
        t91Var.O.setLayoutManager(j0Var);
        t91Var.U = new f2.l();
        t91Var.O.setItemAnimator(null);
        t91Var.O.j(new s81(t91Var, 0));
        t91Var.O.setOnItemClickListener(new d21(t91Var, 5));
        t91Var.O.setOnItemLongClickListener(new zk0(t91Var, 18));
        frameLayout3.addView(t91Var.O);
        org.telegram.ui.Components.xn xnVar = new org.telegram.ui.Components.xn(context, null, false, null);
        t91Var.N = xnVar;
        xnVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        t91Var.N.getAvatarImageView().setScaleX(0.9f);
        t91Var.N.getAvatarImageView().setScaleY(0.9f);
        t91Var.N.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.l lVar = t91Var.actionBar;
        org.telegram.ui.Components.xn xnVar2 = t91Var.N;
        if (!t91Var.inPreviewMode) {
            f9 = 50.0f;
        } else {
            f9 = 0.0f;
        }
        lVar.addView(xnVar2, 0, i7.f6.d(-2, -1.0f, 51, f9, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = t91Var.getMessagesController().getChat(Long.valueOf(j10));
        t91Var.N.setChatAvatar(chat2);
        org.telegram.ui.Components.xn xnVar3 = t91Var.N;
        if (chat2 == null) {
            str = "";
        } else {
            str = chat2.title;
        }
        xnVar3.setTitle(str);
        org.telegram.ui.Components.xn xnVar4 = t91Var.N;
        if (xnVar4.getSubtitleTextView() != null) {
            xnVar4.getSubtitleTextView().setVisibility(8);
        }
        th.y(false, t91Var.actionBar);
        t91Var.actionBar.setActionBarMenuOnItemClick(new al0(t91Var, 18));
        t91Var.N.i(org.telegram.ui.ActionBar.g6.w0(null, i13, false), org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        t91Var.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i13, false), false);
        t91Var.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i13, false), true);
        t91Var.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23452z8, false), false);
        t91Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        boolean z16 = t91Var.f42614t0;
        w5 w5Var = t91Var.f42620x0;
        if (z16) {
            t91Var.X.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(w5Var, 500L);
            t91Var.X.setVisibility(0);
            t91Var.O.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            t91Var.X.setVisibility(8);
            t91Var.O.setVisibility(0);
        }
        ng.d c3 = aVar.c(t91Var.f42601i0, pg.a.f(t91Var.resourceProvider), false);
        c3.p(AndroidUtilities.dp(28.0f));
        c3.o(AndroidUtilities.dp(7.666f));
        t91Var.f42601i0.setBackground(c3);
        t91Var.c0();
        t91Var.f42615u0 = new g91(t91Var.T, t91Var.Q);
        return t91Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.o2 o2Var;
        org.telegram.ui.ActionBar.o2 o2Var2;
        org.telegram.ui.ActionBar.o2 o2Var3 = null;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((lh.k6) objArr[0]) == this.f42616v0) {
                j0();
                o0();
                if (this.T != null) {
                    this.O.setItemAnimator(null);
                    this.f42615u0.f();
                }
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.j(2, fragmentStack);
                } else {
                    o2Var = null;
                }
                if (o2Var instanceof ko) {
                    ((ActionBarLayout) getParentLayout()).a0(o2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    o2Var2 = (org.telegram.ui.ActionBar.o2) j7.l1.j(2, fragmentStack2);
                } else {
                    o2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        o2Var3 = (org.telegram.ui.ActionBar.o2) j7.l1.j(3, fragmentStack2);
                    }
                    if (o2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).a0(o2Var2, false);
                    }
                    finishFragment();
                    if (o2Var3 instanceof tn) {
                        eg.s.f(o2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (o2Var2 instanceof ProfileActivity) {
                    eg.s.f(o2Var2, chat, false);
                }
            }
        } else if (i10 == NotificationCenter.messagesDidLoad) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i13 = 0;
                while (true) {
                    arrayList = this.f42606n0;
                    if (i13 >= size) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                    int i14 = this.f42604l0.get(messageObject.getId(), -1);
                    if (i14 >= 0 && ((q91) arrayList.get(i14)).b() == messageObject.getId()) {
                        if (messageObject.deleted) {
                            arrayList3.add((q91) arrayList.get(i14));
                        } else {
                            ((q91) arrayList.get(i14)).f41602b = messageObject;
                        }
                    }
                    i13++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f42607o0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    q91 q91Var = (q91) arrayList.get(i12);
                    if (q91Var.f41602b == null) {
                        this.f42603k0 = q91Var.b();
                        break;
                    } else {
                        arrayList4.add(q91Var);
                        i12++;
                    }
                }
                if (arrayList4.size() < 20) {
                    h0();
                }
                o0();
                if (this.T != null) {
                    this.O.setItemAnimator(null);
                    this.f42615u0.f();
                }
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22393id == this.f42590b && this.f42588a == null) {
                this.f42588a = chatFull;
                i0();
            }
        }
    }

    public final void g0(f91[] f91VarArr) {
        y81 y81Var = this.T;
        if (y81Var != null) {
            y81Var.E();
            this.O.setItemAnimator(null);
            this.T.l();
        }
        this.f42614t0 = false;
        LinearLayout linearLayout = this.X;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            AndroidUtilities.cancelRunOnUIThread(this.f42620x0);
            this.X.animate().alpha(0.0f).setDuration(230L).setListener(new e50(this, 29));
            this.O.setVisibility(0);
            this.O.setAlpha(0.0f);
            this.O.animate().alpha(1.0f).setDuration(230L).start();
            for (f91 f91Var : f91VarArr) {
                if (f91Var != null && f91Var.d == null && f91Var.f38073f != null) {
                    f91Var.a(this.currentAccount, this.classGuid, this.f42588a.stats_dc, new org.telegram.ui.Components.g51(1, this, f91Var));
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.h5 h5Var;
        f91 f91Var;
        f91 f91Var2;
        rx0 rx0Var = new rx0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23009a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.f23169j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.y7.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.y7.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.y7.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.y7.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.y7.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{vf.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        View view2 = null;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.f23133h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.f23450z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.f23452z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.f23028b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.f23418x6));
        int i13 = org.telegram.ui.ActionBar.g6.f23279p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, i13));
        org.telegram.ui.Components.xn xnVar = this.N;
        if (xnVar != null) {
            h5Var = xnVar.getTitleTextView();
        } else {
            h5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(h5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.Oi));
        org.telegram.ui.Components.xn xnVar2 = this.N;
        if (xnVar2 != null) {
            view2 = xnVar2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(view2, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.g6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23223m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23365u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23383v6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.Y) {
            for (int i14 = 0; i14 < 6; i14++) {
                if (i14 == 0) {
                    f91Var2 = this.d;
                } else if (i14 == 1) {
                    f91Var2 = this.D;
                } else if (i14 == 2) {
                    f91Var2 = this.E;
                } else if (i14 == 3) {
                    f91Var2 = this.F;
                } else if (i14 == 4) {
                    f91Var2 = this.G;
                } else {
                    f91Var2 = this.H;
                }
                k0(f91Var2, arrayList, rx0Var);
            }
        } else {
            for (int i15 = 0; i15 < 12; i15++) {
                if (i15 == 0) {
                    f91Var = this.d;
                } else if (i15 == 1) {
                    f91Var = this.h;
                } else if (i15 == 2) {
                    f91Var = this.f42605n;
                } else if (i15 == 3) {
                    f91Var = this.f42610r;
                } else if (i15 == 4) {
                    f91Var = this.f42612s;
                } else if (i15 == 5) {
                    f91Var = this.v;
                } else if (i15 == 6) {
                    f91Var = this.f42619x;
                } else if (i15 == 7) {
                    f91Var = this.f42595e;
                } else if (i15 == 8) {
                    f91Var = this.f42617w;
                } else if (i15 == 9) {
                    f91Var = this.f42621y;
                } else if (i15 == 10) {
                    f91Var = this.A;
                } else {
                    f91Var = this.B;
                }
                k0(f91Var, arrayList, rx0Var);
            }
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f22430id = new ArrayList<>();
        ArrayList arrayList = this.f42606n0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.f42604l0.get(this.f42603k0); i11 < size; i11++) {
            if (((q91) arrayList.get(i11)).f41602b == null) {
                tL_channels_getMessages.f22430id.add(Integer.valueOf(((q91) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.f42590b);
        this.f42613s0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new p81(this, 0));
    }

    public final void i0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f42600h0) {
            return;
        }
        boolean z10 = this.Y;
        long j10 = this.f42590b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new p81(this, 1), null, null, 0, this.f42588a.stats_dc, 1, true), this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false)) <= 0.699999988079071d) {
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
        nh.g1 g1Var = this.f42596e0;
        if (g1Var != null && (g1Var.f35259b != 0 || g1Var.f35260c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0() {
        ArrayList arrayList = this.f42609q0;
        arrayList.clear();
        ArrayList arrayList2 = this.f42608p0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            q91 q91Var = (q91) obj;
            MessageObject f9 = this.f42616v0.f(q91Var.b());
            if (f9 != null) {
                q91Var.f41602b = f9;
                arrayList.add(q91Var);
            }
        }
        this.m0.clear();
        arrayList2.clear();
    }

    public final void m0(int i10, boolean z10) {
        boolean z11;
        int i11 = 0;
        while (true) {
            zg.b[] bVarArr = this.f42602j0;
            if (i11 < bVarArr.length) {
                zg.b bVar = bVarArr[i11];
                if (i11 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.e(z11, z10);
                i11++;
            } else {
                return;
            }
        }
    }

    public final void n0(float f9, boolean z10) {
        for (int i10 = 0; i10 < this.f42602j0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f9));
            zg.b bVar = this.f42602j0[i10];
            bVar.F = max;
            bVar.E = z10;
            bVar.invalidate();
        }
        this.f42601i0.invalidate();
    }

    public final void o0() {
        ArrayList arrayList = this.f42611r0;
        arrayList.clear();
        arrayList.addAll(this.f42607o0);
        arrayList.addAll(this.f42609q0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.ui.Components.z0(1))));
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        lh.s6 storiesController = getMessagesController().getStoriesController();
        long j10 = this.f42590b;
        lh.k6 A = storiesController.A(-j10, 2, -1, true);
        this.f42616v0 = A;
        if (A != null) {
            this.f42618w0 = A.o();
        }
        if (this.f42588a != null) {
            i0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(j10, this.classGuid, true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesListUpdated);
        org.telegram.ui.ActionBar.c2[] c2VarArr = this.f42594d0;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
            c2VarArr[0] = null;
        }
        lh.k6 k6Var = this.f42616v0;
        if (k6Var != null) {
            k6Var.z(this.f42618w0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c0();
    }
}
