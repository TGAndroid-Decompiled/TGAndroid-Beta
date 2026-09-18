package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;
public final class zy extends org.telegram.ui.ActionBar.j {
    public final fz f40359a;

    public zy(fz fzVar) {
        this.f40359a = fzVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        fz fzVar = this.f40359a;
        int i12 = fzVar.f33803w;
        ArrayList arrayList = fzVar.e;
        int i13 = fzVar.f33804x;
        if (i10 == -1) {
            if (fzVar.f33805y == null) {
                fzVar.Y();
            } else {
                fzVar.finishFragment();
            }
        } else if (i10 == 1 && fzVar.getParentActivity() != null) {
            ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
            }
            fzVar.getMessagesStorage().putWidgetDialogs(i13, arrayList2);
            SharedPreferences.Editor edit = fzVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
            i11 = ((org.telegram.ui.ActionBar.o2) fzVar).currentAccount;
            edit.putInt("account" + i13, i11);
            edit.putInt("type" + i13, i12);
            edit.commit();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(fzVar.getParentActivity());
            if (i12 == 0) {
                ChatsWidgetProvider.updateWidget(fzVar.getParentActivity(), appWidgetManager, i13);
            } else {
                ContactsWidgetProvider.updateWidget(fzVar.getParentActivity(), appWidgetManager, i13);
            }
            y0 y0Var = fzVar.f33805y;
            if (y0Var != null) {
                int i15 = y0Var.f39745a;
                Object obj = y0Var.f39746b;
                switch (i15) {
                    case 26:
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
            fzVar.Y();
        }
    }
}
