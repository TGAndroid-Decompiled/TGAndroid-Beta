package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;
public final class wy extends org.telegram.ui.ActionBar.j {
    public final cz f39470a;

    public wy(cz czVar) {
        this.f39470a = czVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        cz czVar = this.f39470a;
        int i12 = czVar.f32820w;
        ArrayList arrayList = czVar.e;
        int i13 = czVar.f32821x;
        if (i10 == -1) {
            if (czVar.f32822y == null) {
                czVar.Y();
            } else {
                czVar.finishFragment();
            }
        } else if (i10 == 1 && czVar.getParentActivity() != null) {
            ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
            }
            czVar.getMessagesStorage().putWidgetDialogs(i13, arrayList2);
            SharedPreferences.Editor edit = czVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
            i11 = ((org.telegram.ui.ActionBar.o2) czVar).currentAccount;
            edit.putInt("account" + i13, i11);
            edit.putInt("type" + i13, i12);
            edit.commit();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(czVar.getParentActivity());
            if (i12 == 0) {
                ChatsWidgetProvider.updateWidget(czVar.getParentActivity(), appWidgetManager, i13);
            } else {
                ContactsWidgetProvider.updateWidget(czVar.getParentActivity(), appWidgetManager, i13);
            }
            a1 a1Var = czVar.f32822y;
            if (a1Var != null) {
                int i15 = a1Var.f31936a;
                Object obj = a1Var.f31937b;
                switch (i15) {
                    case 27:
                        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) obj;
                        int i16 = ChatsWidgetConfigActivity.F;
                        Intent intent = new Intent();
                        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.E);
                        chatsWidgetConfigActivity.setResult(-1, intent);
                        chatsWidgetConfigActivity.finish();
                        return;
                    default:
                        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) obj;
                        int i17 = ContactsWidgetConfigActivity.F;
                        Intent intent2 = new Intent();
                        intent2.putExtra("appWidgetId", contactsWidgetConfigActivity.E);
                        contactsWidgetConfigActivity.setResult(-1, intent2);
                        contactsWidgetConfigActivity.finish();
                        return;
                }
            }
            czVar.Y();
        }
    }
}
