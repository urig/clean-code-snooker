#include "stdafx.h"
#include "Snooker.h"
namespace Snooker
{
	void Snooker::AddPlayer(string name)
	{

	}

	string Snooker::RecordMiss(string playerName)
	{
		return "";
	}

	int Snooker::RecordShot(string playerName, Sink shotResult)
	{
		return 0;
	}

	Score* Snooker::GetScore()
	{
		return new Score(0, 0);
	}
}