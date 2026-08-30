package tf;

import org.telegram.messenger.R;
public enum w {
    All(0, R.string.SearchMessagesFilterAll, R.string.SearchMessagesFilterAllFrom),
    Private(8, R.string.SearchMessagesFilterPrivate, R.string.SearchMessagesFilterPrivateFrom),
    Groups(4, R.string.SearchMessagesFilterGroup, R.string.SearchMessagesFilterGroupFrom),
    Channels(2, R.string.SearchMessagesFilterChannels, R.string.SearchMessagesFilterChannelsFrom);
    
    public final int f44872a;
    public final int f44873b;
    public final int f44874c;

    w(int i10, int i11, int i12) {
        this.f44872a = i10;
        this.f44873b = i11;
        this.f44874c = i12;
    }
}
