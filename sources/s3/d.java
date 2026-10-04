package s3;

import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f46482a;
    public final long f46483b;
    public final List f46484c;

    public d(long j3, long j10, List list) {
        this.f46482a = j3;
        this.f46483b = j10;
        this.f46484c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f46482a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return a4.a.r(sb2, this.f46483b, " }");
    }
}
